package unidad2bucles;

import java.util.Scanner;

public class SolucionExamenAntiguo {

	public static void main(String[] args) {
		// variables
		int numEmpleados = 0;
		String nombre = "";
		int edad = 0;
		double sueldo = 0;
		char estadoCivil = ' ';
		int diasBaja = 0;
		long diasBajaDivorciados = 0;
		double sueldoMayor = Double.MIN_VALUE;
		String nombreSueldoMayor = "";
		int numDivorciados = 0;
		int numCasados = 0;
		int numSolteros = 0;
		int porcentajeDivorciados = 0;
		int porcentajeCasados = 0;
		int porcentajeSolteros = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuántos empleados va a introducir? ");
		numEmpleados = teclado.nextInt();

		String empleadosExtraNavidad[] = new String[numEmpleados];

		for (int i = 0; i < numEmpleados; i++) {
			System.out.println("Introduce la edad del " + (i + 1) + "º empleado: ");
			edad = teclado.nextInt();
			System.out.println("Introduce el sueldo del " + (i + 1) + "º empleado: ");
			sueldo = teclado.nextDouble();
			System.out.println(
					"Introduce el estado civil del " + (i + 1) + "º empleado (S- Soltero, C-Casado, D-Divorciado): ");
			estadoCivil = teclado.next().toUpperCase().charAt(0);
			System.out.println("Introduce los días de baja del " + (i + 1) + "º empleado: ");
			diasBaja = teclado.nextInt();

			teclado.nextLine();
			System.out.println("Introduce el nombre del " + (i + 1) + "º empleado: ");
			nombre = teclado.nextLine();

			if (estadoCivil == 'D') {
				diasBajaDivorciados += diasBaja;
				numDivorciados++;
			}
			if (estadoCivil == 'C') {
				numCasados++;
				if (sueldoMayor < sueldo) {
					nombreSueldoMayor = nombre;
					sueldoMayor = sueldo;
				}
			}

			if (diasBaja < 30 && edad > 40 || estadoCivil == 'D') {
				empleadosExtraNavidad[i] = nombre;
			}

			if (estadoCivil == 'S') {
				numSolteros++;
			}

		}

		porcentajeDivorciados = numDivorciados * 100 / numEmpleados;
		porcentajeCasados = numCasados * 100 / numEmpleados;
		porcentajeSolteros = numSolteros * 100 / numEmpleados;

		System.out.println("La suma de los dias de baja de todos los divorciados es " + diasBajaDivorciados);
		System.out.println("El nombre del empleado de mayor sueldo que esté casado es " + nombreSueldoMayor);
		System.out.println("El porcentaje de solteros es " + porcentajeSolteros + "%");
		System.out.println("El porcentaje de casados es " + porcentajeCasados + "%");
		System.out.println("El porcentaje de divorciados es " + porcentajeDivorciados + "%");

		for (int i = 0; i < empleadosExtraNavidad.length; i++) {
			if (empleadosExtraNavidad[i] != null) {
				System.out.println(empleadosExtraNavidad[i] + " tiene derecho a extra de Navidad");
			}
		}

		teclado.close();
	}

}
