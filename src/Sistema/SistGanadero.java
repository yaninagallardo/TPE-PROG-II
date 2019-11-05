package Sistema;

import java.util.List;

import Sistema.CriterioSistGanadero.CriterioSistGanadero;
import Sistema.CriteriosAnimal.CriterioAnimal;

public abstract class SistGanadero {
	
	
	public abstract int getCantAnimales();
	public abstract double promedioEdad();
	public abstract double promedioPesoAnimal();
	public abstract double pesoTotal();
	public abstract List<Animal> buscar(CriterioAnimal c);
	public abstract List<SistGanadero> buscar(CriterioSistGanadero c);
	public abstract boolean eliminarAnimal(Animal a);
}
