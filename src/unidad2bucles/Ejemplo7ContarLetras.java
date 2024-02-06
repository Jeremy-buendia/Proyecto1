package unidad2bucles;

import java.util.Scanner;

public class Ejemplo7ContarLetras {

	public static void main(String[] args) {
		String entrada = "";
		String entradaMin = "";
		int numVocales = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la linea de caracteres: ");
		entrada = teclado.nextLine();

		entradaMin = entrada.toLowerCase();

		for (int i = 0; i < entrada.length(); i++) {

			// char letra = Character.toLowerCase(entrada.charAt(i));
			if (entradaMin.charAt(i) == 'a' || entradaMin.charAt(i) == 'e' || entradaMin.charAt(i) == 'i'
					|| entradaMin.charAt(i) == 'o' || entradaMin.charAt(i) == 'u') {
				numVocales += 1;
			}
		}

		System.out.println("hay " + numVocales + " vocales");

		teclado.close();
	}

}
