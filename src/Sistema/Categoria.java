package Sistema;

import Sistema.CriteriosAnimal.CriterioAnimal;

public class Categoria {
	private String etiqueta;
	private CriterioAnimal criterio;
	
	
	public Categoria(String eti, CriterioAnimal c) {
		this.etiqueta = eti;
		this.criterio = c;
	}
	
	
	public String getEtiqueta() {
		return etiqueta;
	}


	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}


	public CriterioAnimal getCriterio() {
		return criterio;
	}


	public void setCriterio(CriterioAnimal criterio) {
		this.criterio = criterio;
	}


	public boolean cumpleEtiqueta(Animal a) {
		return criterio.cumple(a);
		
	}
	
	
	/**
	 * hacer un criterio mas con sistGanadero de parametro (disponibleVenta)
	 */
}
