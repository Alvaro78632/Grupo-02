package utilidades;

import java.sql.*;

public class Conectar {

	public static Connection Conexion() {
		Connection conexion = null;

		String contrasenya = "root";
		String usuario = "root";
		String bbdd = "MovieFlix";
		String url = "jdbc:mysql://localhost:3306/";
		String prop = "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

		/*
		 * String contrasenya = "S$+&Cl[pEbU~Rw$3"; String usuario =
		 * "id13773954_prueba"; String bbdd = "id13773954_movieflix"; String url =
		 * "jdbc:mysql://movieflix2.000webhostapp.com/"; String prop =
		 * "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		 */

		try {
			// ¿Para que se usa el nombreDriver?
			// String nombreDriver = "com.mysql.jdbc.Driver";
			// el local host y el nombre baseDatos es generico, habra que cambiarlo
			// String driverUrl = "jdbc:mysql://localhost/baseDatos";
			conexion = DriverManager.getConnection(url + "" + bbdd + "?" + prop, usuario, contrasenya);
		} catch (SQLException e) {
			System.out.println("Error de conexion");
			System.out.println(e.toString());
			// Crear un metodo para que escriba este error en un fichero
		}
		return conexion;

	}
}