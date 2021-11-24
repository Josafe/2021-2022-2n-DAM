package Agenda;
import java.util.ArrayList;
import java.util.Scanner;


public class agenda {

Scanner llegir = new Scanner(System.in);

	protected ArrayList<contacto> Llista = new ArrayList<>();
	
	public agenda(){
		
	}
	
	public ArrayList getLlista() {
		return Llista;
	}
	public void setLlista(ArrayList Llista) {
		this.Llista = Llista;
	}
	
	public boolean existeC(contacto c) {
		boolean existe = false;
		
		for (contacto x : Llista) 
		{
			if (c.getNombre().equals(x.getNombre())) {
				System.out.println("El contacto ya existe");
				existe = true;
			}
			else
			{
			System.out.println("El contacto no existe");	
				existe = true;
			}
		}
		return existe;
	}
	
	public boolean añadirC(contacto c) {
		boolean contacto = false;
		
		for (contacto x : Llista) 
		{
			if (c.getNombre().equals(x.getNombre())) {
				System.out.println("No se puede añadir");
				contacto = false;
			}
			else
			{
			System.out.println("S'ha afegit correctament");	
				contacto = true;
			}
		}
		return contacto;
	}
	
	public boolean borrarC(contacto c) {
		boolean contacto = false;
		
		for (contacto x : Llista) 
		{
			if (c.getNombre().equals(x.getNombre())) {
				System.out.println("S'ha esborrat el contacte");
				contacto = false;
			}
			else
			{
			System.out.println("No es pot esborrar un contacte que no existeix");	
				contacto = true;
			}
		}
		return contacto;
	}
	
	public boolean buscarC(contacto c) {
		boolean contacto = false;
		
		for (contacto x : Llista) 
		{	
			System.out.println("");
			System.out.println("Introdueix el nom del contacte a buscar:");
			x.nombre = llegir.nextLine();
			
			if (x.getNombre().equals(c.getNombre())) {
				contacto = true;
				System.out.println("El contacte s'ha trobat: " + contacto);
			}
			else
			{
				contacto = false;
				System.out.println("No s'ha trobat el contacte: " + contacto);	
			}
		}
		System.out.println(contacto);
		return contacto;
	}

	//
	
	/*if(x.nombre.equals(c.nombre)) {
		System.out.println("El contacte s'ha introduit correctament");
		contacto = true;
	}
	else
	{
		System.out.println("El nom del contacte esta duplicat, tornal a introduir");
		contacto = false;
	}
	
x.telefon = llegir.nextLine();
}*/
		public void imprimir() 
		{
			for (contacto x : Llista) 
			{
			System.out.println("El contacte " + x.nombre + " utilitza el telf: " + x.telefon);
			}
		}	
}
