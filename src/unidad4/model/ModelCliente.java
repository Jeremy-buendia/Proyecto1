package unidad4.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModelCliente {

	public static final int ERROR_SQL = -1;

	/**
	 * La función recibe una conexión y devuelve los datos de todos los Clientes
	 * 
	 * @param con
	 * @return Un resultset con los datos de los clientes o nulo si hay problemas
	 */
	public static ResultSet getClientes(Connection con) {
		try {
			// 1º - Creamos un Statement
			Statement stmt = con.createStatement();
			// 2º - Ejecutamos la query y los resultados quedan en el resultSet
			ResultSet rs = stmt.executeQuery("SELECT * FROM CLIENTE");
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * Borramos el cliente recibiendo su ID
	 * 
	 * @param con
	 * @param idCliente
	 * @return Número de columnas afectadas o -1
	 */
	public static int removeCliente(Connection con, int idCliente) throws SQLException {
		try {
			// Creamos un statement
			Statement stmt = con.createStatement();
			// Borrado
			int numAff = stmt.executeUpdate("DELETE FROM CLIENTE WHERE idCliente=" + idCliente);
			// Devolvemos el numero de columnas afectadas
			return numAff;
		} catch (SQLException e) {
			e.printStackTrace();
			con.rollback();
			return ERROR_SQL;
		}
	}

	/**
	 * Borramos el cliente recibiendo su email
	 * 
	 * @param con
	 * @param email
	 * @return Número de columnas afectadas o -1
	 */
	public static int removeCliente(Connection con, String email) {
		try {
			// Creamos un statement
			Statement stmt = con.createStatement();
			// Borrado
			int numAff = stmt.executeUpdate("DELETE FROM CLIENTE WHERE email=" + email);
			// Devolvemos el número de columnas afectadas
			return numAff;
		} catch (SQLException e) {
			e.printStackTrace();
			// Devolvemos el error
			return ERROR_SQL;
		}

	}

	/**
	 * Inserta en BD los datos del cliente
	 * 
	 * @param con
	 * @param cliente
	 * @return El número de columnas afectadas o -1
	 */
	public static int insertCliente(Connection con, ClienteDO cliente) {
		try {
			int numAff = ERROR_SQL;

			String query = "INSERT INTO cliente (nombre, apellidos, edad, sexo, email,password) VALUES('"
					+ cliente.getNombre();
			query += "','" + cliente.getApellidos();
			query += "'," + cliente.getEdad();
			query += ",'" + cliente.getSexo();
			query += "','" + cliente.getEmail();
			query += "','" + cliente.getPassword() + "')";

			// "1, 'Alan Bowers', 'Kylie Mcleod', 61, 'F', 'enim.mi.tempor@icloud.com',
			// 'OFO38CRF5IB')";
			// Creamos un statement
			Statement stmt = con.createStatement();

			// Ejecutamos la query
			numAff = stmt.executeUpdate(query);

			// Devolvemos el numero de columnas afectadas
			return numAff;
		} catch (SQLException e) {
			e.printStackTrace();
			// Devolvemos el error
			return ERROR_SQL;
		}
	}

	/**
	 * Funcion que recibe un clienteDO y modifica los campos del cliente que no sean
	 * nulos
	 * 
	 * @param con
	 * @param cliente
	 * @return
	 */
	public static int updateCliente(Connection con, ClienteDO cliente) {
		try {
			boolean campoPrevio = false;
			int numAff = ERROR_SQL;
			Statement stmt = con.createStatement();
			String query = "UPDATE CLIENTE SET ";

			// Si los campos no son nulos, los vamos añadiendo a la sentencia
			if (cliente.getNombre() != null) {
				query += "NOMBRE = '" + cliente.getNombre() + "'";
				campoPrevio = true;
			}
			if (cliente.getApellidos() != null) {
				if (campoPrevio) {
					query += ", ";
				}
				query += "APELLIDOS = '" + cliente.getApellidos() + "'";
				campoPrevio = true;
			}
			if (cliente.getEdad() != -1) {
				if (campoPrevio) {
					query += ", ";
				}
				query += "EDAD = " + cliente.getEdad();
				campoPrevio = true;
			}
			if (cliente.getSexo() != ' ') {
				if (campoPrevio) {
					query += ", ";
				}
				query += "SEXO = '" + cliente.getSexo() + "'";
				campoPrevio = true;
			}
			if (cliente.getEmail() != null) {
				if (campoPrevio) {
					query += ", ";
				}
				query += "EMAIL = '" + cliente.getEmail() + "'";
				campoPrevio = true;
			}
			if (cliente.getPassword() != null) {
				if (campoPrevio) {
					query += ", ";
				}
				query += "PASSWORD = '" + cliente.getPassword() + "'";
				campoPrevio = true;
			}

			query += " WHERE idCliente = " + cliente.getIdCliente();

			if (campoPrevio) {
				numAff = stmt.executeUpdate(query);
			}

			return numAff;
		} catch (SQLException e) {
			e.printStackTrace();
			// Devolvemos el error
			return ERROR_SQL;
		}
	}

}
