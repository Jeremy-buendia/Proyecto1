package unidad2bucles;

public class Ejemplo10TablasMultiplicar {

	/**
	 * El programa muestra por pantalla todas las tablas de multiplicar el 1 al 10
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabla del " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
		}

		int i = 1;
		int j = 0;

		// Con while
		while (i <= 10) {
			System.out.println(i + " x " + j + " = " + (i * j));
			j++;
			while (j == 11) {
				i++;
				j = 0;
			}
		}

	}

}
