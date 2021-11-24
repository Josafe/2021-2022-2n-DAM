package Repas_Java;

public class ex1{

	//Atributs o camps
	String codi;
	String titol;
	String autor;
	int numPag;
	
	
	
	//Constructor
	ex1(String c, String t, String a, int n)
{
		codi = c;
		titol = t;
		autor = a;
		numPag = n;
		}
	
	//Metodes (mostra l'info del objecte)
	String mostrar() {
		return titol + autor + numPag;
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
