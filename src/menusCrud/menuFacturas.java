package src.menusCrud;

import java.util.Scanner;

public class menuFacturas {
	
	
	private boolean salir;
	private int opcion;
	
	
	public menuFacturas() {
		
	}
	
	public void display() {
	
	Scanner keyboard = new Scanner(System.in);
	do {
		System.out.println("~~~~~~~~~~MEN�_FACTURAS~~~~~~~~~\n");
		System.out.println("1.-A�adir\n2.-Leer\n3.-Actualizar\n4.-Eliminar\n5.-Salir\n");
		System.out.println("Seleccione(1|2|3|4|5): ");

		opcion = Integer.parseInt(keyboard.nextLine());
		salir = false;
		switch (opcion) {

		case 1:
			System.out.println("A�adir\n");
			//a�adirFacturas();

			break;
		case 2:
			System.out.println("Leer\n");// leerFacturas();
			
			break;
		case 3:
			System.out.println("Actualizar\n");// actualizarFacturas();
			
			break;
		case 4:
			System.out.println("Eliminar\n");// eliminarFacturas();
			break;
		case 5:
			System.out.println("ATR�S\n");// salirApp();

			salir = true;
			break;
		default:
			System.out.println("ACCION NO VALIDA!\n");
		}
	} while (!salir);
	}
}
