package Figuras;

public class Cuadrado implements iFigura2D{

	private double costat;
	
	public Cuadrado(double costat) {
		this.costat = costat;
	}
	
	public double getCostat() {
		return costat;
	}
	public void setCostat() {
		this.costat = costat;
	}
	
	public double perimetro() {
		double perimetro = costat * 4;
		return perimetro;
	}
	public double area() {
		double area = costat * costat;
		return area;
	}
	
	public void escalar (double escala) {
		escala = costat * 4 * escala;
	}
	
	public void imprimir() {
		System.out.println("El quadrat te un perimetre de: " + this.perimetro() + " i una area de: " + this.area());
	}
}
