package Mascotas;

public abstract class Animales {

	protected String nombre;
	protected int edad;
	protected String estado;
	protected String fechaN;
	
	//CONSTRUCTOR
	public Animales (String nombre, int edad, String estado, String fechaN) {
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaN = fechaN;
	}
	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setFecha(String fechaN) {
		this.fechaN = fechaN;
	}
	
	//GETTERS
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getEstado() {
		return estado;
	}
	public String getFecha() {
		return fechaN;
	}
	
	
	//L'ABSTRACT COMPLIRA FUNCIONS DIFERENTS SEGONS LA SUBCLASSE D'ON LA CRIDES
	public abstract void muestra(); {
		
	}
	public String cumpleaños() {
		return "Tots neixen aixi que no es abstracta";
	}
	public String morir() {
		return "Tots moren aixi que no es abstracta";
	}
	public abstract void hablar(); {
		
	}
}
