package Equifutbolrepas;

public class Futbolista extends SeleccionFutbol{

	private int dorsal;
	private String demarca;
	
	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarca) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarca = demarca;
	}
	
	public void Entrevista() {
		System.out.println("El futbolista" + nombre + " amb la dorsal " + dorsal + " realitzara l'entrevista");
	}
	@Override
	public void concentrarse() {
		System.out.println("El futbolista " + nombre + " es concentra per al partit");
	}
	@Override
	public void viajar() {
		System.out.println("El futbolista " + nombre + " realitza el viatje");
	}
	@Override
	public void entrenar() {
		System.out.println("El futbolista " + nombre + " realitza l'entrenament");
	}
	@Override
	public void jugarPartido() {
		System.out.println("El futbolista " + nombre + " realitza el partit");
	}
	
	
}
