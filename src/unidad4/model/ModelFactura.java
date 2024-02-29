package unidad4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModelFactura {

	public static final int ERROR_SQL = -1;

	public static ResultSet getFacturas(Connection con) {
		try {
			// 1º - Creamos un Statement
			Statement stmt = con.createStatement();
			// 2º - Ejecutamos la query y los resultados quedan en el resultSet
			ResultSet rs = stmt.executeQuery("SELECT * FROM FACTURA");
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	public static ResultSet getFacturaCliente(Connection con, int idCliente) {
		try {
			// Para meter parametros en una query es obligatorio hacerlocon
			// prepareStatement, ya que evita la inyección SQL
			// 1º - creamos el preparestatement con la query y en la query ponemos ? en los
			// datos a introducir
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM FACTURA WHERE idCliente=?");
			// 2º - asignamos los valores a las ? poniendo el tipo de dato, la posición de
			// la interrogación y el valor de la variable
			pstmt.setInt(1, idCliente);
			// 2º - Ejecutamos la query y los resultados quedan en el resultSet
			ResultSet rs = pstmt.executeQuery();
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

	public static int removeFactura(Connection con, int idFactura) throws SQLException {
		try {
			// Creamos una query
			String query = "DELETE FROM FACTURA WHERE idFactura=?";

			// Creamos el preparedStatement
			PreparedStatement pstmt = con.prepareStatement(query);
			// Asignamos el valor a la ?
			pstmt.setInt(1, idFactura);

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

	public static int insertFactura(Connection con, FacturaDO factura) {
		try {
			int numAff = ERROR_SQL;

			String query = "INSERT INTO factura (cif, nombreEmpresa, idCliente) VALUES(?, ?, ?)";

			// Creamos un PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(query);
			// Asignamos los valores a los ?
			pstmt.setString(1, factura.getCif());
			pstmt.setString(2, factura.getNombreEmpresa());
			pstmt.setInt(3, factura.getIdCliente());

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

	public static int updateFactura(Connection con, FacturaDO factura) {
		try {
			boolean campoPrevio = false;
			int numAff = ERROR_SQL;
			String query = "UPDATE FACTURA SET ";

			// Si los campos no son nulos, los vamos añadiendo a la sentencia
			if (factura.getCif() != null) {
				query += "CIF = ?";
				campoPrevio = true;
			}
			if (factura.getNombreEmpresa() != null) {
				if (campoPrevio) {
					query += ", ";
				}
				query += "NOMBREEMPRESA = ?";
				campoPrevio = true;
			}
			if (factura.getIdCliente() != -1) {
				if (campoPrevio) {
					query += ", ";
				}
				query += "IDCLIENTE = ?";
				campoPrevio = true;
			}

			query += " WHERE idFactura = ?";
			PreparedStatement pstmt = con.prepareStatement(query);

			// Enlazamos los datos a las ? del preparedStatement
			int posInterrogacion = 1;

			if (factura.getCif() != null) {
				pstmt.setString(posInterrogacion, factura.getCif());
				posInterrogacion++;
			}
			if (factura.getNombreEmpresa() != null) {
				pstmt.setString(posInterrogacion, factura.getNombreEmpresa());
				posInterrogacion++;
			}
			if (factura.getIdCliente() != -1) {
				pstmt.setInt(posInterrogacion, factura.getIdCliente());
				posInterrogacion++;
			}

			pstmt.setInt(posInterrogacion, factura.getIdFactura());

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
