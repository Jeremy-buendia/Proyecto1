package unidad5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploCopiarImagen {

	public static void main(String[] args) {
		String ficheroOrigen = "C:\\Users\\Jairo\\Pictures\\imagen.png";
		String ficheroDestino = "C:\\1º DAW\\[PROGRAMACIÓN]\\Proyectos\\Proyecto1\\img\\captura.png";

		File dirImagen = new File(".\\img");

		// Comprobamos si el directorio existe
		if (!dirImagen.exists()) {
			// Si no existe lo creamos
			dirImagen.mkdir();
		}

		// Abrimos el fichero origen y destino
		try {
			FileInputStream fis = new FileInputStream(ficheroOrigen);
			FileOutputStream fos = new FileOutputStream(ficheroDestino);

			byte[] buffer1K = new byte[1024];
			int numDatos = fis.read(buffer1K);

			while (numDatos != -1) {
				fos.write(buffer1K);
				numDatos = fis.read(buffer1K);
			}

			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
