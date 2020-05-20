package molde;

public class Pelicula {
	private int idPelicula;
	private String titulo;
	private int anyoEstreno;
	private int idGenero;

	public Pelicula() {
		super();
	}

	public Pelicula(int idPelicula, String titulo, int anyoEstreno, int idGenero) {
		super();
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.anyoEstreno = anyoEstreno;
		this.idGenero = idGenero;
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnyoEstreno() {
		return anyoEstreno;
	}

	public void setAnyoEstreno(int anyoEstreno) {
		this.anyoEstreno = anyoEstreno;
	}

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	@Override
	public String toString() {
		return "Peliculas [idPelicula=" + idPelicula + ", titulo=" + titulo + ", anyoEstreno=" + anyoEstreno
				+ ", idGenero=" + idGenero + "]";
	}
}
