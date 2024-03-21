package unidad4;

import unidad4.excepciones.DividirPorCeroException;

public class EjemploExcepciones {

	// La función lanza la excepcion dividir por cero en caso de que el divisor sea
	// 0
	public static int dividir(int dividendo, int divisor) throws DividirPorCeroException {
		// Si el divisor es 0, lanzo la excepción
		if (divisor == 0)
			throw new DividirPorCeroException("Divisor inválido");
		return dividendo / divisor;
	}

	public static void main(String[] args) {

		try {
			int listaNumeros[] = { 2, 3 };

			int division = dividir(34, 0);

			System.out.println(listaNumeros[2]);
		} catch (ArrayIndexOutOfBoundsException obe) {
			System.out.println("Eres mongolo macho, mira el array");
			obe.printStackTrace();
		} catch (DividirPorCeroException dpoe) {
			dpoe.printStackTrace();
		} catch (Exception e) {
			System.out.println("Otro error, no vea eh");
		} finally {
			System.out.println("Código ejecutado con o sin error");
		}
	}

}
