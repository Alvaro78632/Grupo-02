package servicios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import datos.PeliculaDatos;
import utilidades.Conectar;
import utilidades.LecturaDatos;

public class PeliculasServicio {

	public PeliculasServicio() {
	}

	public static void addPelicula() {
		try {
			Connection conexionBuena = Conectar.Conexion();
			Statement st2=conexionBuena.createStatement();
		    String sql2="Select * FROM genero;";
		    ResultSet rs=st2.executeQuery(sql2);
		    while(rs.next()) {
		    System.out.println(rs.getString("tipoGenero")+ " "+ rs.getInt("idGenero"));
		    }
			}catch (SQLException e) {
				System.out.println("Error de conexion");
			}
		String titulo = LecturaDatos.leerLine("Dime el titulo de la pelicula: ");
		int agno = LecturaDatos.leerInt("Dime el año de la pelicula: ");
		int tipoGenero = LecturaDatos.leerInt("Dime el id del genero de la pelicula: ");
		//LLAMAMOS A LA CAPA DATOS PASANDOLE LOS PARAMETROS --> PARA SER INSERTADOS EN LA BBDD
		PeliculaDatos.addPelicula(titulo, agno, tipoGenero);
	}
	
	public static void eliminarPelicula() {
		
	}

	public static void mostrarPeliculas() {
		PeliculaDatos.mostrarPeliculas();
	}

	public static void mostrarPeliculasPorGenero() {
		PeliculaDatos.mostrarPeliculasPorGenero();
	}
}
