package unidad2bucles;

public class Ejemplo5Media {

	/**
	 * El programa recibe un string con las notas. Cada caracter es un numero de 1 a
	 * 9. El programa devuelve la media
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// variables

		String sNotas = "389475623874328394752";
		float media = 0.0f;
		float suma = 0.0f;

		// Recorremos string caracter a caracter
		for (int i = 0; i < sNotas.length(); i++) {
			// System.out.println("Carácter: " + sNotas.charAt(i));
			suma += Character.getNumericValue(sNotas.charAt(i));
		}

		// Length te dice la cantidad de elementos bien (sin -1 ni +1)
		media = suma / sNotas.length();
		System.out.println(media);

	}

}
