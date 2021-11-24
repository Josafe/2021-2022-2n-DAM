package producto;

public class Producte {

	private int preu;
	private int stock;
	private String descripcio;
	
	//CONSTRUCTOR
	public Producte(int p, int s, String d) {
		this.preu = p;
		this.stock = s;
		this.descripcio = d;
}
	//GETTERS
public void getPreu() {
	this.preu = preu;
}
public void getStock() {
	this.stock = stock;
}
public void getDesc() {
	this.descripcio = descripcio;
}
 	//SETTERS
public int setPreu(int p) {
	return p;	
}
public int setStock(int s) {
	return s;
}
public String setStock(String d) {
	return d;
}
public String toString() {
	  
	  return "Te un preu de " + this.preu + " i un Stock disponible de " + this.stock + " i unes caracteristiques: " + this.descripcio;
}

}


