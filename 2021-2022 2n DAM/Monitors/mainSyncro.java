package Monitors;

import java.util.Scanner;
import java.util.Set;

public class mainSyncro {

	public static void main(String[] args) throws InterruptedException {
		Scanner llegir = new Scanner(System.in);
		int nfil = 0;
		System.out.println("Introdueix nº de fils 1-10");
		nfil = llegir.nextInt();
		
		//Creem var contador
		contador cont = new contador();
		
		
		while(nfil <= 0 || nfil > 10) {
		if (nfil <= 0 || nfil > 10) {
			System.out.println("El nº introduit no es correcte");
			System.out.println("Introdueix nº de fils 1-10");
			nfil = llegir.nextInt();
			
		}
		
		}
		
		for(int i = 1; i <= nfil; i++) {
		
			Thread fil = new Thread(new Ex9("Fil " + i, cont)); //Creem els fils depenent de les iteracions 
																//Incloem els valors del constructor (nom i contador) classe Ex9
			fil.start(); //Iniciem el fil
			
			 
		}
		
	}
}
