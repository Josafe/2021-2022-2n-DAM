package VectorComplejos;

import java.util.Scanner;

import NumComplejos.Complejos;

public class VectorComplejos {

	public static void main (String[] args) {
Scanner llegir = new Scanner(System.in);
		
		
		int real = (int)(1 + Math.random()*0-10);
		int imagin = (int)(1 + Math.random()*0+10);
	
		Complejos[] vecComp = new Complejos[10];
	
		Complejos c1 = new Complejos(real, imagin); //4 10
		
		Complejos c2 = new Complejos(real,imagin); //4 10
		
		Complejos c3 = new Complejos(real, imagin);
		
		for (int i = 0; i < vecComp.length; i++) {
			
			vecComp[i] = new Complejos(real,imagin);
			
		}
		for (int i = 0; i < vecComp.length; i++) {
			System.out.println("");
			System.out.println("Posicio: [" + i + "]");
			
			System.out.println("Suma: ");
			vecComp[i] = c1.Suma(c2);
			vecComp[i].Imprimir();
			System.out.println("");
			
			System.out.println("Multiplicacio: ");
			vecComp[i] = c1.Multi(c2);
			vecComp[i].Imprimir();
			System.out.println("");
		}
		
		double acumulasumar = 0, acumulasumai = 0;
		double acumulamultir = 1, acumulamultii = 1;
		
		Complejos resultatsuma = new Complejos (acumulasumar, acumulasumai);
		Complejos resultatmulti = new Complejos (acumulamultir, acumulamultii);
		
		for (int i = 0; i < vecComp.length; i++) {
		acumulasumar = acumulasumar + vecComp[i].getreal();	
		acumulasumai = acumulasumai + vecComp[i].getimagin();
		}
		
		for (int i = 0; i < vecComp.length; i++) {
		acumulamultir = acumulamultir * vecComp[i].getreal();
		acumulamultii = acumulamultii * vecComp[i].getimagin(); 
		}
		
		System.out.println("Sumatori Real: [" + acumulasumar + "] &  Sumatori Imaginari: [" + acumulasumai + "]");
		System.out.println("Factorial Real: [" + acumulamultir + "] & Factorial Imaginari: [" + acumulamultii + "]"); 
		
	}
}

	
		
		
		
		
	

