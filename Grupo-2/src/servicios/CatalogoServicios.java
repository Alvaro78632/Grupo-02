/* @author Miguel Garc�a Parrondo. @version 1.0*/

package servicios;

import java.util.Scanner;
import datos.CatalogoDatos;
import utilidades.LecturaDatos;

public class CatalogoServicios {

	public void CatalogoServicios() {

	}

	public static void IntroducirCatalogo() {
		String generoNuevo = LecturaDatos.leerLine("Introduzca el nuevo g�nero");
		CatalogoDatos.addCatalogo(generoNuevo);
	}

	public static void buscarGenero() {
		String genero = LecturaDatos.leerLine("�Que genero desea buscar?");
		CatalogoDatos.buscarGenero(genero);
	}

}
