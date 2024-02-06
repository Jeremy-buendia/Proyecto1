package unidad2bucles;

import java.util.Scanner;

public class Ejemplo11Maestro {

	public static void main(String[] args) {
		int numBuscar = (int) (Math.random() * 10) + 1;
		int numIntentos = 3;
		int num = -1;
		Scanner teclado = new Scanner(System.in);

		while (numIntentos > 0 && num != numBuscar) {
			System.out.println("Introduce un numero: ");
			num = teclado.nextInt();

			numIntentos--;

			if (num != numBuscar && numIntentos > 0) {
				boolean miento = (Math.random() < 0.25);
				if (num < numBuscar && !miento) {
					System.out.println("El numero buscado es mayor que el introducido");
				} else {
					System.out.println("El numero buscado es menor que el introducido");
				}
			}

			if (num == numBuscar) {
				System.out.println("Te has librado");
			} else {
				System.out.println("El número era " + numBuscar);
			}
		}
	}

}
