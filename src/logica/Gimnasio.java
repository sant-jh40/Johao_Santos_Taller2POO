package logica;

import java.util.ArrayList;

public class Gimnasio {
	private int numeroDelGimnasio;
	private String nombreLider;
	private boolean estado;
	private ArrayList<Pokémones> listaDePokemonesDelGimnasio;
	
	public Gimnasio(int numeroDelGimnasio, String nombreLider, boolean estado, ArrayList<Pokémones> listaDePokemonesDelGimnasio) {
		
		this.numeroDelGimnasio = numeroDelGimnasio;
		this.nombreLider = nombreLider;
		this.estado = estado;
		this.listaDePokemonesDelGimnasio = listaDePokemonesDelGimnasio;
	}

	public int getNumeroDelGimnasio() {
		return numeroDelGimnasio;
	}

	public String getNombreLider() {
		return nombreLider;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public ArrayList<Pokémones> getListaDePokemonesDelGimnasio() {
		return listaDePokemonesDelGimnasio;
	}	
}
