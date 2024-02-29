package unidad4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	 * Recibe la conexión un idCliente y devuelve un ResultSet con los datos de ese
	 * ID
	 * 
	 * @param con
	 * @param idCliente
	 * @return
	 */
	public static ResultSet getCliente(Connection con, int idCliente) {
		try {
			// Creamos la sentencia a ejecutar
			String query = "SELECT * FROM CLIENTE WHERE idCliente=?";
			// 1º - Creamos un Prepared Statement
			PreparedStatement pstmt = con.prepareStatement(query);
			// 2º - Seleccionamos el valor a la ?
			pstmt.setInt(1, idCliente);
			// 3º - Ejecutamos la query y los resultados quedan en el resultSet
			ResultSet rs = pstmt.executeQuery();
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
			// Creamos una query
			String query = "DELETE FROM CLIENTE WHERE idCliente=?";

			// Creamos el preparedStatement
			PreparedStatement pstmt = con.prepareStatement(query);
			// Asignamos el valor a la ?
			pstmt.setInt(1, idCliente);

			// Borrado
			int numAff = pstmt.executeUpdate();

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
			// Creamos una query
			String query = "DELETE FROM CLIENTE WHERE email=?";

			// Creamos un PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(query);
			// Asignamos el email en la ?
			pstmt.setString(1, email);

			// Guardamos el número de filas afectadas por el borrado
			int numAff = pstmt.executeUpdate();

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

			String query = "INSERT INTO cliente (nombre, apellidos, edad, sexo, email,password) VALUES(?, ?, ?, ?, ?, ?)";

			// "1, 'Alan Bowers', 'Kylie Mcleod', 61, 'F', 'enim.mi.tempor@icloud.com',
			// 'OFO38CRF5IB')";
			// Creamos un PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(query);
			// Asignamos los valores a los ?
			pstmt.setString(1, cliente.getNombre());
			pstmt.setString(2, cliente.getApellidos());
			pstmt.setInt(3, cliente.getEdad());
			pstmt.setString(4, String.valueOf(cliente.getSexo()));
			pstmt.setString(5, cliente.getEmail());
			pstmt.setString(6, cliente.getPassword());

			// Guardamos el número de filas afectadas al ejecutar la query
			numAff = pstmt.executeUpdate(query);

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
			String query = "UPDATE CLIENTE SET ";

			// Si los campos no son nulos, los vamos añadiendo a la sentencia
			if (cliente.getNombre() != null) {
				query += "NOMBRE = ?";
				campoPrevio = true;
			}
			if (cliente.getApellidos() != null) {
				if (campoPrevio) {
					query += ", ";
				}
				query += "APELLIDOS = ?";
				campoPrevio = true;
			}
			if (cliente.getEdad() != -1) {
				if (campoPrevio) {
					query += ", ";
				}
				query += "EDAD = ?";
				campoPrevio = true;
			}
			if (cliente.getSexo() != ' ') {
				if (campoPrevio) {
					query += ", ";
				}
				query += "SEXO = ?";
				campoPrevio = true;
			}
			if (cliente.getEmail() != null) {
				if (campoPrevio) {
					query += ", ";
				}
				query += "EMAIL = ?";
				campoPrevio = true;
			}
			if (cliente.getPassword() != null) {
				if (campoPrevio) {
					query += ", ";
				}
				query += "PASSWORD = ?";
				campoPrevio = true;
			}

			query += " WHERE idCliente = ?";
			PreparedStatement pstmt = con.prepareStatement(query);

			// Enlazamos los datos a las ? del preparedStatement
			int posInterrogacion = 1;

			if (cliente.getNombre() != null) {
				pstmt.setString(posInterrogacion, cliente.getNombre());
				posInterrogacion++;
			}
			if (cliente.getApellidos() != null) {
				pstmt.setString(posInterrogacion, cliente.getApellidos());
				posInterrogacion++;
			}
			if (cliente.getEdad() != -1) {
				pstmt.setInt(posInterrogacion, cliente.getEdad());
				posInterrogacion++;
			}
			if (cliente.getSexo() != ' ') {
				pstmt.setString(posInterrogacion, String.valueOf(cliente.getSexo()));
				posInterrogacion++;
			}
			if (cliente.getEmail() != null) {
				pstmt.setString(posInterrogacion, cliente.getEmail());
				posInterrogacion++;
			}
			if (cliente.getPassword() != null) {
				pstmt.setString(posInterrogacion, cliente.getPassword());
				posInterrogacion++;
			}

			pstmt.setInt(posInterrogacion, cliente.getIdCliente());

			if (campoPrevio) {
				System.out.println(query);
				numAff = pstmt.executeUpdate();
			}

			return numAff;
		} catch (SQLException e) {
			e.printStackTrace();
			// Devolvemos el error
			return ERROR_SQL;
		}
	}

}
