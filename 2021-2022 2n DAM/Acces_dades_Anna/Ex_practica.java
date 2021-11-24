package Acces_dades_Anna;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex_practica {

	public static void main(String[] args) throws IOException {
		
		Scanner llegir = new Scanner(System.in);
		
		String teclat = "";
		File ruta;
		
		
		System.out.println("Introdueix per a crear l'arxiu: ");
		teclat = llegir.nextLine();
		
		ruta = new File("C:\\Users\\Josafe\\Desktop\\CFGS Disseny d'aplicacions multiplataforma 2020-21\\Java\\WorkSpaceEclipse\\1r_Tri 2n DAM\\src\\Acces_dades_Anna\\".concat(teclat));
		
		
		if(ruta.exists()) {
			System.out.println("El directori / arxiu ja existeix " + ruta.getName() + " " + ruta.length()); //Tamany i nom del arxiu ja creat
		}
		else if(ruta.exists() == false) {
			
			ruta.createNewFile();
			
			if(ruta.mkdir()) {
				System.out.println("Directori creat");
			}
			System.out.println("S'ha creat el fitxer / directori amb el nom: " + ruta.getName());
		}
}
}
