/* @author Miguel García Parrondo. @version 1.0*/

package servicios;

import java.util.Scanner;
import datos.CatalogoDatos;

public class CatalogoServicios {

	public void CatalogoServicios() {

	}

	public static void IntroducirCatalogo() {
		String generoNuevo = LecturaDatos.leerLine("Introduzca el nuevo género");
		CatalogoDatos.addCatalogo(generoNuevo);
		nuevoCatalogo.addCatalogo(generoNuevo);
	}
	public static void buscarGenero() {
		System.out.println("¿Que genero desea buscar?");
		Scanner scanner = new Scanner(System.in);
		String genero = scanner.nextLine();
		scanner.close();
		CatalogoDatos.buscarGenero(genero);
	}

}
