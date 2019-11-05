package Sistema.CriterioSistGanadero;

import Sistema.SistGanadero;

public class CriterioOr implements CriterioSistGanadero{
	private CriterioSistGanadero c1;
	private CriterioSistGanadero c2;
	
	
	public CriterioOr(CriterioSistGanadero c1, CriterioSistGanadero c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public boolean cumple(SistGanadero sist) {
		if (c1.cumple(sist) || c2.cumple(sist)) {
			return true;
		}else {
			return false;
		}
	}

}
