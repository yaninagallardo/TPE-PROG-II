package Sistema;

import java.util.List;

public abstract class SistGanadero {
	
	
	public abstract int getCantAnimales();
	public abstract double promedioEdad();
	public abstract double promedioPesoAnimal();
	public abstract double pesoTotal();
	public abstract List<SistGanadero> buscar(Criterio c);  //acomodar
	public abstract double llenarCamion(Camion c);
	public abstract void eliminarAnimal(Animal a);
}
