package control;

import java.util.InputMismatchException;

import utilidades.Imprimir;
import utilidades.LecturaDatos;
import utilidades.Menu;

public class Streaming {
	public static void inicio() {
		int a;
		boolean b=true;
		Imprimir.imprimir("Introduce un numero del 1 al 5.\n");
		Menu.Imprimir();
		while (b) {
			while (true) {
				try {
					a = LecturaDatos.leerInt();
					if (a > 5 || a < 0)
						throw new IllegalArgumentException("Introduce un numero del 1 al 5.");
					else
						break;
				} catch (InputMismatchException e) {
					Imprimir.imprimir(e + " Dame un numero.");
				} catch (IllegalArgumentException e) {
					System.err.println(e);
				}
			}
			switch (a) {
			case 1:
				// Menu.case1();
				Imprimir.imprimir("\nCaso 1 terminado.\n");
				break;
			case 2:
				// Menu.case2();
				Imprimir.imprimir("\nCaso 2 terminado.\n");
				break;
			case 3:
				// Menu.case3();
				Imprimir.imprimir("\nCaso 3 terminado.\n");
				break;
			case 4:
				// Menu.case4();
				Imprimir.imprimir("\nCaso 4 terminado.\n");
				break;
			case 5:
				b = false;
				Imprimir.imprimir("\nSaliendo...\n");
				break;
				//yguhij
			}
		}
	}
}
