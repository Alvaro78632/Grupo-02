package datos;

import servicios.ClienteServicios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;
import utilidades.Conectar;

public class CatalogoDatos {

	public CatalogoDatos() {

	}

	public static void addCatalogo(String genero) {
		try {
			Connection conexionBuena = Conectar.Conexion();
			Statement peticion = conexionBuena.createStatement();
			peticion.executeUpdate("INSERT INTO genero(tipoGenero) VALUES ('" + genero + "')");
		} catch (SQLException e) {
			System.out.println("Algo ha fallado en el insert de datos");

		}

	}

	public static void eliminarCatalogo(int idGenero) {
		if (buscarGenero(idGenero)) {
			try {
				Connection conexionBuena = Conectar.Conexion();
				Statement st = conexionBuena.createStatement();
				String sql = "DELETE FROM genero WHERE genero.idGenero='" +idGenero + "';";
				st.executeUpdate(sql);
				System.out.println("Genero borrado corectamente.");

			} catch (SQLException e) {
				System.out.println("Fallo de conexion");
			}
		}
	}

	public static boolean buscarGenero(int idGenero) {
		try {
			Connection conexionBuena = Conectar.Conexion();
			Statement st = conexionBuena.createStatement();
			String sql = "SELECT * FROM genero WHERE genero.idGenero='" + idGenero + "';";
			ResultSet rs = st.executeQuery(sql);

			if (!rs.next()) {
				System.out.println("El genero existe no existe");
				return false;
			} else {
				System.out.println("El genero existe");
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Fallo con la base de datos.\n" + e);
			return false;
		}
	}

	public static void modificarCatalogo(int idGenero,String tipoGenero) {
		if (buscarGenero(idGenero)) {
			try {
				Connection conexionBuena = Conectar.Conexion();
				Statement st = conexionBuena.createStatement();
				String sql = "UPDATE genero SET tipoGenero='" + tipoGenero+  "' WHERE genero.idGenero='" +idGenero + "';";
				st.executeUpdate(sql);
				System.out.println("Genero modificado corectamente.");

			} catch (SQLException e) {
				System.out.println("Fallo de conexion");
			}
		}
	}
}