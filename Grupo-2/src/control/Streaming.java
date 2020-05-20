package control;
import servicios.ClienteServicios;
import servicios.PeliculasServicio;

import java.util.InputMismatchException;
import utilidades.Imprimir;
import utilidades.LecturaDatos;
import utilidades.Menu;

public class Streaming {
	public static void inicio() {
		int a;
		boolean b=true;
		Imprimir.imprimir("Introduce un numero del 1 al 9.\n");
		Menu.Imprimir();
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
				ClienteServicios.addCliente();
				break;
			case 2:
				ClienteServicios.eliminarCliente();
				break;
			case 3:
				ClienteServicios.modificarCliente();
				break;
			case 4:
				Imprimir.imprimir("----EN DESARROLLO----");
				break;
			case 5:
				PeliculasServicio.addPelicula();
				break;
			case 6:
				PeliculasServicio.mostrarPeliculas();
				break;
			case 7:
				PeliculasServicio.mostrarPeliculasPorGenero();
				break;
			case 8:
	
				break;
			case 9:
				b = false;
				Imprimir.imprimir("\nSaliendo...\n");
				break;
			}
		}
	}
	String "ADIOS";
}
