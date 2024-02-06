package unidad2bucles;

public class Ejemplo8ContarPalabras {

	public static void main(String[] args) {
		String texto = "En la casa de pepito la comida está rica";
		String palabra = "la";
		int vecesPalabra = 0;
		// guarda la posicion a partir de la cual buscamos
		int posBusc = 0;

		// cuando no se cuantas va a haber ponemos while
		// Mientras indexof no nos diga que no hay mas palabras, sigo buscando
		while (posBusc != -1) {
			posBusc = texto.indexOf(palabra, posBusc);
			if (posBusc != -1) {
				vecesPalabra++;
				posBusc++;
			}
		}

		System.out.println("La palabra " + palabra + " está " + vecesPalabra + " veces en el texto");

	}

}
