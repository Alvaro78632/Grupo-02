package datos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import utilidades.Conectar;

public class CatalogoDatos {
	
	public CatalogoDatos() {
		
	}
	
	public static void addCatalogo(String genero) {
		try {
			 Conectar conexion=new Conectar();
			 Connection conexionBuena=conexion.Conexion();
			 Statement peticion=conexionBuena.createStatement();
			 peticion.executeUpdate("INSERT INTO genero(tipoGenero) VALUES ('"+genero+"')");
		}catch(SQLException e) {
		 System.out.println("Algo ha fallado en el insert de datos");
		
	}

}
}