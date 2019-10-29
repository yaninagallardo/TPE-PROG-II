package Sistema;

import java.util.ArrayList;
import java.util.List;

public class Grupo extends SistGanadero{
	private List<SistGanadero> elementos;
	private List<Criterio> criterios;
	
	public Grupo() {
		this.elementos = new ArrayList<>();
		this.criterios = new ArrayList<>();
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
	public List<Animal> buscar(Criterio c) {
		List<Animal> cumplen= new ArrayList<>();
		
		for (int i=0; i < this.elementos.size(); i++) {
			SistGanadero elemen = this.elementos.get(i);
			
			cumplen.addAll(elemen.buscar(c));
		}
		return cumplen;
	}
	
	public List<SistGanadero> listoParaVender(){
		List<SistGanadero> venta = new ArrayList<>();
		
		for(int i=0; i < this.elementos.size(); i++) {
			for(int j=0; j < this.criterios.size(); j++) {
				
			}
		}
		
		return venta;
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
