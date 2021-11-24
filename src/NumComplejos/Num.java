package NumComplejos;
import java.util.Scanner;

public class Num {

	public static void main (String[] args) {
		Scanner llegir = new Scanner(System.in);
		
		double real;
		double imagin;
		
		System.out.println("Introdueix num real: ");
		real = llegir.nextDouble();
		
		System.out.println("Introdueix un num imaginari");
		imagin = llegir.nextDouble();
		
		Complejos c1 = new Complejos(real, imagin); //4 10
	/*____________________________________________________________________________________*/
		
		System.out.println("Introdueix num real: ");
		real = llegir.nextDouble();
		
		System.out.println("Introdueix un num imaginari");
		imagin = llegir.nextDouble();
		
		Complejos c2 = new Complejos(real,imagin); //4 10
		
		Complejos c3 = new Complejos(real, imagin);
		
		int Calculadora = 0;
		
		switch(Calculadora)
		{
			case 1:
				c1.Imprimir();
		}
		c3 = c1.Suma(c1,c2);
		
		//c3 = c1.Resta(c1, c2);
		//c3 = c1.Multi(c1, c2);
		c1.Imprimir();
		
	}
}
