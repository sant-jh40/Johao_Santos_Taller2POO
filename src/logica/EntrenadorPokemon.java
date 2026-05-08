package logica;

import java.util.ArrayList;

public abstract class EntrenadorPokemon {
	protected String nombre;
	protected ArrayList<Pokémones> equipoPokemonDelEntrenador;
	
	public EntrenadorPokemon(String nombre) {
		this.nombre = nombre;
		this.equipoPokemonDelEntrenador = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Pokémones> getEquipoPokemonDelEntrenador() {
		return equipoPokemonDelEntrenador;
	}
	public void agregarPokemonesCapturados(Pokémones capturado) {
		equipoPokemonDelEntrenador.add(capturado);
	}
	public abstract String presentarse();
}
