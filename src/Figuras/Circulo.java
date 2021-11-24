package Figuras;
import java.lang.Math;

public class Circulo implements iFigura2D {
	
	private double radi;

	public Circulo(double radi) {
		this.radi = radi;
	}
	
	public double getRadi() {
		return radi;
	}
	public void setRadi(double radi) {
		this.radi = radi;
	}
	
	public double perimetro() {
		double perimetro = (2 * Math.PI);
		return perimetro;
	}
	public double area() {
		double area = Math.PI * radi;
		return area;
	}
	public void escalar (double escala) {
		escala = radi * escala;
		System.out.println(escala);
	}
	public void imprimir() {
		System.out.println("El perimetre del cercle es: " + this.perimetro() + "i l'area d'aquest es: " + this.area());
	}
}
