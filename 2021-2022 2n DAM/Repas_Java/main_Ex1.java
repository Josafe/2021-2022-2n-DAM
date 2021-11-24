package Repas_Java;
import java.util.Scanner;

//import jdk.internal.org.jline.utils.InputStreamReader;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.ArrayList;

public class main_Ex1 {

	static ArrayList<Usuari> User = new ArrayList<>();
	
	
	public static void main(String[] args) {
		Scanner llegir = new Scanner(System.in);
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ex1 array[] = new ex1[5];
		
		
		//Objectes creats
		
		ex1 llibre = new ex1("2000","Sant Jordi", "Hi", 40);
		ex1 llibre2 = new ex1("2000","El gegant del pi", "F", 40);
		ex1 llibre3 = new ex1("2000","Resident Evil", "A", 40);
		ex1 llibre4 = new ex1("2000","Geronimo Stilton", "J", 40);
		ex1 llibre5 = new ex1("2000","El castell ambulant", "N", 40);
	

		array[0] = llibre;
		array[1] = llibre2;
		array[2] = llibre3;
		array[3] = llibre4;
		array[4] = llibre5;

		
	
	for(int i = 0; i < array.length; i++) {
		System.out.println(array[i].mostrar());
	}
	
	//EX2
	
	Usuari usuari1 = new Usuari("Jordi", "Querol", "23424324B", 28);
	Usuari usuari2 = new Usuari("Joan", "Sabater", "23424324V", 21);
	
	for (int i = 0; i < 2; i++) {
		
		System.out.println("Introdueix nom");
		String nom = llegir.next();
		
		System.out.println("Introdueix cognom");
		String cognom = llegir.next();
		
		System.out.println("Introdueix dni");
		String dni = llegir.next();
		
		System.out.println("Introdueix edat");
		int edat = llegir.nextInt();
		
		Usuari array2 = new Usuari(nom, cognom, dni, edat);
		User.add(array2);
		User.add(array2);
	}
		int nllibre;
		
	for (Usuari a : User) {
		int numllibre = 5;

		switch (numllibre) {
		case 1:
			System.out.println("Llevar llibre");
			nllibre = llegir.nextInt();
			for(int i = 0; i < 1; i++) {
				a.llevarLlibre(llibre2);
			}
		case 2:
			System.out.println("Prestar llibre");
			for(int i = 0; i < 1; i++) {
				a.prestarLlibre(llibre);
				a.prestarLlibre(llibre2);
				a.prestarLlibre(llibre3);
			}
			
		case 3:
			System.out.println("Mostrar llibres");
			a.mostrar();
		
		default:
			break;
		}
	}
	
	
	}
}
