/* @author Miguel García Parrondo. @version 1.0*/

package servicios;

import java.util.Scanner;
import datos.CatalogoDatos;

public class CatalogoServicios {
	
	public void CatalogoServicios() {
		
	}
	
	public void IntroducirCatalogo() {
		System.out.println("Introduzca el nuevo género");
		Scanner scanner=new Scanner(System.in);
	    String generoNuevo=scanner.nextLine();
	    scanner.close();
	    CatalogoDatos nuevoCatalogo=new CatalogoDatos();
	    nuevoCatalogo.addCatalogo(generoNuevo);
	}

}
