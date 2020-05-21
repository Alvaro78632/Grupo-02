package control;
// SERGIO

import servicios.CatalogoServicios;
import servicios.ClienteServicios;
import servicios.PeliculasServicio;
import java.util.InputMismatchException;
import java.util.Scanner;

import datos.CatalogoDatos;
import utilidades.Imprimir;
import utilidades.LecturaDatos;
import utilidades.Menu;

public class Streaming {
	public static void inicio() {
		int menu;
		boolean b = true;
		Imprimir.imprimir("Introduce un numero del 1 al 4.\n");
		while (b) {
				Menu.Principal();
				menu = LecturaDatos.leerInt();;
				switch (menu) {
				case 1:
					menu = LecturaDatos.leerInt("Elije opcion:");
					Menu.Usuarios();
					switch (menu) {
					case 1:
						ClienteServicios.addCliente();
						break;
					case 2:
						ClienteServicios.eliminarCliente();
						break;
					case 3:
						ClienteServicios.modificarCliente();
						break;
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
						Imprimir.imprimir("\nSaliendo...\n");
						break;
					}
					break;
				case 2:
					menu = LecturaDatos.leerInt("Elije opcion:");
					Menu.Peliculas();				
					switch (menu) {
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
						Imprimir.imprimir("\nSaliendo...\n");
						break;
					}
					break;
				case 3:
					menu = LecturaDatos.leerInt("Elije opcion:");
					Menu.Catalogo();
					switch (menu) {
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
