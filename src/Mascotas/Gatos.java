package Mascotas;

public class Gatos extends
Animales {
	private String color;
	private boolean peloLargo;
	
	public Gatos(String color, boolean peloLargo, String nombre, int edad, String estado, String fechaN) {
		super(nombre, edad, estado, fechaN);
		this.color = color;
		this.peloLargo = peloLargo;
	
	}
	
	@Override
	public void muestra() {
		System.out.println("L'animal es mostra (Gato)");
	}
	public void hablar() {
		System.out.println("Miauuu, brrrrrrr... (Gato)");
	}
}
