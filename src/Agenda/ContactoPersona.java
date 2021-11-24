package Agenda;

public class ContactoPersona extends contacto {


	protected String cumple;
	
	public ContactoPersona(String nombre, String telefon, String cumple) {
		super(nombre, telefon);
		this.cumple = cumple;
	}
	
	public String getCumple() {
		return cumple;
	}
	public void setCumple(String cumple) {
		this.cumple = cumple;
	}
	
	public void imprimir() 
	{
	System.out.println("El contacte " + nombre + " utilitza el telf: " + telefon + " i le seu aniversari es " + cumple);
	}
}
