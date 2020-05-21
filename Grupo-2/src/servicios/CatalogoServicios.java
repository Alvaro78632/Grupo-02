package servicios;
import utilidades.LecturaDatos;
import servicios.ClienteServicios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;
import utilidades.Conectar;
/* @author Miguel García Parrondo. @version 1.0*/
import java.util.Scanner;
import datos.CatalogoDatos;
import datos.PeliculaDatos;

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
	
	public static void modificarCatalogo() {
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
		int id = LecturaDatos.leerInt("Inserte el id del genero a modificar");
		String newNombre = LecturaDatos.leerLine("Nuevo titulo de la genero");
		CatalogoDatos.modificarCatalogo(id, newNombre);
	}

}
