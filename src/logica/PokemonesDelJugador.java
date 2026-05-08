package logica;

public class PokemonesDelJugador extends Pokémones {

	private boolean estado;

	public PokemonesDelJugador(Pokémones base, boolean estado) {
		super(base.getNombre(), base.getHabitad(), base.getPorcentajeDeAparicion(), base.getVida(), base.getAtaque(),
				base.getDefensa(), base.getAtaqueEspecial(), base.getDefensaEspecial(), base.getVelocidad(),
				base.getTipo());
		this.estado = estado;

	}

	public boolean estaVivo() {
		return estado;
	}

	public void setEstaVivo(boolean estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return estado ? "Vivo" : "Debilitado";
	} // ejemplo del " ? "" : "" " en la hoja 226 del libro de POO

	public String toString() {
		return getNombre() + " | " + getTipo() + " | Stats totales: " + calculadorDeStats() + " | " + getEstado(); 
	}
}
