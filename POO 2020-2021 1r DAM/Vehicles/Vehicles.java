package Vehicles;

public abstract class Vehicles {

	protected final String matricula;
	protected final String modelo;
	
	public Vehicles(String matricula, String modelo) {
		this.matricula = matricula;
		this.modelo = modelo;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public String getModelo() {
		return modelo;
	}
	
	public abstract void imprimir();
	
	public abstract void Validar();
}
