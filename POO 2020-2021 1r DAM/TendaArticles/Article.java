package TendaArticles;

public class Article {

	private String codi;
	private String descripcio;
	private double Preucompra;	
	private double Preuventa;
	private int Stock;
	


//CONSTRUCTOR
public Article(String codi, String descripcio, double Preucompra, double Preuventa, int Stock) {

		this.codi = codi;
		this.descripcio = descripcio;
		this.Preucompra = Preucompra;
		this.Preuventa = Preuventa;
		this.Stock = Stock;
	
}
/*
public Article() {
	
}*/

//GETTERS
public String getCodi(){
	return codi;
}

public String getDescripcio() {
	return descripcio;
}

public double getCompra() {
	return Preucompra;
}

public double getVenta() {
	return Preuventa;
}

public int getStock() {
	return Stock;
}

//SETTERS
public void setCodi(String codi) {
	this.codi = codi;
}
public void setdescripcio(String descripcio) {
	this.descripcio = descripcio;
}
public void setCompra(double Preucompra) {
	this.Preucompra = Preucompra;
}
public void setVenta(double Preuventa) {
	this.Preuventa = Preuventa;
}
public void setStock(int Stock) {
	this.Stock = Stock;
}

public void Llistar() {
	
	String llista = "";
	
	llista +="\n Codi" + this.codi;
	llista +="\n Descripcio" + this.descripcio;
	llista +="\n Preu de compra" + this.Preucompra;
	llista +="\n Preu de venta" + this.Preuventa;
	llista +="\n Stock" + this.Stock;
	
}

}

/*public String toString() {
	
}*/

