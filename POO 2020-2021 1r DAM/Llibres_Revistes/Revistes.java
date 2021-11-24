package Llibres_Revistes;

public class Revistes extends Publicacio{
	
	protected boolean retornar;
	protected boolean prestado;
	protected boolean prestar;
	protected int num;
	
	public Revistes (String codi, String titol, int anypubli, int num) {
		super(codi, titol, anypubli);
		this.num = num;
	}
	
	public String imprimir() {
		return "El codi del article: " + codi + " el titol de l'article " + titol + " l'any de publicació " + anypubli;
	}
}
