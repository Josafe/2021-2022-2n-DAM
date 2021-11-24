package Herencia_polimorfisme;
import java.util.Scanner;
import java.util.ArrayList;



public class Usuari extends Material{
	Scanner llegir = new Scanner(System.in);
	//Atributs
	
	static ArrayList<ex1> llibresP = new ArrayList<>();
	private ex1[] llibres;
	
	static ArrayList<Material> materials = new ArrayList<>();

	
	//materials = new Llibre("2000","Sant Jordi", "Hi", 40);
	String nom;
	String cognom;
	String dni;
	int edat;
	int contadorLlibres = 0;

	//Tamany maxim si ho fem en array en compte de arrayList
	public static final int MAX_LLIBRES = 5;
	
	public Usuari(String n, String c, String d, int e, String codi, String titol) {
		super(codi,titol);
		this.nom = n;
		this.cognom = c;
		this.dni = d;
		this.edat = e;
		//this.llibres = new ex1[MAX_LLIBRES];
		
	}
	
	public Usuari(Usuari User, String codi, String titol) {
		super(codi,titol);
		this.nom = User.nom;
		this.cognom = User.cognom;
		this.dni = User.dni;
		this.edat = User.edat;
		//this.llibres = new ex1[MAX_LLIBRES];
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
	/*	for (ex1 a : llibresP) {
			a.mostrar();
		}
	}
	
	public void llevarLlibre(ex1 llibre) {
		llibresP.remove(llibre);
	}
	
	public void prestarLlibre(ex1 llibre) {
		llibresP.add(llibre);*/
	}
	
	public void afegirMaterial() {
		materials.add(new ex1("asd", "asd", "asdl", 12));
		materials.add(new Pelicula("2012", "2121-2nDAM"));
		
	}
	
	public void llevarMaterial(int posicio) {
		if (posicio >= 0 && posicio < contadorLlibres) {
			for(int i = 0; i < materials.size(); i++) {
				materials.remove(posicio);
			}
		}
	}
	
	

}
