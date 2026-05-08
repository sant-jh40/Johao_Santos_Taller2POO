package logica; // Johao Santos - 22.004.848-9 - ICCI

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Menu {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Pokémones> pokepoke = pokedex();

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

	public static ArrayList<Pokémones> pokedex() throws FileNotFoundException {
		Scanner lector = new Scanner(new File("Pokedex.txt"));

		ArrayList<Pokémones> listaDePokemones = new ArrayList<>();

		while (lector.hasNextLine()) {
			String linea = lector.nextLine();
			String[] partes = linea.split(";");
			Pokémones p = new Pokémones(partes[0], partes[1], Double.parseDouble(partes[2]),
					Integer.parseInt(partes[3]), Integer.parseInt(partes[4]), Integer.parseInt(partes[5]),
					Integer.parseInt(partes[6]), Integer.parseInt(partes[7]), Integer.parseInt(partes[8]), partes[9]);
			listaDePokemones.add(p);
		}
		lector.close();
		return listaDePokemones;
	}

	public static ArrayList<Gimnasio> lecturaDeGimnasios(ArrayList<Pokémones> pokepoke) throws FileNotFoundException {
		Scanner lector = new Scanner(new File("Gimnasios.txt"));

		ArrayList<Gimnasio> listaDeGimnasios = new ArrayList<>();

		while (lector.hasNextLine()) {
			String linea = lector.nextLine();
			String[] partes = linea.split(";");

			int nDeGimnasio = Integer.parseInt(partes[0]);
			String nombreLider = partes[1];
			boolean estado = false;
			int contador = Integer.parseInt(partes[3]);
			ArrayList<Pokémones> pokemonesDelGym = new ArrayList<>();

			for (int i = 4; i < contador + 4; i++) {
				pokemonesDelGym.add(buscarP(partes[i], pokepoke));
			}

			Gimnasio gym = new Gimnasio(nDeGimnasio, nombreLider, estado, pokemonesDelGym);
			listaDeGimnasios.add(gym);
		}
		lector.close();
		return listaDeGimnasios;
	}

	public static Pokémones buscarP(String nombre, ArrayList<Pokémones> pokedex) {
		for (Pokémones p : pokedex) {
			if (nombre.equals(p.getNombre())) {
				return p.clonar();
			}
		}
		return null; // Revisar si no encuentra el pokemon;
	}

	public static ArrayList<EntrenadorPokemon> altosMandos() throws FileNotFoundException {
		Scanner lector = new Scanner(new File("Altos Mandos.txt"));

		ArrayList<EntrenadorPokemon> listaDeAltosMandos = new ArrayList<>();

		while (lector.hasNextLine()) {
			String linea = lector.nextLine();
			String[] partes = linea.split(";");

			int nAltoMando = Integer.parseInt(partes[0]);
			String nombreAltoMando = partes[1];
			ArrayList<Pokémones> pokeAltMan = new ArrayList<>();

			for (int i = 2; i < 7; i++) {
				pokeAltMan.add(buscarP(partes[i], pokeAltMan));
			}
			EntrenadorPokemon aM = new EntrenadorPokemon(nAltoMando, nombreAltoMando, pokeAltMan);
			listaDeAltosMandos.add(aM);
		}
		return listaDeAltosMandos;
	}
	public static ArrayList<Habitats> habitats(ArrayList<Pokémones> pokepoke) throws FileNotFoundException {
		Scanner lector = new Scanner(new File("Habitats.txt"));
		
		ArrayList<Pokémones> pokePorHabitad = new ArrayList<>();
		ArrayList<Habitats> habitatsDisp = new ArrayList<>();
		
		while (lector.hasNext()) {
			String linea = lector.nextLine();			
			for (Pokémones p : pokepoke) {
				if (linea.equals(p.getHabitad())) {
					pokePorHabitad.add(p);
				}
			}
			Habitats h = new Habitats(linea, pokePorHabitad);
			habitatsDisp.add(h);
		}
		lector.close();
		return habitatsDisp;
	}
}
