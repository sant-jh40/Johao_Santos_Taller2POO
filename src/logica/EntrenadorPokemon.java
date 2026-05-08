package logica;

import java.util.ArrayList;

public class EntrenadorPokemon {
	private String nombre;
	private ArrayList<Pokémones> equipoPokemonDelEntrenador;
	private int numero;
	
	public EntrenadorPokemon(int numero, String nombre, ArrayList<Pokémones> equipoPokemonDelEntrenador) {
		this.nombre = nombre;
		this.equipoPokemonDelEntrenador = new ArrayList<>();
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Pokémones> getEquipoPokemonDelEntrenador() {
		return equipoPokemonDelEntrenador;
	}
	public int getnumero() {
		return numero;
	}
	public void agregarPokemonesCapturados(Pokémones capturado) {
		equipoPokemonDelEntrenador.add(capturado);
	}
}
