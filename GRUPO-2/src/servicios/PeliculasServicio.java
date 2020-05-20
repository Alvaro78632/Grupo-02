package servicios;

import datos.PeliculaDatos;
import utilidades.LecturaDatos;

public class PeliculasServicio {

	public PeliculasServicio() {
	}

	public static void addPelicula() {
		String titulo = LecturaDatos.leerLine("Dime el titulo de la pelicula: ");
		int agno = LecturaDatos.leerInt("Dime el año de la pelicula: ");
		int tipoGenero = LecturaDatos.leerInt("Dime el genero de la pelicula: ");
		// LLAMAMOS A LA CAPA DATOS PASANDOLE LOS PARAMETROS --> PARA SER INSERTADOS EN
		// LA BBDD
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
