package Static_final3;
public class Rectangle{

private int x1;
private int y1;
private int x2;
private int y2;
private final double min = 0;
private final double max = 100;


public Rectangle(int x1, int y1, int x2, int y2,double min, double max){
	
	
	
	if ((x1 < x2) && (y1 < y2) && (min < max))
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
	//ATRIBUTS AFEGITS AL CONSTRUCTOR, amb els valors minims i maxims del rang
		
	} 
	else
	{
		System.err.println("No s'ha pogut instanciar el Rectangle (" + x1 + "," + y1 + ") , (" + x2 + "," + y2 + ")");
	}
}
	public int getx1() {
		return x1;
	}
	public int gety1() {
		return y1;
	}
	public int getx2() {
		return x2;
	}
	public int gety2() {
		return y2;
	}
	
	//GETTERS AFEGITS
	public double getmin() {
		return min;
	}
	public double getmax() {
		return max;
	}
	
	
	public void setx1(int x1) {
		if (x1 > this.x2)
		{
		System.out.println("El valor x1 no pot ser superior al valor x2");
		}
	}
	
	public void sety1(int y1) {
		if (y1 > this.y2)
		{
			System.out.println("El valor y1 no pot ser superior al valor y2");	
		}
	}
	
	public void setx2(int x2) {
		if (x2 < x1) {
			System.out.println("El valor x2 no pot ser inferior al valor x1");
		}
	}
	public void sety2(int y2) {
		if (y2 < y1) {
			System.out.println("El valor y2 no pot ser inferior al valor y1");
		}
	}
	
	//SETTERS AFEGITS MIN, MAX
	public void setMinMax(double min, double max){
		if (min > max) {
			System.out.println("Error, el valor minim es superior al valor maxim");
		}
	}
	
	public static void rectangleAleatori(int x1, int y1, int x2, int y2) {
		
		x1 = -100 + (int)(Math.random()* 100);
		x2 = -100 + (int)(Math.random()* 100);
		y1 = -100 + (int)(Math.random()* 100);
		y2 = -100 + (int)(Math.random()* 100);
		int contador = 1;
		for (int i = 0; i < contador; i++) {
		if (x1 > x2) 
		{
			contador++;
			System.err.println("Error, el valor x1 es superior a x2");
			x1 = -100 + (int)(Math.random()* 100);
		}
		else {
			contador--;
		}
		if (y1 > y2)
		{
			contador++;
			System.err.println("Error, el valor y1 es superior a y2");
			y1 = -100 + (int)(Math.random()* 100);
		}
		else {
			contador--;
		}
		}
	}
	
	public void setX1Y1(int x1, int y1){
		this.x1 = x1;
		this.y1 = y1;
	}
	public void setX2Y2(int x2, int y2){
		this.x2 = x2;
		this.y2 = y2;
	}
	public void setAll(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public int getPerimetro() {
		return (this.x1 - this.x2) * 2 + (this.y1 - this.y2) * 2; 
	}
	public int getArea() {
		return (this.x1 - this.x2) * ( this.y1 - this.y2);
	}	
	public void imprime() {
		System.out.println("Les coordenades (" + this.x1 + "," + this.y1 + ") - (" + this.x2 + "," + this.y2 + ")");
		System.out.println("Perimetro: " + this.getPerimetro());
		System.out.println("Area: " + this.getArea());
		
		//DECLARACIO DEL STATIC RECTANGLEALEATORI
		rectangleAleatori(x1, y1, x2, y2);
	}
	}

 
