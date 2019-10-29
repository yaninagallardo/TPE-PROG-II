package Sistema;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private SistGanadero empresa;
	private List<Categoria> categorias;
	
	public Sistema() {
		
	}
	
	public List<Animal> listoParaVender(Criterio c){
		List<Animal> cumplen = empresa.buscar(c);
			
		
		return cumplen;
	}
	
	public List<Animal> cargarCamion(Criterio c, int cant) {
		List<Animal> cumplen = empresa.buscar(c);
		
		if (cumplen.size() > cant) {
			cumplen = cumplen.subList(0, cant);
		}
		
		for (Animal elem : cumplen) {
			empresa.eliminarAnimal(elem);
		}
		
		return cumplen;
	}
	
	public List<String> categorias(Animal animal) {
		//recorrer lista de categorias y devolver string con los que hacen match (lista o concatenados)
		List<String> clasificaciones = new ArrayList<>();
		
		for(Categoria c: categorias) {
			if(c.cumpleEtiqueta(animal)) {
				clasificaciones.add(c.getEtiqueta());
			}
		}
		return clasificaciones;
	}
}
