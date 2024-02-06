package unidad2bucles;

public class EjemploArrays1 {

	public static void main(String[] args) {
		// Array de números enteros, muchos números
		// En java hay que definir el tamaño de elementos que pueden guardarse
		int edadesAlumnos[] = new int[20];
		// Creamos el array dandole valores iniciales
		String listaNombres[] = { "jose", "juan", "pepe" };

		for (int i = 0; i < edadesAlumnos.length; i++) {
			int random = (int) (Math.random() * 90 + 1);
			edadesAlumnos[i] = random;
		}
		// foreach muestra el contenido del array
		for (int edad : edadesAlumnos) {
			System.out.println(edad);
		}

		System.out.println(edadesAlumnos.toString());

		System.out.println("El array tiene " + edadesAlumnos.length + " elementos");
	}

}
