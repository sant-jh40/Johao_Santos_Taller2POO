package logica; // Johao Santos - 22.004.848-9 - ICCI

import java.util.Scanner;
import java.io.*;

public class Menu {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int op = 0;
		do {
			menuInicial();
			do {
				try {
					op = Integer.parseInt(s.nextLine());
				} catch (NumberFormatException e) {
					System.out.print("Opción invalida\nIngrese una de las opciones presentadas (1, 2 o 3).\n> ");
					continue;
				}
				if (op < 1 || op > 3) {
					System.out.print("Opción invalida\nIngrese una de las opciones presentadas (1, 2 o 3).\n> ");
				}
			} while (op < 1 || op > 3);
			switch (op) {
			case 1:
				menuDeContinuar();
				do {
					try {
						op = Integer.parseInt(s.nextLine());
					} catch (NumberFormatException e) {
						System.out.print("Opción invalida.\nIngrese una de las opciones presentadas.\n> ");
					}
					if (op < 1 || op > 8) {
						System.out.print("Opción invalida.\nIngrese una de las opciones presentadas.\n> ");
					}
				} while (op != 8);
				switch (op) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					op = 3;
					System.out.println("Guardado exitoso!\nSaliendo...");
					break;
				}
				break;
			case 2:
				System.out.println("Iniciar una nueva partida.");
				break;
			case 3:
				System.out.println("Saliendo...");
				break;
			}
		} while (op != 3);
		s.close();
	}

	public static void menuInicial() {
		System.out.println("1) Continuar.");
		System.out.println("2) Nueva Partida.");
		System.out.println("3) Salir.");
		System.out.print("> ");
	}

	public static void menuDeContinuar() {
		System.out.println("1) Revisar equipo.");
		System.out.println("2) Salir a capturar.");
		System.out.println("3) Acceso al PC (cambiar Pokémon del equipo).");
		System.out.println("4) Retar un gimnasio.");
		System.out.println("5) Desafío al Alto Mando.");
		System.out.println("6) Curar Pokémon.");
		System.out.println("7) Guardar.");
		System.out.println("8) Guardar y Salir.");
		System.out.print("> ");
	}

	
}
