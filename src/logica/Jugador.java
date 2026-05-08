package logica;
import java.util.ArrayList;
public class Jugador{
	private String nombre;
	private ArrayList<PokemonesDelJugador> pokemones;
	private int medallas;
	private ArrayList<String> altosMandosDerrotados;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.pokemones = new ArrayList<>();
		this.medallas = 0;
		this.altosMandosDerrotados = new ArrayList<>();
	}

	/*public boolean tieneEspaciosDisponiblesEnElEquipo() {
		int contador = 0;
		for (PokemonesDelJugador p : pokemones) {
			
		}
	}*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<PokemonesDelJugador> getPokemones() {
		return pokemones;
	}

	public void setPokemones(ArrayList<PokemonesDelJugador> pokemones) {
		this.pokemones = pokemones;
	}

	public int getMedallas() {
		return medallas;
	}

	public void setMedallas(int medallas) {
		this.medallas = medallas;
	}
	
}
