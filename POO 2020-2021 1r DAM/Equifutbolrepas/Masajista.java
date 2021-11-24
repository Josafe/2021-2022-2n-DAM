package Equifutbolrepas;

public class Masajista extends SeleccionFutbol {

	private String titulacio;
	private int experiencia;
	
	public Masajista(int id, String nombre, String apellidos, int edad, String titulacio, int experiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacio = titulacio;
		this.experiencia = experiencia;
	}
	
	public void massatge() { 
		System.out.println("El massagista " + nombre + " realitza el massatge");
	}
	@Override
	public void concentrarse() {
		System.out.println("L'entrenador " + nombre + " es concentra per al partit");
	}
	@Override
	public void viajar() {
		System.out.println("L'entrenador " + nombre + " dirigeix el viatje");
	}
	@Override
	public void entrenar() {
		System.out.println("L'entrenador " + nombre + " dirigeix l'entrenament");
	}
	@Override
	public void jugarPartido() {
		System.out.println("L'entrenador " + nombre + " dirigeix el partit");
	}
	
}
