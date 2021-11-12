package d_automoviles;

public class ClientesAutomoviles {

	/**
	 * Que imprima por pantalla los datos contenidos en el array pasado por
	 * parámetro.
	 *
	 */
	private static void imprimir(Automovil[] param) {
		for (Automovil automovil : param) {
			System.out.println(automovil);
		}
	}

	/**
	 * Devuelve los automóviles con igual modelo al pasado por parámetro.
	 * 
	 */
	private static Automovil[] filtrarPorAnio(Automovil[] param, int anio) {

		int auxIndex = 0, auxCont = 0;

		for (Automovil auto : param) {
			if (auto.getAnio() == anio) {
				auxCont++;
			}
		}

		Automovil[] autosFiltrados = new Automovil[auxCont];
		for (Automovil auto : param) {
			if (auto.getAnio() == anio) {
				autosFiltrados[auxIndex] = auto;
				auxIndex++;
			}
		}

		return autosFiltrados;
	}

	/**
	 * Devuelve los automóviles cuyo tipo coincide con el pasado por parámetro.
	 *
	 */
	private static Automovil[] filtrarPorTipo(Automovil[] param, Tipo tipo) {

		int auxIndex = 0, auxCont = 0;

		for (Automovil auto : param) {
			if (auto.getTipo().equals(tipo)) {
				auxCont++;
			}
		}

		Automovil[] autosFiltrados = new Automovil[auxCont];
		for (Automovil auto : param) {
			if (auto.getTipo().equals(tipo)) {
				autosFiltrados[auxIndex] = auto;
				auxIndex++;
			}
		}

		return autosFiltrados;
	}

	/**
	 * Devuelve la cantidad de vehículos por modelo.
	 *
	 */
	private static AnioCantidad[] cantidadPorAnio(Automovil[] param) {
		
		boolean encontrado = false;
		int auxIndex = 0;
		AnioCantidad [] anioCantidad = new AnioCantidad[param.length];
		
		for (Automovil automovil : param) {
			encontrado = false;
			for (int i = 0; i < auxIndex; i++) {
				if (anioCantidad[i].getModelo() == automovil.getAnio() && !encontrado) { //&& !encontrado
					encontrado = true;
					anioCantidad[i].setCantidad(anioCantidad[i].getCantidad()+1);
				}
			}
			if (!encontrado) {
				anioCantidad[auxIndex] = new AnioCantidad(1, automovil.getAnio());
				auxIndex++;
			}
		}
		
		AnioCantidad [] arrayCantidadPorAnio = new AnioCantidad[auxIndex];
		for (int i = 0; i < auxIndex; i++) {
			arrayCantidadPorAnio[i] = anioCantidad[i];
		}
		
		return arrayCantidadPorAnio;
	}

	/**
	 * Devuelve la sumatoria de las valuaciones clasificadas por tipo.
	 *
	 */
	private static TipoValuacion[] valuacionesPorTipo(Automovil[] param) {

		boolean encontrado = false;
		int auxIndex = 0;
		TipoValuacion [] tipoValuacion = new TipoValuacion[param.length];
		
		for (Automovil iteTipoVal : param) {
			encontrado = false;
			for (int i = 0; i < auxIndex; i++) {
				if (tipoValuacion[i].getTipo() == iteTipoVal.getTipo() && !encontrado) {
					encontrado = true;
					tipoValuacion[i].setValuacion(tipoValuacion[i].getValuacion().add(iteTipoVal.getValucion()));
				}
			}
			if (!encontrado) {
				tipoValuacion[auxIndex] = new TipoValuacion(iteTipoVal.getTipo(), iteTipoVal.getValucion());
				auxIndex++;
			}
		}
		
		TipoValuacion [] arrayTipoValuacion = new TipoValuacion[auxIndex];
		for (int i = 0; i < auxIndex; i++) {
			arrayTipoValuacion[i] = tipoValuacion[i];
		}
		
		return arrayTipoValuacion;
	}
	
	public static void main(String[] args) {
		Automovil auto1 = new Automovil(new java.math.BigDecimal("4.01"), 2011, "DEB-231", 
						  new Marca("BMW"), Tipo.BERLINA);
		Automovil auto2 = new Automovil(new java.math.BigDecimal("2.2"), 2011, "DEB-231",
						  new Marca("BMW"), Tipo.BERLINA);
		Automovil auto3 = new Automovil(new java.math.BigDecimal("3.3"), 2011, "DEB-231",
						  new Marca("BMW"), Tipo.SEDAN);
		Automovil auto4 = new Automovil(new java.math.BigDecimal("1.3"), 2011, "DEB-231",
						  new Marca("BMW"), Tipo.BERLINA);
		
		Automovil [] arrayAutos = new Automovil[4];
		arrayAutos[0] = auto1;
		arrayAutos[1] = auto2;
		arrayAutos[2] = auto3;
		arrayAutos[3] = auto4;
		
		System.out.println("IMPRIMIENDO TODOS: ");
		imprimir(arrayAutos);
		
		System.out.println("\n # # # # # # # # # # # # # # # # # # # # # \n");
		System.out.println("FILTRADOS POR EL TIPO PASADO POR PARAM: ");
		imprimir(filtrarPorTipo(arrayAutos, Tipo.SEDAN));
		
		System.out.println("\n # # # # # # # # # # # # # # # # # # # # # \n");
		System.out.println("FILTRADOS POR EL ANIO PASADO POR PARAM: ");
		imprimir(filtrarPorAnio(arrayAutos, 2011));
		
		System.out.println("\n # # # # # # # # # # # # # # # # # # # # # \n");
		System.out.println("CANTIDAD DE AUTOS POR MODELO: ");
		AnioCantidad [] cantidadPorAnio = (cantidadPorAnio(arrayAutos));
		for (AnioCantidad anioCantidad : cantidadPorAnio) {
			System.out.println(anioCantidad);
		}
		
		System.out.println("\n # # # # # # # # # # # # # # # # # # # # # \n");
		System.out.println("SUMATORIA DE VALUACIONES: ");
		TipoValuacion [] tipoValuacion = (valuacionesPorTipo(arrayAutos));
		for (TipoValuacion iteImprimir : tipoValuacion) {
			System.out.println(iteImprimir);
		}
	}

}
