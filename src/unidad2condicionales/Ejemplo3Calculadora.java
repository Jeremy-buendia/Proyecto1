package unidad2condicionales;

import java.util.Scanner;

public class Ejemplo3Calculadora {

	/*
	 * El programa lee dos numero y una operacion y nos saca el resultado
	 */

	public static void main(String[] args) {
		// declaración de variables
		int numero1, numero2;
		String operacion = "";
		double resultado = 0.0;

		// Lectura de datos
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce suma, resta, multiplicacion o division: ");
		operacion = teclado.nextLine();

		// Pasamos a minúsculas el texto
		operacion = operacion.toLowerCase();

		// Para comparar String utilizamos .equals
		if (!operacion.equals("suma") && !operacion.equals("resta") && !operacion.equals("multiplicacion")
				&& !operacion.equals("division")) {
			System.out.println("La operación no es válida");
		} else {
			System.out.println("Introduce el primer número");
			numero1 = teclado.nextInt();
			System.out.println("Introduce el segundo número");
			numero2 = teclado.nextInt();

			if (operacion.equals("suma")) {
				resultado = numero1 + numero2;
			} else if (operacion.equals("resta")) {
				resultado = numero1 - numero2;
			} else if (operacion.equals("multiplicacion")) {
				resultado = numero1 * numero2;
			} else if (operacion.equals("division")) {
				if (numero2 == 0) {
					if (numero1 == 0) {
						// Si numero
						System.out.println("El resultado es indeterminado");
					} else {
						System.out.println("El resultado es infinito");
					}
				} else {
					// Distinto de 0
					resultado = numero1 / numero2;
				}
			}
			if (!operacion.equals("division")) {
				System.out.println("El resultado es: " + resultado);
			}
		}

		teclado.close();
	}

}
