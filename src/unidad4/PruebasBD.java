package unidad4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import unidad4.model.ClienteDO;
import unidad4.model.ModelCliente;
import unidad4.model.ModelFactura;
//Con este import podemos usar todas las clases del paquete utils
import unidad4.utils.UtilsBD;

public class PruebasBD {

	public static void main(String[] args) {
		System.out.println("Intentamos conectar con BD:");
		// Ejecutamos la conexión
		Connection con = UtilsBD.conectarBD();

		try {
			// 1º - Creamos un Statement
			Statement stmt = con.createStatement();
			// 2º - Ejecutamos la query y los resultados quedan en el resultSet
			ResultSet rs = ModelCliente.getClientes(con);

			/**
			 * Funciones interesantes con resultset
			 * 
			 * rs.previous() hacia atras
			 * 
			 * rs.getFetchsize() cantidad de elementos
			 * 
			 * rs.beforeFirst() lo mueve al principio
			 * 
			 * rs.afterLast() lo mueve al final
			 * 
			 * rs.getArray(column) devuelve todos los datos de una columna en un array
			 */

			// Getfetchsize devuelve la cantidad de elementos
			System.out.println("Hay " + rs.getFetchSize() + " registros");

			while (rs.next()) {
				System.out.print("Nombre: " + rs.getString("nombre") + ", ");
				System.out.print("Edad: " + rs.getString("edad") + ", ");
				System.out.println("Sexo: " + rs.getString(5));
			}

			// Modificación
			int numAff = stmt.executeUpdate("UPDATE CLIENTE SET EDAD = EDAD + 1 WHERE SEXO = 'M'");
			System.out.println("Se ha modificado " + numAff + " columnas");

			int idCliente = 3;
			ClienteDO cliente = new ClienteDO(idCliente, null, "Juarez Morales", -1, ' ', null, null);
			numAff = ModelCliente.updateCliente(con, cliente);
			System.out.println(numAff);

			// Borrado
//			numAff = stmt.executeUpdate("DELETE FROM CLIENTE WHERE idCliente = 1");
			numAff = ModelCliente.removeCliente(con, 1);

			// Inserción de registros
			ClienteDO clienteLuismi = new ClienteDO(idCliente, "LuisMi", "Toscano", 19, 'M', "luismi@gmail.com",
					"343355345435D");
			// numAff = ModelCliente.insertCliente(con, clienteLuismi);
//			stmt.executeUpdate(
//					"INSERT INTO cliente VALUES(1, 'Alan Bowers', 'Kylie Mcleod', 61, 'F', 'enim.mi.tempor@icloud.com', 'OFO38CRF5IB')");
//			System.out.println("se han insertado " + numAff + " columnas");

			// Cargamos las facturas de clientes
			rs = ModelFactura.getFacturaCliente(con, 2);
			while (rs.next()) {
				System.out.print("CIF: " + rs.getString("CIF") + ", ");
				System.out.print("Nombre de la empresa: " + rs.getString("nombreEmpresa") + ", ");
				// También se puede poner la posición de la tabla
				System.out.println("Id del cliente: " + rs.getString("idCliente"));
			}

			rs = ModelCliente.getCliente(con, 18);
			// Nos posicionamos en el primer registro
			rs.next();
			// sacamos los datos del cliente 18
			System.out.print("Nombre: " + rs.getString("nombre") + ", ");
			System.out.print("Edad: " + rs.getString("edad") + ", ");
			System.out.println("Sexo: " + rs.getString(5));
			// Para cerrar la conexion
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
