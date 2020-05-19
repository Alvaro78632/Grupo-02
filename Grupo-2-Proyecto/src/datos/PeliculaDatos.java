package datos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import utilidades.Conectar;

public class PeliculaDatos {

	public static void addPelicula(String titulo, int agno, int tipoGenero) {
		try {
			Connection conexionBuena = Conectar.Conexion();

			Statement st = conexionBuena.createStatement();
			String sql = "INSERT INTO pelicula(titulo, anyoEstreno, idGenero) VALUES ('" + titulo + "' , '" + agno
					+ "', '" + tipoGenero + "')";
			st.executeUpdate(sql);

		} catch (SQLException e) {
			System.out.println("Algo ha fallado en el insert de datos");
		}

	}

	public void getListaPeliculas() {
		Conectar conexion = new Conectar();
		Connection conexionBuena = conexion.Conexion();
		// Statement pregunta=null; //Estos dos comandos sobran actualmente, lo dejo asi
		// por si lo preferis asi puesto
		// ResultSet respuesta=null;
		try {
			Statement pregunta = conexionBuena.createStatement();
			String query = "SELECT * FROM pelicula";
			ResultSet respuesta = pregunta.executeQuery(query);
			while (respuesta.next()) {
				System.out.println(respuesta.getString("titulo"));
				// La columna 1 deberia ser la de los nombres
			}

		} catch (SQLException e) {
			System.out.println("Error en selección de datos");
		}
	}

	public void getListaPeliculasGenero() {
		System.out.println("Introduzca el genero que quiere filtrar");
		Scanner scanner = new Scanner(System.in);
		String genero = scanner.next();
		scanner.close();
		try {
			Conectar conexion2 = new Conectar();
			Connection conexionBuena2 = conexion2.Conexion();
			Statement pregunta2 = conexionBuena2.createStatement();
			String query2 = "SELECT DISTINCT tipoGenero FROM genero WHERE tipoGenero='" + genero + "'";
			ResultSet respuesta2 = pregunta2.executeQuery(query2);

		} catch (SQLException e) {
			System.out.println("Genero mal introducido");

			Conectar conexion = new Conectar();
			Connection conexionBuena = conexion.Conexion();

			try {
				Statement pregunta = conexionBuena.createStatement();
				String query = "SELECT genero FROM pelicula";
				ResultSet respuesta = pregunta.executeQuery(query);
				while (respuesta.next()) {
					if (genero.equalsIgnoreCase(respuesta.getString("genero")))
						;
					System.out.println(respuesta.getString("titulo"));
					// La columna 1 deberia ser la de los nombres
				}

			} catch (SQLException a) {
				System.out.println("Error en selección de datos");

			}

		}
	}

}
