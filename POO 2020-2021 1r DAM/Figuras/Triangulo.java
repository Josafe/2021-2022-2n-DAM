package Figuras;

public class Triangulo implements iFigura2D {

	private double amplada;
	private double altura;
	
	public Triangulo(double amplada, double altura) {
		this.amplada = amplada;
		this.altura = altura;
	}
	
	public double getAmplada() {
		return amplada;
	}
	public double getAltura() {
		return altura;
	}
	
	public void setAmplada(double amplada) {
		this.amplada = amplada;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double perimetro() {
		double perimetro = amplada + amplada + amplada;
		return perimetro;
	}
	public double area() {
		double area = amplada * altura / 2;
		return area;
	}
	public void escalar(double escala) {
		escala = amplada * escala;
		escala = altura * escala;
	}
	public void imprimir() {
		System.out.println("El perimetre del rectangle es: " + this.perimetro() + " i la seva area: " + this.area());
	}
}
