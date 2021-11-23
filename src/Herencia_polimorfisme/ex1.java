package Herencia_polimorfisme;

public class ex1 extends Material{

	//Atributs o camps
	String codi;
	String titol;
	String autor;
	int numPag;
	
	
	
	//Constructor
	public ex1(String c, String t, String a, int n)
	{
		super(c,t); //Cridarem al constructor del pare (Material)
		this.codi = c;
		this.titol = t;
		this.autor = a;
		this.numPag = n;
		}
	
	//Metodes (mostra l'info del objecte)
	@Override
	public void mostrar() {
		System.out.println(codi + titol + autor + numPag);
	}
	
	public String getCodi() {
		return codi;
	}
	public String getTitol() {
		return codi;
	}
	public String getAutor() {
		return codi;
	}
	public int getNumPag() {
		return numPag;
	}
	
	public void setCodi(String c) {
		if(c != null && !c.equals(""))
		{
			codi = c;
		}
	}
	
	
}
