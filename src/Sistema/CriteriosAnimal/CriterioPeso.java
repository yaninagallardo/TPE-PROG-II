package Sistema.CriteriosAnimal;

import Sistema.Animal;

public class CriterioPeso implements CriterioAnimal{
private int limite;
	
	public CriterioPeso (int l) {
		this.limite = l;
	}
	@Override
	public boolean cumple(Animal animal) {
		if(animal.getPeso() > limite) {
			return true;
		}else {
			return false;
		}
	}
}
