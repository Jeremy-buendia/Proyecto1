package unidad2condicionales;

import java.util.Scanner;

/**
 * Esto es un comentario de JAVADOC
 */
public class Ejemplo6SwitchEstados {

	// constantes
	// Definimos estados para el jugador
	public static final int ESTADO_SALTANDO = 0;
	public static final int ESTADO_CUBIERTO = 1;
	public static final int ESTADO_INVISIBLE = 2;
	public static final int ESTADO_AGACHADO = 3;

	// Definimos constantes para las acciones
	public static final int ACCION_DISPARAR = 0;
	public static final int ACCION_SALTAR = 1;
	public static final int ACCION_ESCANEO_VISIBILIDAD = 2;

	public static final int ACCION_PERMITIDA = 1;
	public static final int ACCION_NO_PERMITIDA = 0;

	/**
	 * El programa recibe el estado de un personaje y la acción a realizar, y
	 * dependiendo del estado se podrá realizar o no.
	 * 
	 * El jugador podrá disparar si no está a cubierto El jugador puede saltar si no
	 * está saltando o invisible El jugador es visible si no es invisible y no está
	 * a cubierto
	 */
	public static void main(String[] args) {
		// variables
		int estado = -1;
		int accion = -1;
		int resultado = ACCION_NO_PERMITIDA;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una acción (0 - Disparo,1 - Saltar, 2 - Escaneo)");
		accion = teclado.nextInt();

		System.out.println("Introduce una acción (0 - Saltando,1 - A cubierto, 2 - Invisible, 3 - Agachado)");
		estado = teclado.nextInt();

		// COMPROBAR QUE LA ACCION Y EL ESTADO SON VALORES CORRECTOS
		// SINO SALIR CON EXIT exit(-1)

		if (accion != 0 || accion != 1 || accion != 2) {

		}

		if (estado != 0 || estado != 1 || estado != 2 || estado != 3) {

		}

		switch (accion) {
		case ACCION_DISPARAR:
			if (estado != ESTADO_CUBIERTO) {
				resultado = ACCION_PERMITIDA;
			}
			break;
		case ACCION_SALTAR:
			if (estado != ESTADO_SALTANDO && estado != ESTADO_INVISIBLE) {
				resultado = ACCION_PERMITIDA;
			}
			break;
		case ACCION_ESCANEO_VISIBILIDAD:
			if (estado != ESTADO_CUBIERTO && estado != ESTADO_CUBIERTO) {
				resultado = ACCION_PERMITIDA;
			}
			break;
		}

		if (resultado == ACCION_PERMITIDA) {
			System.out.println("La acción puede llevarse a cabo");
		} else if (resultado == ACCION_NO_PERMITIDA) {
			System.out.println("La acción no puede llevarse a cabo");
		}

		teclado.close();
	}

}
