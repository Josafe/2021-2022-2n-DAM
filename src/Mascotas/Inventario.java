package Mascotas;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
	Scanner llegir = new Scanner(System.in);
	
	private ArrayList<Animales> LlistaAnimales = new ArrayList<>();
	Animales Llista[] = new Animales[5];
	
	private String MostraDatos(Animales a) {
		
		String dato = null;
		
		if (a instanceof Perros)
		{
			dato = a.nombre + "es un perro";
		}
		else if (a instanceof Gatos)
		{
			dato = a.nombre + "es un gato";
		}
		else if (a instanceof Loros)
		{
			dato = a.nombre + "es un loro";
		}
		else if (a instanceof Canarios) 
		{
			dato = a.nombre + "es un canario";
		}	
		
		return dato;
	}
	public void Llista() {

		System.out.println("Llista Animals");
	
		for (int i = 0; i < LlistaAnimales.size(); i++)
		{
			Animales a = LlistaAnimales.get(i);
			String tipo =  MostraDatos(a);
			String nombre = a.getNombre();
			System.out.println(i + ": " + tipo + " " + nombre);
		}
	}
	
	public void InsertarAnimal(Animales a) {
		LlistaAnimales.add(a);
	}
	
	public boolean eliminarAnimal(int indice) {
		if (indice >= 0 && indice < Animales.length()) {
			
		}
	}
	
}
	
	

