package Figurasrepas;

public class Cuadrado {

	protected double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	public double perimetro(double perimetro) {
		return perimetro = lado + lado * 2;
	}
	
	public double area(double area) {
		return area = lado * lado;
	}
	
	public void escalar(double escala) {
		double lado = 0;
		lado = lado * escala;
	}
}
