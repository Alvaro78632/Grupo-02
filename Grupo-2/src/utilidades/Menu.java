package utilidades;

public class Menu {
	public static void Principal() {
		Imprimir.imprimir(""
				+ "*     1.Gestion de usuario.\n"
				+ "*     2.Gestion de peliculas.\n"
				+ "*     3.Gestion de catalogos.\n"
				+ "*     0.Salir.\n");
	}
	public static void Usuarios() {
		Imprimir.imprimir("1.Añadir usuario.\n"
				+ "2.Eliminar usuario.\n"
				+ "3.Modificar usuario.\n"
				+ "4.Buscar usuario\n"
				+ "5.Imprimir lista simple de los usuarios.\n"
				+ "6.Listar peliculas disponibles del usuario.\n"
				+ "7.Listar peliculas vistas.\n"
				+ "8.Listar peliculas favoritas.\n"
				+ "0.Salir.\n");
	}
	public static void Peliculas() {
		Imprimir.imprimir("1.Añadir peliculas.\n"
				+ "2.Eliminar peliculas.\n"
				+ "3.Modificar peliculas.\n"
				+ "4.Listar todas las peliculas.\n"
				+ "5.Listar top10 de peliculas mas vistas.\n"
				+ "6.Listar top10 de peliculas mas valoradas.\\n"
				+ "7.Listar peliculas favoritas.\n"
				+ "0.Salir.");
	}
	public static void Catalogo() {
		Imprimir.imprimir("1.Añadir catalogo.\n"
				+ "2.Eliminar catalogo.\n"
				+ "3.Modificar catalogo.\n"
				+ "4.Listar todos los catalogos.\n"
				+ "0.Salir.\n");
	}
}
