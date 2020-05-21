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
			Statement st2=conexionBuena.createStatement();
		    String sql2="Select * FROM genero;";
		    ResultSet rs=st2.executeQuerry(sql2);
		    System.out.println(rs.next());
			Statement st = conexionBuena.createStatement();
			String sql = "INSERT INTO pelicula(titulo, anyoEstreno, idGenero) VALUES ('" + titulo + "' , '" + agno
					+ "', '" + tipoGenero + "')";
			st.executeUpdate(sql);
			System.out.println("Se ha insterdado correctamente");

		} catch (SQLException e) {
			System.out.println("Algo ha fallado en el insert de datos");
			System.out.println(e.toString());
		}

	}

	public static void eliminarPelicula(int cod) {
		if (comprobarPelicula(cod)) {
			Connection conexionBuena = Conectar.Conexion();
			Statement st;
			try {
				st = conexionBuena.createStatement();
				String sql = "DELETE FROM pelicula  WHERE idPelicula='" + cod + "';";
				st.executeUpdate(sql);
				System.out.println("Pelicula borrada corectamente.");
			} catch (SQLException e) {
				System.out.println(e.toString());
			}
		}
	}
	
	public static boolean comprobarPelicula(int cod) {
		try {
			Connection conexionBuena = Conectar.Conexion();
			Statement st = conexionBuena.createStatement();
			String sql = "SELECT * FROM pelicula WHERE idPelicula='" + cod + "';";
			ResultSet rs = st.executeQuery(sql);

			if (!rs.next()) {
				System.out.println("Pelicula no existe");
				return false;
			} else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Fallo con la base de datos.\n" + e);
			return false;
		}
	}

	public static void mostrarPeliculas() {
		Connection conexionBuena = Conectar.Conexion();
		try {
			Statement pregunta = conexionBuena.createStatement();
			String query = "SELECT * FROM pelicula";
			ResultSet respuesta = pregunta.executeQuery(query);
			if (!respuesta.next()) {
				System.out.println("No hay peliculas");
			} else {
				while (respuesta.next()) {
					System.out.println(respuesta.getString("idPelicula")+") "+respuesta.getString("titulo"));
					// La columna 1 deberia ser la de los nombres
				}
			}

		} catch (SQLException e) {
			System.out.println("Error en selección de datos");
		}
	}

	public static void mostrarPeliculasPorGenero() {
		System.out.println("Introduzca el genero que quiere filtrar");
		Scanner scanner = new Scanner(System.in);
		String genero = scanner.next();
		scanner.close();
		try {
			Connection conexionBuena2 = Conectar.Conexion();
			Statement pregunta2 = conexionBuena2.createStatement();
			String query2 = "SELECT * FROM genero, pelicula WHERE pelicula.idGenero = genero.idGenero AND genero.tipoGenero = '"
					+ genero + "' ";
			ResultSet respuesta2 = pregunta2.executeQuery(query2);
			if (!respuesta2.next()) {
				System.out.println("No hay peliculas del genero: " + genero);
			} else {
				while (respuesta2.next()) {
					System.out.println(respuesta2.getString("pelicula.titulo"));
				}
			}

		} catch (SQLException e) {
			System.out.println("Genero mal introducido");
		}
	}

}
