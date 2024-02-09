package unidad4.utils;

public class UtilsBD {

	public static void conectarBD() {
		try {
			// Definimos el driver de la BD a la que nos conectamos
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException cnfe) {
			// Cuando salta el fallo mostramos un mensaje
			cnfe.printStackTrace();
		}

	}
}
