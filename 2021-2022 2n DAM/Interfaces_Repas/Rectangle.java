package Interfaces_Repas;

public class Rectangle implements FiguraGeo, Comparable<Rectangle> {

	int altura;
	int costat;

	public Rectangle(int a, int c) {
	this.altura = a;
	this.costat = c;
	}
	@Override
	public float CalculaArea() {
		// TODO Auto-generated method stub
		return this.costat*this.costat;
	}

	@Override
	public float CalculaPerimetre() {
		// TODO Auto-generated method stub
		return this.costat*this.costat;
	}
	
	public float Comparable() {
		return altura;
	}
	@Override
	public int compareTo(Rectangle o) {
		return this.altura - o.costat;
	}
}
