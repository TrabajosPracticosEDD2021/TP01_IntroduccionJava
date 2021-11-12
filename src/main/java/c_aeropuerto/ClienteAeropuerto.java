package c_aeropuerto;

import java.time.LocalDateTime;

public class ClienteAeropuerto {

	/**
	 * Imprima los datos del array pasado por parámetro.
	 *
	 */
	private static void imprimir(Vuelo[] vuelosArray) {
		for (Vuelo vuelo : vuelosArray) {
			System.out.println(vuelo);
		}
	}

	/**
	 * Que retorne todos los vuelos cuyo destino es el aeropuerto de Concordia.
	 *
	 */
	private static Vuelo[] arribos(Vuelo[] vuelosArray) {

		int auxIndex = 0, auxCont = 0;

		for (Vuelo vuelo : vuelosArray) {
			if (vuelo.getCiudadDestino().getCodIATA().toUpperCase().equals("coc".toUpperCase())) {
				auxCont++;
			}
		}

		Vuelo[] arrayVuelosConcor = new Vuelo[auxCont];
		for (Vuelo vuelo : vuelosArray) {
			if (vuelo.getCiudadDestino().getCodIATA().toUpperCase().equals("coc".toUpperCase())) {
				arrayVuelosConcor[auxIndex] = vuelo;
				auxIndex++;
			}
		}

		return arrayVuelosConcor;
	}

	/**
	 * Que retorne todos los vuelos que salen del aeropuerto de Concordia
	 *
	 */
	private static Vuelo[] partidas(Vuelo[] vuelosArray) {

		int auxIndex = 0, auxCont = 0;

		for (Vuelo vuelo : vuelosArray) {
			if (vuelo.getCiudadDestino().getCodIATA().toUpperCase().equals("coc".toUpperCase())) {// .toUpperCase()
				auxCont++;
			}
		}

		Vuelo[] arrayVuelosConcor = new Vuelo[auxCont];
		for (Vuelo vuelo : vuelosArray) {
			if (vuelo.getCiudadDestino().getCodIATA().toUpperCase().equals("coc".toUpperCase())) {// .toUpperCase()
				arrayVuelosConcor[auxIndex] = vuelo;
				auxIndex++;
			}
		}

		return arrayVuelosConcor;
	}

	public static void main(String[] args) {
		
		Vuelo vuelo1 = 	new Vuelo(3, new LineaAerea(20, "Aerolíneas Argentinas"), 
				new Ciudad("asd", "Parana"), 
				new Ciudad("coc", "Concoridia"), 
				LocalDateTime.of(2021, 3, 23, 21, 12), 
				LocalDateTime.of(2021, 2, 23, 21, 12));
		
		Vuelo vuelo2 = 	new Vuelo(3, new LineaAerea(20, "Austral"),
				new Ciudad("ers", "BSAS"), 
				new Ciudad("llk", "Concoridia"), 
				LocalDateTime.of(2021, 2, 23, 21, 12), 
				LocalDateTime.of(2021, 2, 23, 21, 12));
		
		Vuelo vuelo3 = 	new Vuelo(3, new LineaAerea(11, "Andes"), 
				new Ciudad("coc", "Concoridia"), 
				new Ciudad("coc", "Concoridia"), 
				LocalDateTime.of(2021, 2, 23, 21, 12), 
				LocalDateTime.of(2021, 2, 23, 21, 12));
		
		Vuelo vuelo4 = 	new Vuelo(3, new LineaAerea(41, "Avianca"), 
				new Ciudad("coc", "Concoridia"), 
				new Ciudad("sxv", "Concoridia"), 
				LocalDateTime.of(2021, 2, 23, 21, 12), 
				LocalDateTime.of(2021, 2, 23, 21, 12));
		
		Vuelo vuelo5 = 	new Vuelo(3, new LineaAerea(30, "Aerolíneas Argentinas"), 
				new Ciudad("coc", "Concoridia"), 
				new Ciudad("ccx", "Concoridia"), 
				LocalDateTime.of(2021, 2, 23, 21, 12), 
				LocalDateTime.of(2021, 2, 23, 21, 12));
		
		Vuelo[] vuelos = new Vuelo[5];
		vuelos[0] = vuelo1;
		vuelos[1] = vuelo2;
		vuelos[2] = vuelo3;
		vuelos[3] = vuelo4;
		vuelos[4] = vuelo5;
		
		System.out.println("IMPRIMIR TODO: ");
		imprimir(vuelos);
		
		System.out.println("\n # # # # # # # # # # # #\n");
		System.out.println("DESTINO CONCORDIA: ");
		imprimir(arribos(vuelos));

		System.out.println("\n # # # # # # # # # # # #\n");
		System.out.println("ORIGEN CONCORDIA: ");
		imprimir(partidas(vuelos));
		
		
		
		
	}
}
