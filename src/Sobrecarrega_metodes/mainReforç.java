package Sobrecarrega_metodes;
import java.util.*;
public class mainReforç {

	ArrayList<Persona> valors = new ArrayList<>();
	public static void main(String[] args) {
		Scanner llegir = new Scanner(System.in);
		
		String nom = "";
		String edad = "";
		String dni;
		String sexe = "home";
		int pes = 0;
		int altura = 0;
		double IMC = 0;
		int erswitch = 5;
		
		switch(erswitch) {
		case 1:
			System.out.println("Introdueix nom, edad, sexe i altura");
			System.out.println("Nom");
			nom = llegir.next();
			
			System.out.println("Edad");
			edad = llegir.next();
			
			System.out.println("Sexe (home / dona)");
			sexe = llegir.next();
			
			System.out.println("pes en kg");
			pes = llegir.nextInt();
			
			System.out.println("altura en cm");
			altura = llegir.nextInt();
		}
	}
}
