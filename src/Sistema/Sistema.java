package Sistema;

import java.util.ArrayList;
import java.util.List;

import Sistema.CriterioSistGanadero.CriterioSistGanadero;
import Sistema.CriteriosAnimal.CriterioAnimal;

public class Sistema {
	private SistGanadero empresa;
	private List<Categoria> categorias;
	
	public Sistema() {
		
	}
	
	public List<SistGanadero> listosParaVender (CriterioSistGanadero c){
		List<SistGanadero> cumplen = empresa.buscar(c);
		
		return cumplen;
	}
	
	public List<Animal> cargarCamion(CriterioAnimal c, int capacidadCamion) {
		List<Animal> cumplen = empresa.buscar(c);
		
		if (cumplen.size() > capacidadCamion) {
			cumplen = cumplen.subList(0, capacidadCamion);
		}
		
		for (Animal elem : cumplen) {
			empresa.eliminarAnimal(elem);
		}
		
		return cumplen;
	}
	
	public List<String> categorias(Animal animal) {
		List<String> clasificaciones = new ArrayList<>();
		
		for(Categoria c: categorias) {
			if(c.cumpleEtiqueta(animal)) {
				clasificaciones.add(c.getEtiqueta());
			}
		}
		return clasificaciones;
	}
}
