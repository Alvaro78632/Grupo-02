package control;

import servicios.CatalogoServicios;
import servicios.ClienteServicios;
import servicios.PeliculasServicio;
import java.util.InputMismatchException;

import datos.CatalogoDatos;
import utilidades.Imprimir;
import utilidades.LecturaDatos;
import utilidades.Menu;

public class Streaming {
	public static void inicio() {
		int a;
		boolean b = true;
		Imprimir.imprimir("Introduce un numero del 1 al 4.\n");
		Menu.Principal();
		while (b) {
			while (true) {
				try {
					a = LecturaDatos.leerInt();
					if (a > 9 || a < 0)
						throw new IllegalArgumentException("Introduce un numero del 1 al 5.");
					else
						break;
				} catch (InputMismatchException e) {
					Imprimir.imprimir(e + " Dame un numero.");
				} catch (IllegalArgumentException e) {
					System.err.println(e);
				}
			}
			switch (a) {
			case 1:
				Menu.Usuarios();
				a = LecturaDatos.leerInt("Elije opcion:");
				switch (a) {
				case 1:
					ClienteServicios.addCliente();
					break;
				case 2:
					ClienteServicios.eliminarCliente();
					break;
				case 3:
					ClienteServicios.modificarCliente();
				case 4:
					ClienteServicios.buscarCliente();
					break;
				case 5:
					ClienteServicios.listaClientes();
					break;
				case 6:
					Imprimir.imprimir("----EN DESARROLLO----");
					break;
				case 7:
					Imprimir.imprimir("----EN DESARROLLO----");
					break;
				case 8:
					Imprimir.imprimir("----EN DESARROLLO----");
					break;
				case 0:
					b = false;
					Imprimir.imprimir("\nSaliendo...\n");
					break;
				}
				break;
			case 2:
				Menu.Peliculas();
				a = LecturaDatos.leerInt("Elije opcion:");
				switch (a) {
				case 1:
					PeliculasServicio.addPelicula();
					break;
				case 2:
					PeliculasServicio.eliminarPelicula();
					break;
				case 3:

					break;
				case 4:
					PeliculasServicio.mostrarPeliculas();
					break;
				case 5:
					Imprimir.imprimir("----EN DESARROLLO----");
					break;
				case 6:
					Imprimir.imprimir("----EN DESARROLLO----");
					break;
				case 7:
					Imprimir.imprimir("----EN DESARROLLO----");
					break;
				case 0:
					b = false;
					Imprimir.imprimir("\nSaliendo...\n");
					break;
				}
				break;
			case 3:
				Menu.Catalogo();
				a = LecturaDatos.leerInt("Elije opcion:");
				switch (a) {
				case 1:
					CatalogoServicios.IntroducirCatalogo();
					break;
				case 2:
					Imprimir.imprimir("----EN DESARROLLO----");
					break;
				case 3:
					Imprimir.imprimir("----EN DESARROLLO----");
					break;
				case 4:
					Imprimir.imprimir("----EN DESARROLLO----");
				case 0:
					b = false;
					Imprimir.imprimir("\nSaliendo...\n");
					break;
				}
				break;
			case 0:
				b = false;
				Imprimir.imprimir("\nSaliendo...\n");
				break;
			}
		}
	}
}
