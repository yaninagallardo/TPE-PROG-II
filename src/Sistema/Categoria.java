package Sistema;

public class Categoria {
	private String etiqueta;
	private Criterio criterio;
	
	
	public Categoria(String eti, Criterio c) {
		this.etiqueta = eti;
		this.criterio = c;
	}
	
	
	public String getEtiqueta() {
		return etiqueta;
	}


	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}


	public Criterio getCriterio() {
		return criterio;
	}


	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}


	public boolean cumpleEtiqueta(Animal a) {
		return criterio.cumple(a);
		
	}
	
	
	/**
	 * hacer un criterio mas con sistGanadero de parametro (disponibleVenta)
	 */
}
