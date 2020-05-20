package servicios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import datos.ClienteDatos;
import molde.Cliente;
import utilidades.LecturaDatos;

public class ClienteServicios {

	public static void addCliente() {
		System.out.println("Introduzca el nombre del cliente: ");
		String nombre = LecturaDatos.leerLinea();
		System.out.println("Introduzca la fecha de registro");
		int dia = LecturaDatos.leerInt("dia");
		int mes = LecturaDatos.leerInt("mes");
		int agno =LecturaDatos.leerInt("año");
		Date fecha = new Date(agno, mes, dia);
		ClienteDatos.addCliente(nombre, dia, mes, agno);

	}

	public static void eliminarCliente() {
		int idCliente = LecturaDatos.leerInt("Introduzca el Id de cliente que desea eliminar: "); // PEDIMOS EL DATO -->
																									// almacenamos en
																									// variable
		try {
			ClienteDatos.eliminarCliente(idCliente); // ELIMINAMOS CLIENTE (metodo comprueba antes de eliminar)
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Nino: he realizado este método modificar...comprobar mañana chicos.
	public static void modificarCliente() {

		int idCliente = LecturaDatos.leerInt("Introduzca el Id de cliente que desea modificar: "); // PEDIMOS EL DATO
																									// --> almacenamos
																									// en variable
		if (ClienteDatos.comprobarCliente(idCliente)) { // SI el cliente esta eN la BBDD

			/*
			 * String nombre=LecturaDatos.
			 * leerLine("Introduzca el nombre del cliente que desea modificar"); String
			 * fechaRegistroComoTexto =
			 * LecturaDatos.leerLine("Introduzca la fecha que desea modificar");
			 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); Date fechaRegistro
			 * = sdf.parse(fechaRegistroComoTexto);
			 */

			try {

				String nombre = LecturaDatos.leerLine("Introduzca el nombre del cliente que desea modificar");
				int dia = LecturaDatos.leerInt("Introduzca dia");
				int mes = LecturaDatos.leerInt("Introduzca mes");
				int agno = LecturaDatos.leerInt("Introduzca año");
				String fecha = agno + "-" + mes + "-" + dia;

				System.out.println(fecha);
				ClienteDatos.modificarCliente(idCliente, nombre, fecha); // MODIFICAMOS CLIENTE

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("El cliente no existe"); // SINO MOSTRAMOS MENSAJE
		}

	}

	public static void listaClientes() {
		ClienteDatos.listaClientes();
	}

	public static void buscarCliente() {
		System.out.println("¿Que nombre desea buscar?");
		Scanner scanner = new Scanner(System.in);
		String nombre = scanner.nextLine();
		scanner.close();
		ClienteDatos.buscarCliente(nombre);
	}
}
