package Getter_Setter;

public class Punto{

private int posiciox;
private int posicioy;

public Punto(int posiciox, int posicioy){ 		//Constructor
	this.posiciox = posiciox;
	this.posicioy = posicioy;
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
}