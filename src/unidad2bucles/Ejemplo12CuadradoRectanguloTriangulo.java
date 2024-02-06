package unidad2bucles;

import java.util.Scanner;

public class Ejemplo12CuadradoRectanguloTriangulo {
	/**
	 * EL programa preguntará que figura quiere que se dibuje por pantalla, si un
	 * cuadrado, rectangulo o triangulo y para cada caso pedira los datos necesarios
	 * y dibujara por pantalla la figura
	 * 
	 * @param args
	 */

	public final static int CUADRADO = 1;
	public final static int RECTANGULO = 2;
	public final static int TRIANGULO = 3;

	public static void main(String[] args) {
		int opcion = -1;
		int lado = 0;
		int altura = 0;

		Scanner teclado = new Scanner(System.in);

		while (opcion != 1 && opcion != 2 && opcion != 3) {
			System.out.print("Introduce 1 para cuadrado, 2 para rectángulo, o 3 para triángulo: ");
			opcion = teclado.nextInt();

		}

		switch (opcion) {
		case CUADRADO:
			System.out.print("Introduce el tamaño del lado: ");
			lado = teclado.nextInt();
			// Dibujamos un cuadrado

			// Dibujamos lado lineas una debajo de otra
			for (int z = 0; z < lado; z++) {

				// Dibujamos una linea de ancho lado
				for (int i = 0; i < lado; i++) {
					System.out.print("# ");
				}
				// Bajamos a la siguiente linea
				System.out.println();
			}

			break;
		case RECTANGULO:
			// POR HACER
			System.out.print("Introduce el tamaño del lado: ");
			lado = teclado.nextInt();
			System.out.print("Introduce el tamaño de la altura: ");
			altura = teclado.nextInt();
			for (int z = 0; z < altura; z++) {

				// Dibujamos una linea de ancho lado
				for (int i = 0; i < lado; i++) {
					System.out.print("# ");
				}
				// Bajamos a la siguiente linea
				System.out.println();
			}
			break;
		case TRIANGULO:
			System.out.print("Introduce el tamaño de la altura: ");
			altura = teclado.nextInt();

			for (int i = 1; i <= altura; i++) {
				// Dibujamos los espacios de la linea
				for (int z = 1; z <= (altura - i); z++) {
					System.out.print(" ");
				}

				for (int j = 1; j <= (2 * i) - 1; j++) {
					System.out.print("#");
				}
				System.out.println();
			}

			break;
		}

		teclado.close();
	}

}
