package Herencia_polimorfisme;

public abstract class Material {
	
	protected String codi;
	protected String titol;

	public Material(String c, String t) {
		this.codi = c;
		this.titol = t;
	}
	
	public String getCodi() {
		return codi;
	}
	public String getTitol() {
		return titol;
	}
	
	public void setCodi(String codi) {
		this.codi = codi;
	}
	public void setTitol(String titol) {
		this.titol = titol;
	}
	
	public void mostrar() {
		System.out.println("Titol " + titol + " codi " + codi);
	}
	
	
}
