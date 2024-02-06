package unidad2condicionales;

import java.util.Scanner;

public class Ejemplo7Loteria {

	/*
	 * Realizar un programa que genere aleatoriamente un número de loteria de forma
	 * aleatoria entre 1 y 20. Dos usuarios introducen sus numeros de loteria por
	 * teclado El programa deberá decir si ha tocado, quién ha estado más cerca de
	 * tocarle o si están igual.
	 */

	public static void main(String[] args) {
		// variables
		int usuario1 = 0;
		int usuario2 = 0;
		int loteria = 0;
		int distancia1 = 0;
		int distancia2 = 0;
		int absDistancia1 = 0;
		int absDistancia2 = 0;

		// número aletorio entre 0 y 20
		loteria = (int) (Math.random() * 21);

		// iniciamos el escaner
		Scanner teclado = new Scanner(System.in);
		// pedimos los números
		System.out.println("Introduce el número de loteria del primer usuario: ");
		usuario1 = teclado.nextInt();

		System.out.println("Introduce el número de loteria del segundo usuario: ");
		usuario2 = teclado.nextInt();

		// Filtramos para que meta un valor dentro del rango
		if (usuario1 > 15 || usuario2 > 15 || usuario1 < 1 || usuario2 < 1) {
			System.out.println("Introduce valores válidos");
		} else {
			// Si ganas la lotería lo muestra
			if (loteria == usuario1) {
				System.out.println("El usuario 1 ha ganado la lotería");
			}
			if (loteria == usuario2) {
				System.out.println("El usuario 2 ha ganado la lotería");
			}
			// Si no ganas con una resta sacamos la distancia y la pasamos a valor absoluto
			if (loteria != usuario1 && loteria != usuario2) {
				distancia1 = loteria - usuario1;
				distancia2 = loteria - usuario2;
				absDistancia1 = Math.abs(distancia1);
				absDistancia2 = Math.abs(distancia2);
				System.out.println("El usuario 1 se ha quedado a " + absDistancia1
						+ " numeros de ganar, y el usuario 2 se ha quedado a " + absDistancia2);
			}

			if (absDistancia1 < absDistancia2) {
				System.out.println("El jugador 1 ha estado más cerca, el numero premiado es " + loteria);
			} else if (absDistancia1 == absDistancia2) {
				System.out.println("Los dos se han quedado a la misma distancia, el numero premiado es " + loteria);
			} else {
				System.out.println("El jugador 2 ha estado más cerca, el numero premiado es " + loteria);
			}
		}
		teclado.close();
	}
}
