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
	}
	
	public static void eliminarCatalogo() {
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
		int idGenero=LecturaDatos.leerInt("Introduca el id del genero que desea borrar");
		CatalogoDatos.eliminarCatalogo(idGenero);
	}
	
	public static void buscarGenero() {
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
		int idGenero=LecturaDatos.leerInt("Introduzca el id del genero que desea buscar");
		CatalogoDatos.buscarGenero(idGenero);
	}

}
