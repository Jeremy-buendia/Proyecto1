package unidad2bucles;

import java.util.Scanner;

public class Ejemplo9Factorial {

	/**
	 * Este programa lee un numero de teclado y calcula su factorial y su sumatorio
	 * desde 1 hasta el propio numero
	 * 
	 * Ejemplo: num= 6, sumatorio = 1+2+3+4+5+6 =21 factorial = 1*2*3*4*5*6 = 720
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int numeroEntrada = 0;
		long sumatorio = 0;
		long factorial = 1;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el numero: ");
		numeroEntrada = teclado.nextInt();

		for (int i = 1; i <= numeroEntrada; i++) {
			sumatorio += 1 * i;
			factorial = factorial * i;
		}

		System.out.println("El sumatorio es " + sumatorio + " y el factorial es " + factorial);

		teclado.close();
	}

}
