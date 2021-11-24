package Llibres_Revistes;

public class Llibres extends Publicacio implements Prestable{
	
	protected boolean retornar;
	protected boolean prestado;
	protected boolean prestar;
	
	
	public Llibres (String codi, String titol, int anypubli) {
		super(codi, titol, anypubli);
		this.prestado = false;
	}
	
	public boolean prestar() {
		if (prestar = true) {	
			System.out.println("El llibre esta prestat actualment ");
			prestar = false;
		}
		else {
			System.out.println("El llibre es pot prestar actualment ");
			prestar = true;
		}
		return prestar;
	}
	public boolean prestado() {
		if (prestar = true) {
			System.out.println(" El llibre esta prestat actualment ");
			prestado = true;
		}
		else {
			System.out.println(" El llibre esta lliure actualment ");
			prestado = false;
		}
		return prestado;
	}
	public boolean retornar() {
		prestado = false;
		return prestado;
	}
	public String imprimir() {
		return "El codi del article: " + codi + " el titol de l'article " + titol + " l'any de publicació " + anypubli;
	}
	
}
