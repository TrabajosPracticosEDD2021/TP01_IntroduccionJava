package b_veterinaria;

public class ClienteBichitos {
	
	private static final int ANIO_ACTUAL = 2021;
	
	/**
	 * Imprime por pantalla los datos contenidos en el array pasado por parámetro.
	 * @param
	 */	
	private static void imprimir(Mascota [] param) {
		for (Mascota mascota : param) {
			System.out.println(mascota.toString());
		}
	}
	
	/**
	 * Devuelve las mascotas con más de 13 años de edad.
	 * @return
	 */
	private static Mascota [] filtrarGerontes(Mascota [] param) {
		
		int auxCont = 0, auxIndex = 0;
		
		for (Mascota mascota : param) {
			if (calcularEdad(mascota.getAnioNacimiento()) > 13) {
				auxCont++;
			}
		}
		
		Mascota [] mascotasViejitas = new Mascota[auxCont];
		for (Mascota mascota : param) {
			if (calcularEdad(mascota.getAnioNacimiento()) > 13) {
				mascotasViejitas[auxIndex] = mascota;
				auxIndex++;
			}
		}
		
		return mascotasViejitas;
	}
	
	private static int calcularEdad(int edad) {
		return ANIO_ACTUAL - edad;
	}
	
	/**
	 * Devuelve las mascotas cuya especie coincide con especieParam;
	 * @param
	 * @return
	 */
	private static Mascota [] filtrarPorEspecie(Mascota [] param, Especie especieParam) {

		int auxIndex = 0, auxCont = 0;
		
		for (Mascota mascota : param) {
			if (mascota.getRaza().getEspecie().equals(especieParam)) {
				auxCont++;
			}
		}
		
		Mascota [] mascotasFiltradas = new Mascota[auxCont];
		for (Mascota mascota : param) {
			if (mascota.getRaza().getEspecie().equals(especieParam)) {
				mascotasFiltradas[auxIndex] = mascota;
				auxIndex++;
			}
		}
		
		return mascotasFiltradas;
	}
	
	
	/**
	 * Devuelve lapersona que tiene más mascotas a su cargo.
	 * @return
	 * @param
	 * 
	 * NO LLEGUE A REALIZARLO
	 */
	@SuppressWarnings({ "unused" })
	private static Persona maxMascotero(Mascota [] param) {
		return null;
	}
	
	public static void main(String[] args) {
		Mascota mascota1 = new Mascota(2005, 123123, "Horacio", 
						new Persona("Kling", "Kevin", "41629219"),
				        new Raza("Raza1",
				        new Especie("Especie2")));
		
		Mascota mascota2 = new Mascota(2020, 3457, "Pepe", 
						new Persona("Gomez", "Jorge", "16292219"),
						new Raza("Raza1",
						new Especie("Especie3")));
		
		Mascota mascota3 = new Mascota(2003, 123316, "Negrito", 
		           		new Persona("Kling", "Kevin", "41629219"),
		           		new Raza("Raza3",
		           		new Especie("Especie3")));
		
		Mascota mascota4 = new Mascota(2015, 223, "Camba", 
		           		new Persona("Gomez", "Jorge", "16292219"),
		           		new Raza("Raza2",
		           		new Especie("Especie5")));
		
		Mascota mascota5 = new Mascota(2005, 3123123, "Tobi", 
		           		new Persona("Rigo", "Kevin", "24222123"),
		           		new Raza("Raza4",
		           		new Especie("Especie3")));
		
		Mascota [] mascotitas = new Mascota[5];
		mascotitas[0] = mascota1;
		mascotitas[1] = mascota2;
		mascotitas[2] = mascota3;
		mascotitas[3] = mascota4;
		mascotitas[4] = mascota5;
		
		System.out.println("TODAS LAS MASCOTAS: ");
		imprimir(mascotitas);
		
		System.out.println("\n # # # # # # # # # # # # # # # # # # # # # \n");
		System.out.println("FILTRADO POR MAYORES DE 13 AÑOS: "); //3
		imprimir(filtrarGerontes(mascotitas));
		
		System.out.println("\n # # # # # # # # # # # # # # # # # # # # # \n");
		System.out.println("BUSCAR POR ESPECIE PASADA POR PARAMETRO: ");
		imprimir(filtrarPorEspecie(mascotitas, new Especie("Especie3"))); //3
		
		System.out.println("\n # # # # # # # # # # # # # # # # # # # # # \n");
		
		
	}
}
