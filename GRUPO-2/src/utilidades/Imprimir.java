package utilidades;

import java.util.List;

public class Imprimir {

	public static void imprimir(String msg) {
		System.out.print(msg);
	}

	public static void imprimir(double num) {
		System.out.print(num);
	}

	public static void imprimir(char i) {
		System.out.print(i);
	}

	public static void imprimir(short i) {
		System.out.print(i);
	}

	public static void imprimir(int i) {
		System.out.print(i);
	}

	public static void imprimir(List i) {
		System.out.print(i);
	}

	public static <T> void imprimir(T t) {
		System.out.println(t);
	}
}
