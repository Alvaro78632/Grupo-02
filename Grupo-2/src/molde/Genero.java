package molde;

public class Genero {

	private int idGenero;
	private String tipoGenero;
	
	public Genero() {
		super();
	}

	public Genero(int idGenero, String tipoGenero) {
		super();
		this.idGenero = idGenero;
		this.tipoGenero = tipoGenero;
	}

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public String getTipoGenero() {
		return tipoGenero;
	}

	public void setTipoGenero(String tipoGenero) {
		this.tipoGenero = tipoGenero;
	}

	@Override
	public String toString() {
		return "Genero [idGenero=" + idGenero + ", tipoGenero=" + tipoGenero + "]";
	}
}
