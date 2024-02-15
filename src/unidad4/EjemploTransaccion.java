package unidad4;

import java.sql.Connection;
import java.sql.SQLException;

import unidad4.model.ClienteDO;
import unidad4.model.ModelCliente;
import unidad4.utils.UtilsBD;

public class EjemploTransaccion {

	public static void main(String[] args) {
		Connection con = UtilsBD.conectarBD();
		try {
			// Si ponemos autocommit a false, existe la posibilidad de borrar las
			// operaciones de bd que se hayan realizado
			con.setAutoCommit(false);

			ClienteDO juan = new ClienteDO(-1, "juan", "perez", 23, 'M', "email@mail2.com", "psdpsp");

			ModelCliente.insertCliente(con, juan);

			// Modificamos los datos de Juan
			juan.setIdCliente(102);
			juan.setApellidos("Picapiedra");
			juan.setEdad(45);

			ModelCliente.updateCliente(con, juan);

			ModelCliente.removeCliente(con, 67);

			// En el momento que haga commit se hacen permanentes en bd todas las
			// intrucciones ejecutadas
			con.commit();

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
