package Sobrecarrega_metodes;

public class Persona {

	String nom = "";
	String edad = "";
	String dni;
	String sexe = "home";
	int pes = 0;
	int altura = 0;
	
	// Un constructor por defecto.
	
	public Persona(String n, String e, String s, String d, int a, int p) {
		this.nom = n;
		this.edad = e;
		this.sexe = s;
		this.dni = d;
		this.pes = p;
		this.altura = a;
	}
	// Un constructor con el nombre, edad y sexo, el resto por defecto.
		
	public Persona(String n, String e, String s)
	{
		this.nom = n;
		this.edad = e;
		this.sexe = s;
	}
	// Un constructor con todos los atributos como parámetro.
			
	public void Persona(String nom, String edad, String sexe, String dni, int altura, int pes) {
		this.nom = nom;
		this.edad = edad;
		this.sexe = sexe;
		this.dni = "";
		this.pes = pes;
		this.altura = altura;
		
		
	}
	// Un constructor de copia.
	public Persona(Persona valors) {
		this.nom = valors.nom;
		this.edad = valors.edad;
		this.sexe = valors.edad;
		this.dni = valors.dni;
		this.pes = valors.pes;
		this.altura = valors.altura;
	}
	
	public void calcularIMC() {
		
		double IMC = 0;
		
		if (this.sexe.equals("home")){
			IMC = this.pes / this.altura*2;
		}
		else if (this.sexe.equals("dona")) {
			
			
		}
	}
}
