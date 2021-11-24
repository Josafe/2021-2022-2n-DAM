package Mascotas;

public class Loros extends
Aves {
	private String color;
	private boolean canta;
	
	public Loros(String color, boolean canta, String nombre, int edad, String estado, String fechaN, String pico, boolean vuela) {
		super(nombre, edad, estado, fechaN, pico, vuela);
		this.color = color;
		this.canta = canta;
	}

	public void muestra() {
		System.out.println("L'animal es mostra (Loro)");
	}
	public void saluda() {
		System.out.println("L'animal et saluda (Loro)");
	}
	public void volar() {
		System.out.println("L'animal vola (Loro)");
	}
	public void hablar() {
		System.out.println("L'animal parla (Loro)");
	}
}
