package POO.Constructors;
public class Articulo
{
String nombre;
int precio;
int iva;
int stock;
double pvp;

String nom;
String model;
double IVA;
double preu;

//CONSTRUCTOR, sempre es diu igual que la classe
public Articulo(String nombre, int precio, int iva, int stock){
	
	if(nombre == "") {
		System.err.println("Error, el nom no pot estar buit");
	}
	else if(precio <= 0) {
		System.err.println("Error, el preu no pot ser menor a 0");
	}
	else if(iva != 21) {
		System.err.println("Error, l'IVA español es 21%");
	}
	else if (stock < 0) {
		System.err.println("Error, no pot haver stock negatiu");
	}
	else {
	this.nombre = nombre;
	this.precio = precio;
	this.iva = iva;
	this.stock = stock;
	}
}

//SOBRECARREGA DE CONSTRUCTOR, amb el mateix nom pero diferents atributs
public Articulo(String nom, String model, double IVA, double preu){
		this.nom = nom;
		this.model = model;
		this.IVA = IVA;
		this.preu = preu;
	}


}

