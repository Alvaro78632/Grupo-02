package datos;

import servicios.ClienteServicios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;
import utilidades.Conectar;

public class ClienteDatos {
	public static void addCliente(String nombre, int dia, int mes, int agno) {

		String fecha = agno + "-" + mes + "-" + dia;
		try {
			String nombreBueno = nombre;
			// Date fechaBuena = fecha;
			Statement peticion = null;
			Connection conexionBuena = Conectar.Conexion();
			peticion = conexionBuena.prepareStatement("insertTableSQL");
			peticion.executeUpdate(
					"INSERT INTO cliente(nombre, fechaRegistro) VALUES ('" + nombreBueno + "' , '" + fecha + "')");

		} catch (SQLException e) {
			System.out.println("Algo ha fallado en el insert de datos");
			System.out.println(e.toString());
		}

	}

	public static void eliminarCliente(int idCliente) throws Exception {

		if (comprobarCliente(idCliente)) {
			try {
				Connection conexionBuena = Conectar.Conexion();
				Statement st = conexionBuena.createStatement();
				String sql = "DELETE FROM cliente  WHERE idCliente='" + idCliente + "';";
				st.executeUpdate(sql);
				System.out.println("Cliente borrado corectamente.");

			} catch (SQLException e) {
				throw new Exception("--- Epic Fail al obtener listado Peliculas ---", e);
			}
		}
	}

	public static boolean comprobarCliente(int idCliente) {

		// METODO COMPROBAR Cliente
		try {
			Connection conexionBuena = Conectar.Conexion();
			Statement st = conexionBuena.createStatement();
			String sql = "SELECT * FROM cliente WHERE idCliente='" + idCliente + "';";
			ResultSet rs = st.executeQuery(sql);

			if (!rs.next()) {
				System.out.println("El Cliente existe no existe");
				return false;
			} else {
				System.out.println("El cliente existe");
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Fallo con la base de datos.\n" + e);
			return false;
		}

	}

	// Nino: Método modificar...comprobar mañana chicos
	public static void modificarCliente(int idCliente, String nombre, String fechaRegistro) {
		if (comprobarCliente(idCliente)) {

			try {
				Connection conexionBuena = Conectar.Conexion();
				Statement st = conexionBuena.createStatement();
				String sql = "UPDATE cliente SET  nombre = '" + nombre + "', fechaRegistro = '" + fechaRegistro
						+ "' WHERE idCliente='" + idCliente + "';";
				st.executeUpdate(sql);
				System.out.println("Cliente modificado correctamente.");

			} catch (SQLException e) {
				System.out.println("--- Epic Fail al modificar cliente ---" + e);
			}
		} else
			System.out.println("El Cliente no existe");
	}

	public static void listaClientes() {
		try {
			Connection conexionBuena = Conectar.Conexion();
			Statement st = conexionBuena.createStatement();
			String sql = "SELECT nombre FROM cliente;";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("nombre"));
			}
		} catch (SQLException e) {
			System.out.println("Fallo en seleccion de nombres");
		}
	}

	public static void buscarCliente(String nombre) {
		try {
			Connection conexionBuena = Conectar.Conexion();
			Statement st = conexionBuena.createStatement();
			String sql = "SELECT nombre FROM cliente WHERE nombre= '" + nombre + "';";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("nombre") + rs.getInt("idCliente"));
			}
		} catch (SQLException a) {
			System.out.println("Fallo en seleccion de clientes");
		}
	}

}