package servicios;

import java.util.Date;
import java.util.Scanner;

import datos.UsuarioDatos;
import molde.Cliente;
import utilidades.LecturaDatos;

public class UsuarioServicios {
	public UsuarioServicios() {

	}

	public static void Preguntar() {
		System.out.println("Introduzca el nombre del cliente");
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();
		System.out.println("Introduzca la fecha de registro");
		System.out.println("dia");
		int dia = scanner.nextInt();
		System.out.println("mes");
		int mes = scanner.nextInt();
		System.out.println("año");
		int agno = scanner.nextInt();
		Date fecha = new Date(agno, mes, dia);
		scanner.close();
		UsuarioDatos nuevoUsuario = new UsuarioDatos();
		nuevoUsuario.addCliente(nombre, fecha);

	}

	public static int eliminarCliente(int idCliente) {
		Cliente persona = new Cliente();
		System.out.println("--Pido datos del cliente a eliminar");
		idCliente = LecturaDatos.leerInt("Introduzca el Id de cliente que desea eliminar: ");
		persona.setIdCliente(idCliente);
		return idCliente;

	}

	public static void addUsuario(String nombre, Date fecha) {
	}
}
