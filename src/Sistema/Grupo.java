package Sistema;

import java.util.ArrayList;
import java.util.List;

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
		
		//NO PUEDO CONTAR EL GRUPO SI SOLO PIDE LA CANTIDAD DE ANIMALES, POR LO QUE RETORNA CANT SOLO Y NO +1
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
	public List<SistGanadero> buscar(Criterio c) {
		List<SistGanadero> cumplen= new ArrayList<>();
		
		for (int i=0; i < this.elementos.size(); i++) {
			SistGanadero elemen = this.elementos.get(i);
			
			cumplen.addAll(elemen.buscar(c));
		}
		return cumplen;
	}

	@Override
	public double llenarCamion(Camion c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void eliminarAnimal(Animal a) {
		this.elementos.remove(a);
	}

}
