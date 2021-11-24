package VectorComplejos;
import VectorComplejos.Complejos;

public class Complejos {
	
	private double r; //Almacena el nº real del C1
	private double i;
	
//CONSTRUCTOR
public Complejos (){ 
	this.r = 0;
	this.i = 0;
}
public Complejos(double r, double i) {
	this.r = r;
	this.i = i;
}



//MANERA 2 (BONA)
public Complejos Div (Complejos x) {
	
	Complejos resultadodiv = new Complejos();
	
	resultadodiv.r = (this.r / x.r);
	resultadodiv.i = (this.i / x.i);
	
	return resultadodiv;
	
}

public Complejos Multi (Complejos x) { //x REPRESENTA L'OBJECTE C2
	
	Complejos resultadomulti = new Complejos();
	
//EQUIVAL A: c3.c1 = (C1.nºreal * C2.nºreal)
	resultadomulti.r = (this.r * x.r);
	
//EQUIVAL A: C3.c1 = (C1.nºimagin * C2.nºimagin)
	resultadomulti.i = (this.i * x.i);
	
	return resultadomulti;
	
}
public Complejos Resta (Complejos x) { //x REPRESENTA L'OBJECTE C2
	
	Complejos resultadoresta = new Complejos();
	
	resultadoresta.r = (this.r - x.r); //this.r REPRESENTA C1 MENTRE QUE x.r REPRESENTA C2, ES SUMEN ELS DOS NUMEROS REALS ALMACENATS ALS OBJECTES C1 I C2
	
	//resultado ES L'OBJECTE ON S'ALMACENARA LA SUMA D'AQUESTS JA QUE SI NO S'ALMACENARIA A C1 I SUBSTITUIRIA ELS VALORS QUE JA TENIA DEFINITS
	
	resultadoresta.i = (this.i - x.i); //S'APLICA EL MATEIX CALCUL PER ALS NUMEROS IMAGINARIS
	
	
	
	return resultadoresta;
	
	
}
public Complejos Suma (Complejos x) { //x REPRESENTA L'OBJECTE C2

	Complejos resultado = new Complejos();
	
	resultado.r = (this.r + x.r); //this.r REPRESENTA C1 MENTRE QUE x.r REPRESENTA C2, ES SUMEN ELS DOS NUMEROS REALS ALMACENATS ALS OBJECTES C1 I C2
  
	//resultado ES L'OBJECTE ON S'ALMACENARA LA SUMA D'AQUESTS JA QUE SI NO S'ALMACENARIA A C1 I SUBSTITUIRIA ELS VALORS QUE JA TENIA DEFINITS
	
	resultado.i = (this.i + x.i); //S'APLICA EL MATEIX CALCUL PER ALS NUMEROS IMAGINARIS
	
	return resultado;
	
}

//GETTER
public double getreal(){
	
	return r;
}
public double getimagin() {
	
	return i;
}
public void setreal(double r) {
	
	this.r = r;
}
public void setimagin(double i) {
	
	this.i = i;
}

public void Imprimir() {
	System.out.println("Real: " + this.r);
	System.out.println("Imaginari " + this.i);
	//System.out.println("El resultat total es: " + this.resultatr + " + " + this.resultati);
}
}


