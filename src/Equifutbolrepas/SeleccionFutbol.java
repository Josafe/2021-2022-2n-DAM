package Equifutbolrepas;
import java.util.ArrayList;

public abstract class SeleccionFutbol implements Interface {

	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
	this.id = id;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
	}
	
	@Override
	public void concentrarse() {
		System.out.println("Es concentra");
	}
	@Override
	public void viajar() {
		System.out.println("Realitza el viatje");
	}
	@Override
	public void entrenar() {
		System.out.println("Realitza l'entrenament");
	}
	@Override
	public void jugarPartido() {
		System.out.println("Realitza el partit");
	}
	public void massatge() { 
		System.out.println("El massagista " + nombre + " realitza el massatge");
	}
	
}
