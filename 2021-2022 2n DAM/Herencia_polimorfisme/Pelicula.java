package Herencia_polimorfisme;

public class Pelicula extends Material {

	String titol;
	String codi;
	
	public Pelicula(String c, String t) {
		super(c, t);

	}

	public void setMaterial(String c, String t) {
		this.titol = t;
		this.codi = c;
	}
	
}
