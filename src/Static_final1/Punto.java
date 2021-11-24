package Static_final1;

public class Punto{

private static int posiciox;
private static int posicioy;


public Punto(int x , int y){ 		//Constructor
	this.posiciox = x;
	this.posicioy = y;
}



public int getposiciox() {
	return posiciox;
}

public int getposicioy() {
	return posicioy;
}

public void setposiciox(int posiciox) {
	this.posiciox = posiciox;
}

public void setposicioy(int posicioy) {
	this.posicioy = posicioy;
}


public void imprime() {
	System.out.println(posiciox);
	System.out.println(posicioy);
}
public void setXY(int posicioA, int posicioB) {
	this.posiciox = posicioA;
	this.posicioy = posicioB;
}
public void desplaza(int dx, int dy) {
	this.posiciox += dx;
	this.posicioy += dy;
}
public double distancia (Punto p) {
	return Math.sqrt(Math.pow(this.posiciox - p.posiciox, 2) + Math.pow(this.posicioy - p.posicioy, 2));
}

//Static finale NO ES POT ENVIAR AL MAIN, tens que crear un constructor per a invocar-lo
public static void puntoAleatorio() {
	
	posiciox = -100 + (int)(Math.random()* 100);
	posicioy = -100 + (int) Math.random()* 100;
}

public Punto() { //CONSTRUCTOR QUE EL CRIDA
	puntoAleatorio();
}

}