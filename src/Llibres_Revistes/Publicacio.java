package Llibres_Revistes;

public class Publicacio {

	protected String codi;
	protected String titol;
	protected int anypubli;
	
	public Publicacio (String codi, String titol, int anypubli) {
		this.codi = codi;
		this.titol = titol;
		this.anypubli = anypubli;
	}

	public String imprimir() {
		return "El codi del article: " + codi + " el titol de l'article " + titol + " l'any de publicació " + anypubli;
	}

}
