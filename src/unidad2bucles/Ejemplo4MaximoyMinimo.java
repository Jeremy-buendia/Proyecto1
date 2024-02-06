package unidad2bucles;

import java.util.Scanner;

public class Ejemplo4MaximoyMinimo {

	public static void main(String[] args) {
		int num = 0, cantidad = 0;
		// Inicializamos el máimo al menor valor posible MIN_VALUE
		int max = Integer.MIN_VALUE, secMax = 0;
		int min = Integer.MAX_VALUE;
		// Programa que busca el mayor de un conjunto de números y el segundo mayor

		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuántos números hay en total? ");
		cantidad = teclado.nextInt();

		// Hacemos un bucle for para leer los numeros
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduce el número " + (i + 1) + ": ");
			num = teclado.nextInt();

			// Si el numero leido por teclado es mayor que nuestro máximo actual, implica
			// que es el nuevo maximo
			if (num > max) {
				// Antes de actualizar el máximo guardo el máximo como el segundo mayor
				secMax = max;
				max = num;
			} else if (num > secMax) {
				// Guardo el numero cómo el segundo mayor, en caso de que el numero sea mayor
				// que el segundo maximo
				secMax = num;
			}

			if (num < min) {
				min = num;
			}

		}
		// Una vez acabado el bucle
		System.out.println("El máximo es " + max + ", el segundo mayor es " + secMax + " y el minimo es " + min);

		teclado.close();
	}
}
