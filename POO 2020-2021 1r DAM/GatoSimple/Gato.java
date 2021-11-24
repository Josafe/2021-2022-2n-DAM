package GatoSimple;

public class Gato {
//ATRIBUTS DE L'OBJECTE
	private String color;
	private String raza;
	private int edad;
	private String sexe;
	private double pes;
	

//GETTERS
public String getColor() {
	return color;
}
public String getRaza() {
	return raza;
}
public int getEdad() {
	return edad;
}
public String getSexe() {
	return sexe;
}
public double getPes() {
	return pes;
}

public Gato(String color, String raza, int edad, String sexe, double pes) {
	
}
//SETTERS
public void setColor(String colorgat) {
	this.color = colorgat;
}
public void setRaza(String razagat) {
	this.raza = razagat;
}
public void setEdad(int edadgat) {
	this.edad = edadgat;
}
public void setSexe (String sexegat) {
	this.sexe = sexegat;
}
public void setPes (double pesgat) {
	this.pes = pesgat;
}

//METODOS
public void maulla() {
	System.out.println("Miaaaaau");
}

public void ronronea() {
	System.out.println("Rrrrr... Rrrrr... :)");
}

public void menja(String menjar) {
	System.out.println("Te menut, aqui tens menjar");
	
	if (menjar.equals("peix")) {
		System.out.println("M'agrada el peix, moltes gràcies");
	}
	else if (menjar.equals("Peix")) {
		System.out.println("M'agrada el peix, moltes gràcies");
	}
	else {
		System.out.println("No m'agrada el que m'has donat");
	}
}

public void baralla(Gato gat2) {
	
	if ((this.sexe == "Macho") && (gat2.getSexe() == "Macho")){
		System.out.println("Es macho, hem barallare amb ell");
	}
	else {
		System.out.println("Es hembra, no es necessari barallar-se");
	}
}

public void Descripcio(){
	for (int i = 0; i < 2; i++) {
		System.out.println("El gat (" + i + ") es de color - " + this.color + "\n i de la raça " + this.raza + "\n te una edat de - " + this.edad + "\n i es del sexe " + this.sexe + "\n i te un pes de " + this.pes);
		System.out.println("");
	}
}


}