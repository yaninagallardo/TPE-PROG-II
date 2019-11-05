package Sistema.CriteriosAnimal;

import Sistema.Animal;

public class CriterioEdadMayor implements CriterioAnimal{
	private int limite;
	
	public CriterioEdadMayor (int l) {
		this.limite = l;
	}
	@Override
	public boolean cumple(Animal animal) {
		if(animal.getEdad() > limite) {
			return true;
		}else {
			return false;
		}
		
		
	}

}
