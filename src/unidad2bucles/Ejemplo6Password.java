package unidad2bucles;

import java.util.Scanner;

public class Ejemplo6Password {

	public static void main(String[] args) {
		/**
		 * La contraseña deberá cumplir lo siguiente Como mínimo 9 caracteres Solo puede
		 * empezar por letras Tiene que tener mayusculas y minusculas Tiene que tener
		 * numero
		 */

		// variables
		String password = "";
		boolean esValido = false;
		boolean LongMinOk = false;
		boolean empLetOk = false;
		boolean mayMinOk = false;
		boolean mayOk = false;
		boolean minOk = false;
		boolean tieneNumOk = false;
		int numIntentos = 5;

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.print("Introduce la contraseña: ");
			password = teclado.nextLine();
			--numIntentos;

			// Comprobamos si cumple la longitud mínima
			if (password.length() >= 9) {
				LongMinOk = true;
			}

			if (Character.isAlphabetic(password.charAt(0))) {
				empLetOk = true;
			}

			// Recorremos todos los caracteres del password
			for (int i = 0; i < password.length(); i++) {
				// comprobamos si hay numeros
				if (Character.isDigit(password.charAt(i))) {
					// En la condición: password.charAt(i) > '0' && password.charAt(i) <= '9'
					tieneNumOk = true;
				}
				// Comprobamos si hay mayusculas

				if (Character.isLowerCase(password.charAt(i))) {
					minOk = true;
				}
				if (Character.isUpperCase(password.charAt(i))) {
					mayOk = true;
				}

				if (mayOk && minOk) {
					mayMinOk = true;
				}
			}

			if (LongMinOk && empLetOk && mayMinOk && tieneNumOk) {
				esValido = true;
				System.out.println("Es valido");
			} else {
				System.out.println("No es valido, te quedan " + numIntentos + " intentos");
			}
			// Repetimos el bucle si todavía nos quedan intentos
		} while (numIntentos > 0 && !esValido);

		if (!esValido) {
			System.out.println("Has consumido los intentos, cuenta bloqueada");
		} else {
			System.out.println("Espere a ser atendido");
		}

		teclado.close();

	}

}
