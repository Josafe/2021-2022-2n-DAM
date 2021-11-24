package Static_final4;
public class Articulo
{
private String nombre;
private double precio;
private int iva;
private int stock;
private double pvp;

private final int iva_general = 21;
private final int iva_reducido = 10;
private final int iva_super_reducido = 4;

public String getnombre() {
	return nombre;
}
public double getprecio() {
	return precio;
}
public int getiva() {
	return iva;
}
public int getstock() {
	return stock;
}



public Articulo(String nombre, int precio, int iva_general, int stock){
	
	if(nombre == "") {
		System.err.println("Error, el nom no pot estar buit");
	}
	else if(precio <= 0) {
		System.err.println("Error, el preu no pot ser menor a 0");
	}
	else if(iva != 21) {
		System.err.println("Error, l'IVA espaÃ±ol es 21%");
	}
	else if (stock < 0) {
		System.err.println("Error, no pot haver stock negatiu");
	}
	else {
	this.nombre = nombre;
	this.precio = precio;
	this.iva_general = iva_general;
	this.stock = stock;
	}
}

public void imprime() {
	if (nombre == "") {
		System.out.println("Error, el nom no pot estar buit");
	}
	else if (precio < 0) {
		System.out.println("Error, el preu no pot ser negatiu");
	}
	else if (iva != 21) {
		System.out.println("Error, l'IVA español es del 21%");
	}
	else if (stock < 0) {
		System.out.println("Error, l'Stock no pot ser negatiu");
	}
	else {
	this.nombre = nombre;
	this.precio = precio;
	this.iva = iva;
	this.stock = stock;
	}
}

public void setnombre(String nombre) {
	if (nombre == "") {
		System.out.println("Error el nom no pot estar en blanc");
	}
	else {
		this.nombre = nombre;
	}
}

public void setprecio(double precio) {
	if (precio < 0) {
		System.out.println("Error, el preu no pot ser negatiu");
	}
	else {
		this.precio = precio;
	}
}
public void setiva (int iva) {
	if (iva != 21) {
		System.out.println("Error l'IVA español es del 21%");
	}
	else {
		this.iva = iva;
	}
}

public void setstock (int stock) {
	if (stock < 0) {
		System.out.println("Error, l'stock no pot ser negatiu");
	}else {
		this.stock = stock;
	}
}

public double getpvp() {
	return this.precio + (this.precio / 100 * this.iva);
}

public boolean vender (int stock) {
	int venut = this.getstock();
	if (stock > venut) {
		return false;
	}
	else
	{
		this.setstock(stock - venut);
		return true;
	}
}

public boolean almacenar(int stock) {
	int venut = this.getstock();
	if (stock + venut > 0) {
		this.setstock(stock + venut);
		return true;
	}
	else {
		return false;
	}
}
public void imprimir() {
	System.out.println("Nombre:" + this.getnombre() + "IVA: " + this.getiva() + "Precio: " + this.getprecio() + "PVP: " + this.getpvp() + "Unidades: " + this.getstock());
}
}
