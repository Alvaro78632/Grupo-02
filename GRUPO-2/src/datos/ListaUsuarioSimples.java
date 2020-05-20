package datos;
import java.sql.*;
import utilidades.Conectar;

public class ListaUsuarioSimples {
	
	public ListaUsuarioSimples() {
		
	}
	
	public void getListadoUsuarios() {
		try {
			Conectar conexion=new Conectar();
			Connection conexionBuena=conexion.Conexion();
			Statement pregunta=conexionBuena.createStatement();
			String query="SELECT nombre, tipoGenero FROM cliente, genero";
			ResultSet respuesta= pregunta.executeQuery(query);
			while (respuesta.next()) {
				System.out.println("Nombre de cliente: "+ respuesta.getString("nombre") + "Genero suscrito: "+respuesta.getString("tipoGenero"));
			}
		}catch (SQLException e) {
			System.out.println("Error al tomar datos de la base de datos");
		}
		
		
	}
	

	

}
