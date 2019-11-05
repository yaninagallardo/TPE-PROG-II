package Sistema;

import java.util.ArrayList;
import java.util.List;

import Sistema.CriteriosAnimal.CriterioAnimal;

public class Camion {
	private int capacidad;
	private List<CriterioAnimal> requisitos;
	
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

	public List<CriterioAnimal> getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(List<CriterioAnimal> requisitos) {
		this.requisitos = requisitos;
	}
	
	public void addRequisito(CriterioAnimal c) {
		if(c != null) {
			this.requisitos.add(c);
		}
	}
}
