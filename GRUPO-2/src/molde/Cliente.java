package molde;

import java.util.Date;

public class Cliente {

	private int idCliente;
	private String nombre;
	private Date fechaRegistro;
	
	public Cliente() {
		super();
	}

	public Cliente(int idCliente, String nombre, Date fechaRegistro) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.fechaRegistro = fechaRegistro;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", fechaRegistro=" + fechaRegistro + "]";
	}
		
}
