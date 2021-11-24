package Acces_dades_Anna;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		
		Scanner llegir = new Scanner(System.in);
		
		String teclat = "";
		File ruta;
		int sw;
		
		System.out.println("Menu switch: \n1 Arrel \n2 Directori actual \n3 Ruta anterior \n4 nº 1 directori nº 0 arxiu \n5 En cas d'arxiu grandaria subdirectori ho indica \n0 Sortir del programa");
		sw = llegir.nextInt();
		
		//System.out.println("Introdueix per a crear l'arxiu: ");
		//teclat = llegir.nextLine();
		
		System.out.println(teclat);
		ruta = new File("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma 2020-21\\Java\\WorkSpaceEclipse\\1r_Tri 2n DAM\\src\\Acces_dades_Anna\\".concat(teclat)); //Concatenem la ruta introduida per teclat
		/*
		if(ruta.exists()) {
			System.out.println("El directori / arxiu ja existeix " + ruta.getName() + " " + ruta.length()); //Tamany i nom del arxiu ja creat
		}
		else if(ruta.exists() == false) {
			
			ruta.createNewFile();
			
			if(ruta.mkdir()) {
				System.out.println("Directori creat");
			}
			System.out.println("S'ha creat el fitxer / directori amb el nom: " + ruta.getName());
		}*/
		
		boolean bucle = true;
		
		while(bucle) {
			
		switch(sw) {
		
		case 1:  
			System.out.println(ruta.listRoots());
			bucle = false;
			break;
			
		case 2: 
			System.out.println(ruta.isDirectory()); 
			bucle = false;
			break;
			
		case 3: 
			System.out.println(ruta.getParent());
			bucle = false;
			break;
			
		case 4:
			
			for(String frase : ruta.list()) {
			if(ruta.isFile()) {
				
				System.out.println("1   " + frase);
			}
			else if(ruta.isDirectory()) {
				
				System.out.println("0   " + frase);
			}
			}
			bucle = false;
			break;
			
		case 5:
			
			for(String frase : ruta.list()) {
			if(ruta.isFile()) {
				System.out.println(frase.length()); 
			}
			else if(ruta.isDirectory()) {
				System.out.println("Es un directori");
			}
			}
			bucle = false;
			break;
			
			
		default:
			
			System.out.println("Has sortit del programa");
			bucle = false;
			break;
			
		}
	}
	}
}
