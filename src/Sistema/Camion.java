package Sistema;

import java.util.ArrayList;
import java.util.List;

public class Camion {
	private int capacidad;
	private List<Criterio> requisitos;
	
	public Camion (int c) {
		this.capacidad = c;
		this.requisitos = new ArrayList<>();
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<Criterio> getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(List<Criterio> requisitos) {
		this.requisitos = requisitos;
	}
	
	public void addRequisito(Criterio c) {
		if(c != null) {
			this.requisitos.add(c);
		}
	}
}
