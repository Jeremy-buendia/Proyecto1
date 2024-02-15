package unidad4.utils;

//Con un import podemos utilizar todas las clases 
//del paquete invitado.
//El * implica todas las clases dentro de java.sql
import java.sql.Connection;
import java.sql.DriverManager;

public class UtilsBD {

	public static Connection conectarBD() {
		try {
			// Definimos el driver de la BD a la que nos conectamos
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Creamos una conexión activa con BD
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");

			// Si no ha saltado la excepcion devolvemos la conexion
			return con;
		} catch (Exception excepcion) {
			// Cuando salta el fallo mostramos un mensaje
			System.out.println("Error al conectarse");
			excepcion.printStackTrace();
			return null;
		}
	}
}
