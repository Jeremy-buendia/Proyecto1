package unidad5;

import java.io.File;
import java.util.Arrays;

public class EjemploGestionFichero {
	public static void main(String[] args) {
		File fichero = new File("leeme.txt");
		File fichero2 = new File("leeme2.txt");

		// exists busca si existe el fichero
		if (fichero.exists()) {
			System.out.println("Fichero existe");
			// renameTo cambia el nombre del fichero
			fichero.renameTo(fichero2);
		} else {
			System.out.println("Fichero no existe");
		}

		File directorio = new File(".");
		// list saca todos los nombre de archivos y de carpetas del directorio
		System.out.println(Arrays.toString(directorio.list()));

		// Delete elimina el fichero
		fichero2.delete();

	}
}
