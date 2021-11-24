//package Cas_practic;
package Cas_Practic_POO;
import java.util.Scanner;

public class CompteBancari {
	static Scanner llegir = new Scanner(System.in);

	private String IBAN;
	private String Titular;
	private double Saldo = 0;
	private double Moviments[] = new double[100];
	private int ContadorMoviments;
	private double ingresar;
	private double retirar;

	//CONSTRUCTOR
	public CompteBancari(String IBAN, String Titular, double Saldo){
	if (ContadorMoviments > Moviments[99]) {
			System.err.println("Error, has arribat al num maxim de moviments");
		}
	
	//AIXO VA AL METODE RETIRADA

	else {
		this.Saldo = Saldo;
		this.Titular = Titular;
		this.IBAN = IBAN;
	}
	
	}
	//GETTER
public String getIban() {
	return IBAN;
}

public String getTitular() {
	return Titular;
}

public double getSaldo() {
	return Saldo;
}

public double[] getMoviments() {
	return Moviments;
}

public void Ingres(double ingresar) {
		
	
	
	for (int i = 0; i < 1; i++) {
		
		ingresar = llegir.nextDouble();
		
	if (ingresar <= 0) {
		System.err.println("Error: No pots ingressar una xifra inferior a 1");
		Saldo = 0;
		i--;
	}
		this.Saldo = Saldo + ingresar;
	}
	
	
}

public void Retira(double retirar) {
	
	
	
	for (int i = 0; i < 1; i++) {
		
		retirar = llegir.nextDouble();
		this.Saldo = Saldo - retirar;
		
		
	if (retirar <= 0) {
		System.err.println("Error: No pots retirar una xifra inferior a 1");
		
		
		
	if(Saldo < -50) {
			System.err.println("AVIS: Saldo negatiu -50, transaccio cancelada");
	}
		Saldo = 0;
		i--;
	}

	if(Saldo < 0) {
		System.err.println("AVIS: Saldo negatiu");
	}
	
	
	else if (retirar > 3000) {
		System.err.println("AVIS: Notificació a hisenda");
	}
	
	
	}
}

public void imprimirRetira() {
	Retira(retirar);
}
public void imprimirIngres() {
	Ingres(ingresar);
	
}
public void imprimirMoviments() {
	
	for (int i = 0; i < 1; i++) {
	System.out.println(Moviments);
	}

	System.out.println("Has ingressat: " + ingresar);
	System.out.println("Has retirat: " + retirar);
	
	System.out.println("El teu saldo total es: " + Saldo);
	
}
public void imprimir() {
	imprimirRetira();
	imprimirIngres();
	imprimirMoviments();
	 
}
}