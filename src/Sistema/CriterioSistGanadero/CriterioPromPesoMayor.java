package Sistema.CriterioSistGanadero;

import Sistema.SistGanadero;

public class CriterioPromPesoMayor implements CriterioSistGanadero{
	private double limite;
	
	
	public CriterioPromPesoMayor(double l) {
		this.limite = l;
	}
	
	public boolean cumple(SistGanadero sist) {
		if (sist.promedioPesoAnimal() > this.limite) {
			return true;
		}else {
			return false;
		}
	}
}
