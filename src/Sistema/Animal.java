package Sistema;

import java.util.ArrayList;
import java.util.List;

public class Animal extends SistGanadero{
	private int id;
	private int edad;
	private double peso;
	private String raza;
	private String sexo;
	private boolean gestor;
	
		public Animal(int id, int edad, double peso, String raza, String sexo, boolean gestor) {
		this.id=id;
		this.edad=edad;
		this.peso = peso;
		this.raza = raza;
		this.sexo = sexo;
		this.gestor = gestor;
	}
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public void setSexo(String s) {
		this.sexo = s;
	}

	public boolean isGestor() {
		return gestor;
	}

	public void setGestor(boolean gestor) {
		this.gestor = gestor;
	}

	//métodos del padre
	@Override
	public int getCantAnimales() {
		return 1;
	}

	@Override
	public double promedioEdad() {
		return this.edad;
	}

	@Override
	public double promedioPesoAnimal() {
		return this.peso;
	}

	@Override
	public double pesoTotal() {
		return this.peso;
	}

	@Override
	public List<SistGanadero> buscar(Criterio c) {
		List<SistGanadero> cumplen= new ArrayList<>();
		
		if (c.cumple(this)) {
			cumplen.add(this);
		}
		
		return cumplen;
	}

	@Override
	public double llenarCamion(Camion c) {
		// TODO Auto-generated method stub
		return 0;
	}

	//revisar COMO ELIMINAR EL ANIMAL
	@Override 
	public void eliminarAnimal(Animal a) {

	}

}
