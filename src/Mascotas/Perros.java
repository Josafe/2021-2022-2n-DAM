package Mascotas;

public class Perros extends
Animales {

	protected String raza;
	protected boolean pulgas;
	
	public Perros(String raza, boolean pulgas, String nombre, int edad, String estado, String fechaN) {
		super(nombre, edad, estado, fechaN);
		this.raza = raza;
		this.pulgas = pulgas;
	}
	
	public String getRaza(String raza) {
		return raza;
	}
	public boolean getPulgas (boolean pulgas) {
		return pulgas;
	}
	
	public void setRaza() {
		this.raza = raza;
	}
	public void setPulgas() {
		this.pulgas = pulgas;
	}
	
	public void muestra() {
		System.out.println("Accio muestra de la classe (Perro)");
	}
	public void hablar() {
		System.out.println("Guau, guau :P");
	}
}
