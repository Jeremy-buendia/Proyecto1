package unidad5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lecturaLineaALinea {

	public static void main(String[] args) {

		try {
			// Obligatoriamente try Catch
			FileReader lector = new FileReader("C:\\1º DAW\\[PROGRAMACIÓN]\\Proyectos\\Proyecto1\\lectura.txt");

			BufferedReader br = new BufferedReader(lector);

			String linea = br.readLine();

			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}

			br.close();

			// Necesita otro catch por posible error distinto
			lector.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
