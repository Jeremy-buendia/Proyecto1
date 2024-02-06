package unidad2bucles;

import java.util.Scanner;

public class Ejemplo2TablaMultiplicar {
	public static void main(String[] args) {
		// variables
		int i = 1;
		int numTabla = 0;
		int limMult = 0;

		Scanner teclado = new Scanner(System.in);

		// Tabla de multiplicar del 5
		while (i <= 10) {
			System.out.println("5 x " + i + " = " + (5 * i));
			i++;
		}

		// Tabla de multiplicar de un numero pedido y hasta un limite pedido
		System.out.println("De que número quieres que se haga su tabla: ");
		numTabla = teclado.nextInt();
		System.out.println("Hasta que número: ");
		limMult = teclado.nextInt();

		i = 1;

		// while (i <= limMult) {
		// System.out.println(numTabla + " x " + i + " = " + (numTabla * i));
		// i++;
		// }

		// variable, condicion, incremento o decremento (después de ejecutar)
		for (int z = 1; z < limMult + 1; z++) {
			System.out.println(numTabla + " x " + z + " = " + (numTabla * z));
		}

		teclado.close();

	}
}
