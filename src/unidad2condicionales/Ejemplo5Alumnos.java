package unidad2condicionales;

import java.util.Scanner;

public class Ejemplo5Alumnos {
	/*
	 * El programa lee el año de nacimiento de un alumno del instituto y le dice el
	 * curso que le corresponde
	 */

	// constante
	public final static int EDAD_1ESO = 2011;
	public final static int EDAD_2ESO = 2010;
	public final static int EDAD_3ESO = 2009;
	public final static int EDAD_4ESO = 2008;
	public final static int EDAD_1BACH = 2007;
	public final static int EDAD_2BACH = 2006;

	public static void main(String[] args) {
		int birthYear = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce tu año de nacimiento: ");
		birthYear = teclado.nextInt();

		// switch compara el valor entre paréntesis con los distintos casos y cuando
		// coincida con uno realiza las instrucciones establecidas

		switch (birthYear) {
		case EDAD_1ESO:
			System.out.println("Eres de 1º de ESO");
			// Break cancela el siguiente código
			break;
		case EDAD_2ESO:
			System.out.println("Eres de 2º de ESO");
			break;
		case EDAD_3ESO:
			System.out.println("Eres de 3º de ESO");
			break;
		case EDAD_4ESO:
			System.out.println("Eres de 4º de ESO");
			break;
		case EDAD_1BACH:
			System.out.println("Eres de 1º de Bachillerato");
			break;
		case EDAD_2BACH:
			System.out.println("Eres de 2º de Bachillerato");
			break;
		default:
			System.out.println("No eres de instituto");
		}

		teclado.close();

	}

}
