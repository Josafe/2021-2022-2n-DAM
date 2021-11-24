package Equifutbolrepas;

public class Entrenador extends SeleccionFutbol {

	private int idFederacio;
	
	public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacio) {
		super(id, nombre, apellidos, edad);
		this.idFederacio = idFederacio;
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
	public void massatge() { 
		System.out.println("El massagista realitza el massatge");
	}
}
