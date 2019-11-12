package src.menusCrud;

import java.util.Scanner;

public class menuMain {
	
	
	private boolean salir;
	private int opcion;
	
	
	public menuMain() {
		
	}
	
	public void display() {
	
	Scanner keyboard = new Scanner(System.in);
	do {
		System.out.println("~~~~~~~~~~MENÚ~~~~~~~~~\n");
		System.out.println("1.-Productos\n2.-Clientes\n3.-Categorias\n4.-Facturas\n5.-Salir\n");
		System.out.println("Seleccione(1|2|3|4|5): ");

		opcion = Integer.parseInt(keyboard.nextLine());
		salir = false;

		menuCategoria mC = new menuCategoria();
		menuClientes mCl = new menuClientes();
		menuFacturas mF = new menuFacturas();
		menuProductos mP = new menuProductos();
		switch (opcion) {

		case 1:
			System.out.println("Productos\n");// productos();
			mP.display();
			break;
		case 2:
			System.out.println("Cosa 1\n");//clientes();
			mCl.display();
			break;
		case 3:
			System.out.println("Cosa 3\n");// categorias();
			mC.display();
			break;
		case 4:
			System.out.println("Cosa 4\n");// facturas();
			mF.display();
			break;
		case 5:
			System.out.println("FUERA\n");// salirApp();

			salir = true;
			break;
		default:
			System.out.println("ACCION NO VALIDA!\n");
		}
	} while (!salir);
	}
}
