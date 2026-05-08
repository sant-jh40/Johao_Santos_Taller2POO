package logica;

public class Pokémones {
	private String habitad;
	private String nombre;
	private double porcentajeDeAparicion;
	private int vida;
	private int ataque;
	private int ataqueEspecial;
	private int defensa;
	private int defensaEspecial;
	private int velocidad;
	private String tipo;

	public Pokémones(String nombre, String habitad, double porcentajeDeAparicion,
            int vida, int ataque, int defensa,
            int ataqueEspecial, int defensaEspecial, int velocidad, String tipo) {
		this.nombre = nombre;
        this.habitad = habitad;
        this.porcentajeDeAparicion = porcentajeDeAparicion;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.tipo = tipo;
        }
	public int calculadorDeStats() {
        return vida + ataque + defensa + ataqueEspecial + defensaEspecial + velocidad;
	}
	
	/* Getters */
	
	public String getNombre() {return nombre;}
	public String getHabitad() {return habitad;}
	public double getPorcentajeDeAparicion() {return porcentajeDeAparicion;}
	public int getVida() {return vida;}
	public int getAtaque() {return ataque;}
	public int getDefensa() {return defensa;}
	public int getAtaqueEspecial() {return ataqueEspecial;}
	public int getDefensaEspecial() {return defensaEspecial;}
	public int getVelocidad() {return velocidad;}
	public String getTipo() {return tipo;}
	
	public String toString() {
		return nombre + " | " + tipo + " | Stats totales: " + calculadorDeStats();
	}
	public Pokémones clonar() {
		return new Pokémones(this.nombre,this.habitad,this.porcentajeDeAparicion,this.vida,this.ataque,this.defensa,this.ataqueEspecial,this.defensaEspecial,this.velocidad, this.tipo);
	}
}