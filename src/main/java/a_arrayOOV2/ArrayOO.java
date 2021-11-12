package a_arrayOOV2;




/**
 * 
 * @author Nacho
 */
public class ArrayOO {
	private int[] array;

	/**
	 * Inicializa un array sin posiciones.
	 */
	public ArrayOO() {
		this.array = new int[0];
	}

	/**
	 * Incrementa en uno la longitud del array e inserta en la última posición el
	 * valor pasado por parámetro
	 * 
	 * @param valor
	 */
	public void add(int valor) {
		// Crear nuevoArray con length = array.length + 1
		int[] nuevoArray = new int[array.length + 1];
		// Copiar los valores de array en otro array nuevoArray
		for (int i = 0; i < array.length; i++) {
			nuevoArray[i] = array[i];
		}
		// Poner el nuevo valor en nuevoArray
		nuevoArray[nuevoArray.length - 1] = valor;
		// Sobreescribir el valor de array
		this.array = nuevoArray;
	}

	/**
	 * Quita el elemento ubicado en la posición especificada por el parámetro y
	 * disminuye en uno la longitud del array.
	 * 
	 * @param indice
	 */
	public void remove(int indice) {
		// Crear nuevoArray con length = array.length - 1
		int[] nuevoArray = new int[array.length - 1];

		// Copiar todos los valores menos indice
		int indiceAux = 0;
		for (int i = 0; i < array.length; i++) {
			if (i != indice) {
				nuevoArray[indiceAux] = array[i];
				indiceAux++;
			}
		}

		// Sobreescribir el array con nuevoArray
		this.array = nuevoArray;
	}

	/**
	 * Obtiene el valor especificado por índice
	 * 
	 * @param indice
	 * @return
	 */
	public int get(int indice) {
		return array[indice];
	}

	/**
	 * Establece el valor pasado por parámetro en la posición especificada por
	 * indice
	 * 
	 * @param indice
	 * @param valor
	 */
	public void set(int indice, int valor) {
		this.array[indice] = valor;
	}

	/**
	 * Devuelve la cantidad de posiciones actual de la estructura.
	 * 
	 * @return
	 */
	public int size() {
		return this.array.length;
	}

	/**
	 * Devuelve el promedio calculado a partir de los valores almacenados en el
	 * array.
	 * 
	 * @return
	 */
	public double promedio() {
		double sumatoria = 0;
		
		for (int i : array) {
			sumatoria += i;
		}
		
		return sumatoria / array.length;
	}

	/**
	 * Multiplica cada uno de los valores del array por los de valorParam.
	 * @param valor
	 */
	public void multiplicar(int valorParam) {
		for (int i = 0; i < array.length; i++) {
			array[i] *= valorParam;
		}
	}

	/**
	 * Multiplica cada uno de los valores del array por los de arrayParam.
	 *
	 */
	public void multiplicar(int[] arrayParam) {
		
		if (arrayParam.length < array.length) {
			for (int i = 0; i < arrayParam.length; i++) {
				array[i] *= arrayParam[i];
			}
		}else {
			for (int i = 0; i < array.length; i++) {
				array[i] *= arrayParam[i];
			}
		}
	}

	/**
	 * Devuelve true si todos los elementos del array tienen diferente valor, caso
	 * contrario false.
	 * 
	 * @return
	 */
	public boolean todosDistintos() {
		
		for (int i : array) {
			if (estaRepetido(i)) {
				return false; 
			}
		}
		return true;
	}
	
	/**
	 *	Retorna true si un elemento esta repetido
	 * @param 
	 * @return
	 */
	private boolean estaRepetido(int num) {
		int auxCont = 0;
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				auxCont++;
				if (auxCont > 1) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Invierte los valores del array dejando el último valor en la primer posición,
	 * el ante-último en la segunda y así sucesivamente.
	 */
	public void reverso() {
		
		int [] auxArray = new int[size()];
		int auxJ = 0;
		
		for (int i = auxArray.length-1; i >= 0 ; i--) {
			auxArray[auxJ] = array[i];
			auxJ++;
		}

		array = auxArray;
	}

	/**
	 * Concatena en un único String todos los valores de la estructura
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		String resultado = "";

		for (int actual : array) {
			resultado += actual + ",";
		}

		if (resultado.length() > 0) {
			resultado = resultado.substring(0, resultado.length() - 1) + ".";
		}

		return resultado;
	}

}
