package a_arrayOOV2;

/**
 *
 * @author Nacho
 */
public class Clase1ArrayOOEjercicio {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		var objeto = new ArrayOO();
		objeto.add(1);
		objeto.add(2);
		objeto.add(3);
		objeto.add(4);
		objeto.add(1);
		objeto.add(6);
		objeto.add(7);
		objeto.add(8);
		objeto.add(9);

		System.out.println("toString(): " + objeto.toString());

		objeto.remove(2); // saca el valor 3
		System.out.println("remove(2): " + objeto.toString());

		objeto.set(4, 33);
		System.out.println("objeto.set(4, 33): " + objeto.toString());

		System.out.println("objeto.get(i): ");
		for (var i = 0; i < objeto.size(); i++) {
			System.out.println("[" + i + "]: " + objeto.get(i));
		}

		/* ### */

		System.out.println("objeto.promedio(): " + objeto.promedio());

		objeto.multiplicar(2);
		System.out.println("objeto.multiplicar(2): " + objeto.toString());

        System.out.println("objeto.todosDistintos(): " + objeto.todosDistintos());

		objeto.reverso();
		System.out.println("objeto.reverso(): " + objeto.toString());

		int [] multiplicar = new int[5];
		for (int i = 0; i < multiplicar.length; i++) {
			multiplicar[i] = i;
		}
		objeto.multiplicar(multiplicar);
		System.out.println("objeto.multiplicar(multiplicar): " + objeto.toString());
	}
}
