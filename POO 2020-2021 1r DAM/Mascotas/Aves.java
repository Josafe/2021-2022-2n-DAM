package Mascotas;

public abstract class Aves extends
Animales {

	protected String pico;
	protected boolean vuela;
	
	public Aves(String nombre, int edad, String estado, String fechaN, String pico, boolean vuela) {
		super(nombre, edad, estado, fechaN);
		this.pico = pico;
		this.vuela = vuela;
	}
	//GETTERS
	public void getPico() {
		this.pico = pico;
	}
	public void getVuela() {
		this.vuela = vuela;
	}
	
	//SETTERS
	public String setPico(String pico) {
		return pico;
	}
	public boolean setvuela(boolean vuela) {
		return vuela;
	}
	
	
	public abstract void volar(); {
		
	}
}
