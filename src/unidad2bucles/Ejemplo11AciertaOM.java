package unidad2bucles;

import java.util.Scanner;

public class Ejemplo11AciertaOM {

	/**
	 * Generar un numero aleatorio entre 1 y 10. El usuario tiene 3 intentos para
	 * acertarlo. La maquina le da pistas sobre si es menor o mayor en cada fallo,
	 * pero tiene un 25% de posibilidades de mentir
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// variables
		int numAleatorio = (int) (Math.random() * 10) + 1;
		int numEntrada = -1;
		int numIntentos = 3;
		boolean acierto = false;

		// System.out.println(numAleatorio);

		Scanner teclado = new Scanner(System.in);
		System.out.println("Intenta adivinar el numero del 1 al 10 en tres intentos");

		do {
			System.out.print("Introduce el numero (te quedan " + numIntentos + " intentos): ");
			numIntentos--;
			numEntrada = teclado.nextInt();
			if (numAleatorio == numEntrada) {
				acierto = true;
				System.out.println("¡Acertaste!");
			} else {
				int ayudaNegativa = (int) (Math.random() * 4) + 1;
				if (ayudaNegativa == 1) {
					if (numEntrada < numAleatorio) {
						System.out.println("Te has pasado");
					} else {
						System.out.println("Te has quedado corto");
					}
				} else {
					if (numEntrada < numAleatorio) {
						System.out.println("Te has quedado corto");
					} else {
						System.out.println("Te has pasado");
					}
				}
			}

		} while (numIntentos > 0 && !acierto);

		teclado.close();
	}

}
