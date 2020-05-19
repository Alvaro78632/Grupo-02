package datos;

import servicios.UsuarioServicios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;
import utilidades.Conectar;

public class UsuarioDatos {
	public static void addCliente(String nombre, Date fecha) {

		try {
			String nombreBueno = nombre;
			Date fechaBuena = fecha;
			Statement peticion = null;
			Connection conexionBuena = Conectar.Conexion();
			peticion = conexionBuena.prepareStatement("insertTableSQL");
			peticion.executeUpdate(
					"INSERT INTO cliente(nombre, fecha) VALUES ('" + nombreBueno + "' , '" + fechaBuena + "')");

		} catch (SQLException e) {
			System.out.println("Algo ha fallado en el insert de datos");
		}

	}

	public static void eliminarCliente(int idCliente) throws Exception {

		if (comprobarCliente(idCliente)) {
			try {
				Connection conexionBuena = Conectar.Conexion();
				Statement st = conexionBuena.createStatement();
				String sql = "DELETE * FROM cliente  WHERE idCliente='" + idCliente + "')";
				st.executeUpdate(sql);
				System.out.println("Cliente borrado corectamente.");

			} catch (SQLException e) {
				throw new Exception("--- Epic Fail al obtener listado Peliculas ---", e);
			}
		} else
			System.out.println("El Cliente no existe");
	}

	public static boolean comprobarCliente(int idCliente) {

		// METODO COMPROBAR Cliente
		try {
			Connection conexionBuena = Conectar.Conexion();
			Statement st = conexionBuena.createStatement();
			String sql = "SELECT * FROM cliente WHERE idCliente='" + idCliente + "')";
			ResultSet rs = st.executeQuery(sql);
			if (rs.getRow() > 0) {
				System.out.println("El Cliente existe");
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			System.out.println("Fallo con la base de datos.\n"+e);
			return false;
		}

	}

}