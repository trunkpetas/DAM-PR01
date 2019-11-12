package src.menusCrud;

import java.util.Scanner;

public class menuClientes {
	
	
	private boolean salir;
	private int opcion;
	
	
	public menuClientes() {
		
	}
	
	public void display() {
	
	Scanner keyboard = new Scanner(System.in);
	do {
		System.out.println("~~~~~~~~~~MENÚ_CLIENTES~~~~~~~~~\n");
		System.out.println("1.-Añadir\n2.-Leer\n3.-Actualizar\n4.-Eliminar\n5.-Salir\n");
		System.out.println("Seleccione(1|2|3|4|5): ");

		opcion = Integer.parseInt(keyboard.nextLine());
		salir = false;
		switch (opcion) { 

		case 1:
			System.out.println("Añadir\n");// añadirClientes();
			
			break;
		case 2:
			System.out.println("Leer\n");// leerClientes();

			break;
		case 3:
			System.out.println("Actualizar\n");// actualizarClientes();
			break;
		case 4:
			System.out.println("Eliminar\n");// eliminarClientes();
			break;
		case 5:
			System.out.println("ATRÁS\n");// salirApp();

			salir = true;
			break;
		default:
			System.out.println("ACCION NO VALIDA!\n");
		}
	} while (!salir);
	}
}
