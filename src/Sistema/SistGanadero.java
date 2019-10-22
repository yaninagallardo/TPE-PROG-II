package Sistema;

public abstract class SistGanadero {
	
	
	public abstract int getCantAnimales();
	public abstract double promedioEdad();
	public abstract double promedioPesoAnimal();
	public abstract double pesoTotal();
	public abstract double buscar(Criterio c);
	public abstract double llenarCamion(Camion c);
	public abstract double eliminarAnimal(Animal a);
}
