package Getter_Setter;
public class Articulo
{
private String nombre;
private int precio;
private int iva;
private int stock;
private double pvp;


//GETTER, declarat a la classe Articulo
public String getnombre() {
	return nombre;
}
public int getprecio() {
	return precio;
}
public int getiva() {
	return iva;
}
public int getstock() {
	return stock;
}
public double getpvp() {
	return pvp;
}


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
}
