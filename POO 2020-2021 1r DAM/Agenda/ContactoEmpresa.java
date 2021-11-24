package Agenda;

public class ContactoEmpresa extends contacto {

	protected String pag_web;
	
	public ContactoEmpresa(String nombre, String telefon, String pag_web) {
		super(nombre, telefon);
		this.pag_web = pag_web;
	}
	
	public String getPag() {
		return pag_web;
	}
	public void setPag(String pag_web) {
		this.pag_web = pag_web;
	}
	
	public void imprimir() 
	{
		System.out.println("El contacte " + nombre + " utilitza el telf: " + telefon + " i la seva pag web es: " + pag_web);
	}	
}
