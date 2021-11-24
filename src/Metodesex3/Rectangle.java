package Metodesex3;
public class Rectangle{

private int x1;
private int y1;
private int x2;
private int y2;

public Rectangle(int x1, int y1, int x2, int y2){
	
	
	
	if ((x1 < x2) && (y1 < y2))
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
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
	}
	}

 
