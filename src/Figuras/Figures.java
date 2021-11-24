package Figuras;
import java.util.ArrayList;

public class Figures {

	public static void main(String[] args) {
		
		Circulo cercle = new Circulo(4.5); 
		Triangulo triangle = new Triangulo(4,6);
		Rectangulo rectangle = new Rectangulo(8,9);
		Cuadrado cuadrat = new Cuadrado(4);
		
		ArrayList<iFigura2D> llistaP = new ArrayList<>();
		
		llistaP.add(cercle);
		llistaP.add(triangle);
		llistaP.add(rectangle);
		llistaP.add(cuadrat);
		
		for (iFigura2D x : llistaP) {
			System.out.println(x.area());
			System.out.println(x.perimetro());
			System.out.println(x.escalar(0.1));
			System.out.println(x.perimetro());
			System.out.println(x.perimetro());
			System.out.println(x.escalar(2));
			System.out.println(x.perimetro());
			System.out.println(x.perimetro());
		}
		
		
	}
}
