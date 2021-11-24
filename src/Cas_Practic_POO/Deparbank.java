//package Cas_practic;
package Cas_Practic_POO;
import java.util.Scanner;

public class Deparbank {
	static Scanner llegir = new Scanner(System.in);

	public static void main(String[]args) {
		
		//Objectes creats
		CompteBancari Compte1 = new CompteBancari("ES6621000418401234567891", "Joan Sabater Ferre" , 0.0);
		CompteBancari Compte2 = new CompteBancari("ES6731320418401234567891", "Jordi Querol Gimeno" , 0.0);
		
		int Switch = 0;
		int i = 0;
		
		System.out.println("Introdueix el teu IBAN");
		
		while (i < 1) {
		System.out.println("Menu DeparBank:");
		System.out.println("1: Dades compte ");
		System.out.println("2: IBAN");
		System.out.println("3: Titular");
		System.out.println("4: Saldo");
		System.out.println("5: Ingres");
		System.out.println("6: Retira");
		System.out.println("7: Moviments");
		System.out.println("8: Sortir");
		Switch = llegir.nextInt();
		
		switch(Switch) {
		
			case 1:
				System.out.println("Dades compte:");
				System.out.println("IBAN: " + Compte1.getIban() + " Titular: " + Compte1.getTitular() + " Saldo: " + Compte1.getSaldo());
				
				break;
				
			case 2:
				System.out.println("IBAN");
				System.out.println("IBAN: " + Compte1.getIban());
				
				break;
				
			case 3:
				System.out.println("Titular:");
				System.out.println(" Titular: " + Compte1.getTitular());
				
				break;
				
			case 4:
				System.out.println("Saldo");
				System.out.println("Saldo actual: " + Compte1.getSaldo());
				break;
			
			case 5:
				System.out.println("Ingres");
				System.out.println("Quina xifra vols ingressar:");
				
				Compte1.imprimirIngres();
				Compte1.imprimirMoviments();
				break;
				
			case 6:
				System.out.println("Retira");
				System.out.println("Quina xifra vols retirar:");
				
				Compte1.imprimirRetira();
				Compte1.imprimirMoviments();
				break;
				
			case 7:
				System.out.println("Moviments");
				Compte1.imprimirMoviments();
				break;
				
			case 8:
				System.out.println("Sortir");
				System.out.println("Has sortit del caixer, gracies per confiar amb nosaltres");
				i++;
				break;
				
	}
}
}
}
