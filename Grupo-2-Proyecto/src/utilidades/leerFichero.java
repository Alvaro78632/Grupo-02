package utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class leerFichero {

	public void leerPeliculas() {
		File ficheroPeliculas = new File("peliculas_numCat.txt");
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(ficheroPeliculas);
			br = new BufferedReader(fr);
			
			String linea;
			
			while( (linea = br.readLine()) != null ) {
				
				String[] pelicula =  linea.split(",");
				
				String titulo = pelicula[0];
				int agno = Integer.parseInt(pelicula[1]);
				int tipoGenero = Integer.parseInt(pelicula[2]);
				
				// LLAMAR METODO INSERTAR PELICULA (CAPA DATOS)
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
