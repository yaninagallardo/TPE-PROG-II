package Sistema.CriteriosAnimal;

import Sistema.Animal;

public class CriterioRaza implements CriterioAnimal{
	private String valor;
	
	public CriterioRaza (String palabra) {
		this.valor = palabra;
	}
	
	@Override
	public boolean cumple(Animal animal) {
		if (animal.getRaza().equals(this.valor)){
			return true;
		}else {
			return false;
		}
	}

}
