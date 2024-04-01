package unidad5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploEscrituraLineaALinea {
	public static void main(String[] args) {

		try {
			// 1º parametro --> directorio
			// 2º parametro --> true = append, false = no append (borra lo anterior)
			FileWriter escritor = new FileWriter("C:\\1º DAW\\[PROGRAMACIÓN]\\Proyectos\\Proyecto1\\lectura.txt", true);
			BufferedWriter bw = new BufferedWriter(escritor);

			String lineas[] = { "primera linea", "segunda linea", "tercera linea", "cuarta linea" };

			// Bucle que recorre el array lineas con un for each y lo escribe e el fichero
			// leer.txt
			for (String linea : lineas) {
				// Escribimos la línea
				bw.write(linea);
				// Enter
				bw.newLine();
			}

			bw.close();
			escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
