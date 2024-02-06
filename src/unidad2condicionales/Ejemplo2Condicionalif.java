package unidad2condicionales;

import java.util.Scanner;

public class Ejemplo2Condicionalif {
	/*
	 * El programa lee de teclado una nota y nos dice si es insuficiente,
	 * suficiente, bien, notable, sobresaliente o matrícula
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota = 0.0;

		// Mostramos un mensaje para que se introduzca la nota
		System.out.println("Introduce la nota: ");
		nota = teclado.nextDouble();

		// Comprobamos si el valor esta dentro del rango
		if (nota <= 10 && nota >= 0) {
			if (nota < 5) {
				// Entra si es menor a 5
				System.out.println("Tu nota es insuficiente");
			} else if (nota < 6) {
				// Entre 5 y 6
				System.out.println("Tu nota es suficiente");
			} else if (nota < 7) {
				// Entre 6 y 7
				System.out.println("Tu nota es un bien");
			} else if (nota < 9) {
				// Entre 7 y 9
				System.out.println("Tu nota es un notable");
			} else if (nota < 10) {
				// Entre
				System.out.println("Tu nota es un sobresaliente");
			} else {
				System.out.println("Tu nota es una matrícula");
			}
		} else {
			System.out.println("Esa nota no es posible");
		}

		teclado.close();

	}

}
