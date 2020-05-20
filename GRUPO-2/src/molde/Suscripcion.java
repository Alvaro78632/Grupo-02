package molde;

public class Suscripcion {

	private int idSuscripcion;
	private int idCliente;
	private int idGenero;
	
	public Suscripcion() {
		super();
	}
	
	public Suscripcion(int idSuscripcion, int idCliente, int idGenero) {
		super();
		this.idSuscripcion = idSuscripcion;
		this.idCliente = idCliente;
		this.idGenero = idGenero;
	}
	
	public int getIdSuscripcion() {
		return idSuscripcion;
	}
	
	public void setIdSuscripcion(int idSuscripcion) {
		this.idSuscripcion = idSuscripcion;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public int getIdGenero() {
		return idGenero;
	}
	
	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}
	
	@Override
	public String toString() {
		return "Suscripcion [idSuscripcion=" + idSuscripcion + ", idCliente=" + idCliente + ", idGenero=" + idGenero
				+ "]";
	}
}
