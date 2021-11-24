package Figurasrepas;

public class Triángulo {

	protected double lado;
	protected double altura;
	
	public Triángulo(double lado, double altura) {
		this.lado = lado;
		this.altura = altura;
	}
	
	public double perimetro(double perimetro) {
		return perimetro = lado + lado + lado;
	}
	
	public double area(double area) {
		return area = lado * altura / 2;
	}
	
	public void escalar(double escala) {
		double lado = 0;
		lado = lado * escala;
	}
}
