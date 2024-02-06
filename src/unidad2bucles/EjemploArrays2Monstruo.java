package unidad2bucles;

import java.util.Scanner;

public class EjemploArrays2Monstruo {

	// Constantes
	public static final int TAM_MAPA = 10;
	public static final char MONSTRUO = 'M';
	public static final char TIERRA = 'T';
	public static final char BOSQUE = 'B';
	public static final char JUGADOR = 'J';
	public static final char NORTE = 'N';
	public static final char SUR = 'S';
	public static final char ESTE = 'E';
	public static final char OESTE = 'O';

	public static void main(String[] args) {
		// array
		// Ejemplo definir tamaño
		// char map[][] = new char[TAM_MAPA][TAM_MAPA];

		// Guarda las posiciones sobreescritas cuando se muevan el jugador y el monstruo
		char tierraBorradaJ = ' ';
		char tierraBorradaM = ' ';
		char movJug = ' ';
		boolean vida = true;
		char mapa[][] = { { BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE },
				{ BOSQUE, TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, TIERRA, BOSQUE, BOSQUE },
				{ BOSQUE, TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, TIERRA },
				{ BOSQUE, TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE },
				{ BOSQUE, TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, TIERRA },
				{ BOSQUE, TIERRA, TIERRA, TIERRA, TIERRA, TIERRA, TIERRA, TIERRA, BOSQUE, BOSQUE },
				{ TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, TIERRA, BOSQUE, BOSQUE },
				{ TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, TIERRA, TIERRA, TIERRA },
				{ TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE },
				{ BOSQUE, TIERRA, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE, BOSQUE } };

		Scanner teclado = new Scanner(System.in);

		// Posicionamos al jugador y al monstruo aleatoriamente dentro del mapa
		int posJugX = (int) (Math.random() * 10);
		int posJugY = (int) (Math.random() * 10);

		int posMonX = (int) (Math.random() * 10);
		int posMonY = (int) (Math.random() * 10);

		tierraBorradaJ = mapa[posJugY][posJugX];
		tierraBorradaM = mapa[posMonY][posMonX];
		mapa[posJugY][posJugX] = JUGADOR;
		mapa[posMonY][posMonX] = MONSTRUO;

		for (int i = 0; i < TAM_MAPA; i++) {
			// Para cada linea con la j vamos mostrando las posiciones del mapa
			for (int j = 0; j < TAM_MAPA; j++) {
				System.out.print(mapa[i][j]);
			}
			// Una vez acabamos de dibujar una linea del mapa
			// Pasamos a la siguiente linea
			System.out.println();
		}

		while (vida) {
			// A donde quiere moverse
			System.out.println("En que dirección te quieres mover (N,S,E,O): ");
			movJug = teclado.next().charAt(0);

			mapa[posJugY][posJugX] = tierraBorradaJ;

			// Calculamos la posicion nueva del jugador
			switch (movJug) {
			case NORTE:
				// Si no estamos arriba del todo, movemos al jugador hacia arriba
				if (posJugY != 0) {
					posJugY--;
				}
				break;
			case SUR:
				// Si no estamos abajo del todo, movemos al jugador hacia abajo
				if (posJugY != TAM_MAPA - 1) {
					posJugY++;
				}
				break;
			case ESTE:
				// Si no estamos a la derecha del todo, movemos al jugador hacia la derecha
				if (posJugX != TAM_MAPA - 1) {
					posJugX++;
				}
				break;
			case OESTE:
				// Si no estamos a la izquierda del todo, movemos al jugador hacia la izquierda
				if (posJugX != 0) {
					posJugX--;
				}
			}

			tierraBorradaJ = mapa[posJugY][posJugX];
			mapa[posJugY][posJugX] = JUGADOR;

			// Calculamos las nuevas posiciones del monstruo
			int distX = posMonX - posJugX;
			int distY = posMonY - posJugY;

			mapa[posMonY][posMonX] = tierraBorradaM;

			// Calculamos las nuevas posiciones del monstruo
			if (Math.abs(distX) > Math.abs(distY)) {
				// Si la diferencia en X es negativa está a mi derecha
				if (distX < 0) {
					posMonX++;
				} else {
					posMonX--;
				}
			} else {
				// Si la distancia en Y es negativa está más abajo
				if (distY < 0) {
					posMonY++;
				} else {
					posMonY--;
				}
			}

			tierraBorradaM = mapa[posMonY][posMonX];
			mapa[posMonY][posMonX] = MONSTRUO;

			for (int i = 0; i < TAM_MAPA; i++) {
				// Para cada linea con la j vamos mostrando las posiciones del mapa
				for (int j = 0; j < TAM_MAPA; j++) {
					System.out.print(mapa[i][j]);
				}
				// Una vez acabamos de dibujar una linea del mapa
				// Pasamos a la siguiente linea
				System.out.println();
			}

			if (posJugX == posMonX && posJugY == posMonY) {
				vida = false;
			}
		}
		System.out.println("Has perdido");

		teclado.close();

	}

}
