package Sistema.CriteriosAnimal;

import Sistema.Animal;

public class CriterioEdadMenor implements CriterioAnimal{
private int limite;
	
	public CriterioEdadMenor (int l) {
		this.limite = l;
	}
	@Override
	public boolean cumple(Animal animal) {
		if(animal.getEdad() < limite) {
			return true;
		}else {
			return false;
		}
		
		
	}
}
