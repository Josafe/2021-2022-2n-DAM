package Recorregut_mapes;

public class Producte {

	String codi;
	String descripcio;
	float preu;
	
	public Producte (String c, String d, float p) {
		this.codi = c;
		this.descripcio = d;
		this.preu = p;
	}
	
	public String mostrar() {
		return codi + ": " + descripcio + " (" + preu + "€)";
	}
}
