package Repas_Java;
import java.util.Scanner;
import java.util.ArrayList;



public class Usuari {
	Scanner llegir = new Scanner(System.in);
	//Atributs
	
	static ArrayList<ex1> llibresP = new ArrayList<>();
	private ex1[] llibres;
	
	String nom;
	String cognom;
	String dni;
	int edat;
	int contadorLlibres = 0;

	//Tamany maxim si ho fem en array en compte de arrayList
	public static final int MAX_LLIBRES = 5;
	
	public Usuari(String n, String c, String d, int e) {
		this.nom = n;
		this.cognom = c;
		this.dni = d;
		this.edat = e;
		this.llibres = new ex1[MAX_LLIBRES];
		
	}
	
	public Usuari(Usuari User) {
		this.nom = User.nom;
		this.cognom = User.cognom;
		this.dni = User.dni;
		this.edat = User.edat;
		this.llibres = new ex1[MAX_LLIBRES];
		this.contadorLlibres = User.contadorLlibres;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getCognom()
	{
		return cognom;
	}
	
	public String getDni() {
		return dni;
	}
	
	public int getEdat() {
		return edat;
	}
	
	public void mostrar() {
		System.out.println(this.nom + this.cognom + this.dni + this.edat);
		for (ex1 a : llibresP) {
			a.mostrar();
		}
	}
	
	public void llevarLlibre(ex1 llibre) {
		llibresP.remove(llibre);
	}
	
	public void prestarLlibre(ex1 llibre) {
		llibresP.add(llibre);
	}
	

}
