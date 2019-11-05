package Sistema.CriteriosAnimal;

import Sistema.Animal;

public class CriterioAnd implements CriterioAnimal{
	private CriterioAnimal c1;
	private CriterioAnimal c2;
	
	public CriterioAnd(CriterioAnimal c1, CriterioAnimal c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public boolean cumple(Animal animal) {
		if(this.c1.cumple(animal) && this.c2.cumple(animal)) {
			return true;
		}else {
			return false;
		}
		
		
	}
}
