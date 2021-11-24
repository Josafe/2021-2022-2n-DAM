package NumComplejos;

public class Complejos {
	
	private double r;
	private double i;
	private double resultatr;
	private double resultati;
	
//CONSTRUCTOR
public Complejos (){ //
	this.r = 0;
	this.i = 0;
}
public Complejos(double r, double i) {
	this.r = r;
	this.i = i;
}
//MANERA 1
public void SumaVariable(Complejos c1, Complejos c2) {
	
	resultatr = (this.r + this.r);
	resultati = (this.i + this.i);
}

public void RestaVariable (Complejos c1, Complejos c2) {
	
	resultatr = (this.r - this.r);
	resultati = (this.i - this.i);
}
//MANERA 2 (BONA)
/*public Complejos Resta (Complejos c1, Complejos c2) {
	
	resultatr = (this.r - this.r);
	
	resultati = (this.i - this.i);
	
	Complejos resultadoresta = new Complejos();
	
	return resultadoresta;
	
	
}*/
public Complejos Suma (Complejos c1, Complejos c2) { //Crearem un metode que ens retorne un objecte amb els numeros complexos

	resultatr = (this.r + this.r);
	
	resultati = (this.i + this.i);
	
	Complejos resultado = new Complejos();
	
	return resultado;
	
}

//GETTER
public double getreal(){
	
	return resultatr;
}
public double getimagin() {
	
	return resultati;
}
public void setreal(double resultatr) {
	
	this.resultatr = resultatr;
}
public void setimagin(double resultati) {
	
	this.resultati = resultati;
}

public void Imprimir() {
	System.out.println("El resultat real es: " + this.resultatr);
	System.out.println("El resultat imaginari es: " + this.resultati);
	System.out.println("El resultat total es: " + this.resultatr + " + " + this.resultati);
}
}
//public double Resta (int a, int c, int b, int d) {}

