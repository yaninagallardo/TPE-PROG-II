package Sistema;

import java.util.List;

public abstract class SistGanadero {
	
	
	public abstract int getCantAnimales();
	public abstract double promedioEdad();
	public abstract double promedioPesoAnimal();
	public abstract double pesoTotal();
	public abstract List<Animal> buscar(Criterio c); 
	public abstract boolean eliminarAnimal(Animal a);
}
