package Mascotas;

public class Canarios extends 
Aves {

	private String origen;
	private boolean habla;
	
	public Canarios(String origen, boolean habla, String nombre, int edad, String estado, String fechaN, String pico, boolean vuela) {
		super(nombre, edad, estado, fechaN, pico, vuela);
		this.origen = origen;
		this.habla = habla;
	}
	
	//L'OVERRIDE S'UTILITZA EXCLUSIVAMENT EN ELS METODES DE LES CLASSES FILLES QUE TENIM DEFINIDA EN LA CLASSE PARE
	
	@Override
	public void volar() {
		System.out.println("L'animal vola (Canari)");
	}
	public void muestra() {
		System.out.println("L'animal es mostra (Canari)");
	}
	public void hablar() {
		System.out.println("L'animal parla (Canari)");
	}
	
}
