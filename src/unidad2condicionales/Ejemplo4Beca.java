package unidad2condicionales;

import java.util.Scanner;

public class Ejemplo4Beca {
	/*
	 * El programa calcula la cuantia de la beca para un alumno. Seran 6000 euros si
	 * el alumno es menor de edad y la renta familiar es menos de 20 mil euro. Será
	 * un 25% de los 6000 euros si la renta es menor de 30 mil euros o es refugiado
	 * leemos dos datos edadAlumno, rentaFamiliar y esRefugiado
	 */
	public static void main(String[] args) {
		int edadAlumno = 0;
		double rentaFamiliar = 0.0;
		double importeBeca = 0.0;
		char esRefugiadoChar = 'N';
		boolean esRefugiado = false;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la edad del alumno: ");
		edadAlumno = teclado.nextInt();
		System.out.println("Introduce la renta anual familiar: ");
		rentaFamiliar = teclado.nextInt();
		System.out.println("El alumno es refugiado (S/N): ");
		// leemos esRefugiado como char
		esRefugiadoChar = teclado.next().toUpperCase().charAt(0);

		// Forma de hacer un condicional
		esRefugiado = esRefugiadoChar == 'S' ? true : false;

		if (edadAlumno > 18) {
			System.out.println("Usted es mayor de 18 años");
		} else if (edadAlumno < 18 && edadAlumno >= 0) {
			if (rentaFamiliar <= 20000.00) {
				importeBeca = 6000.00;
			} else if (rentaFamiliar < 30000 || esRefugiado) {
				importeBeca = 6000.00 * 0.25;
			} else if (rentaFamiliar > 30000) {
				importeBeca = 0;
			}
			System.out.println("La cuantía de tu beca es de " + importeBeca + "€.");

		}
		teclado.close();
	}

}
