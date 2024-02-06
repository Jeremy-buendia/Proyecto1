package unidad2bucles;

public class Ejemplo3Numeros {

	public static void main(String[] args) {
		// Bucle que muestra todos los números pares del 1 al 30

		boolean acabar = false;

		for (int i = 1; i <= 30 && acabar == false; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			if (i == 1000)
				acabar = true;
		}

		// Bucle multiplos de 5
		for (int j = 5; j < 100; j = j + 5) {
			System.out.println(j);
		}

	}

}
