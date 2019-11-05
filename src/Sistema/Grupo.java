package Sistema;

import java.util.ArrayList;
import java.util.List;

import Sistema.CriterioSistGanadero.CriterioSistGanadero;
import Sistema.CriteriosAnimal.CriterioAnimal;

public class Grupo extends SistGanadero{
	private List<SistGanadero> elementos;
	
	public Grupo() {
		this.elementos = new ArrayList<>();
	}
	
	public List<SistGanadero> getElementos() {
		return elementos;
	}

	public void setElementos(List<SistGanadero> elementos) {
		this.elementos = elementos;
	}
	
	public void addElementos(SistGanadero elemen) {
		this.elementos.add(elemen);
	}

	//metodos del padre
	@Override
	public int getCantAnimales() {
		int cant = 0;
		for(SistGanadero elem : this.elementos) {
			cant += elem.getCantAnimales();
		}
		
		return cant;
	}

	@Override
	public double promedioEdad() {
		int prom = 0;
		for(SistGanadero elem : this.elementos) {
			prom += elem.promedioEdad();
		}
		
		return (prom / this.getCantAnimales());
	}

	@Override
	public double promedioPesoAnimal() {
		return (this.pesoTotal() / this.getCantAnimales());
	}

	@Override
	public double pesoTotal() {
		int pesoTotal = 0;
		for(SistGanadero elem : this.elementos) {
			pesoTotal += elem.pesoTotal();
		}		
		return pesoTotal;
	}

	@Override
	public List<Animal> buscar(CriterioAnimal c) {
		List<Animal> cumplen= new ArrayList<>();
		
		for (int i=0; i < this.elementos.size(); i++) {
			SistGanadero elemen = this.elementos.get(i);
			
			cumplen.addAll(elemen.buscar(c));
		}
		return cumplen;
	}
	
	public List<SistGanadero> buscar(CriterioSistGanadero c){
		List<SistGanadero> cumplen = new ArrayList<>();
		
		for (SistGanadero sist : this.elementos) {
			cumplen.addAll(sist.buscar(c));
		}
		return cumplen;
	}

	@Override
	public boolean eliminarAnimal(Animal a) {
		if (this.elementos.contains(a)) {
			this.elementos.remove(a);
			return true;
		}else {
		
			for(SistGanadero elemen : elementos) {
				if(elemen.eliminarAnimal(a)) {
					return true;
				}
			}
		}
		return false;
	}

}
