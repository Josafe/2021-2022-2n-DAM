package Agenda;

public abstract class contacto {

	protected String nombre;
	protected String telefon;
	
	public contacto(String nombre, String telefon) {
		this.nombre = nombre;
		this.telefon = telefon;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTelf() {
		return telefon;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTelf(String telefon) {
		this.telefon = telefon;
	}
	public abstract void imprimir();
}
