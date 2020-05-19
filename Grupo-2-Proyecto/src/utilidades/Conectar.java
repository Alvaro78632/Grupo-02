package utilidades;

import java.sql.*;

public class Conectar {

	public static Connection Conexion() {
		Connection conexion = null;
		String contrasenya = "root";
		String usuario = "root";
		try {
			// ¿Para que se usa el nombreDriver?
			String nombreDriver = "com.mysql.jdbc.Driver";
			// el local host y el nombre baseDatos es generico, habra que cambiarlo
			String driverUrl = "jdbc:mysql://localhost/baseDatos";
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/baseDatos", usuario, contrasenya);
		} catch (SQLException e) {
			System.out.println("Error de conexion");
			// Crear un metodo para que escriba este error en un fichero
		}
		return conexion;

	}
}