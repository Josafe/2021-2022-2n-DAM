package Figuras;

public class Rectangulo implements iFigura2D {

	private double amplada;
	private double altura;
	
	public Rectangulo(double amplada, double altura) {
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
		double perimetro = (amplada + altura) * 2;
		return perimetro;
	}
	
	public double area() {
		double area = amplada * altura;
		return area;
	}
	
	public void escalar(double escala) {
		escala = amplada * escala;
		escala = altura * escala;
	}
	
	public void imprimir() {
		System.out.println("El perimetre del rectangle es: " + this.perimetro() + " i l'area es: " + this.area());
	}
}
