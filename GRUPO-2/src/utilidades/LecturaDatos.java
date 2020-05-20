package utilidades;

import java.util.Scanner;

public class LecturaDatos {

	public static String leerPalabra(String msg) {
		System.out.println(msg);
		return leerPalabra();
	}

	public static String leerPalabra() {
		return new Scanner(System.in).next();
	}

	public static String leerLine(String msg) {
		System.out.println(msg);
		return leerPalabra();
	}

	public static String leerLinea() {
		return new Scanner(System.in).nextLine();
	}

	public static int leerInt(String msg) {
		System.out.println(msg);
		return leerInt();
	}

	public static int leerInt() {
		return new Scanner(System.in).nextInt();
	}
}
