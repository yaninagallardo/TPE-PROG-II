package Sistema.CriterioSistGanadero;

import Sistema.SistGanadero;

public class CriterioPromEdadMayor {
private double limite;
	
	
	public CriterioPromEdadMayor(double l) {
		this.limite = l;
	}
	
	public boolean cumple(SistGanadero sist) {
		if (sist.promedioEdad() > this.limite) {
			return true;
		}else {
			return false;
		}
	}
}
