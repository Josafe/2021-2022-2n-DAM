package producto;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		
		Producte Almacen[] = new Producte[5];
		ArrayList<Producte> Comptador = new ArrayList<Producte>();
		
		Producte Camiseta = new Producte(20,20,"80% ALGODON, 20% POLIESTER, RENTA A MAXIM 40ºC, CADASCUNA ES DIFERENT DE L'ATRA, EDICIO LIMITADA 20 UNITATS");
		Producte Pantalons = new Producte(40,3, "PANTALONS CARGO, RENTA A MAXIM 40ºC, CADASCUNA ES DIFERENT DE L'ATRA, EDICIO LIMITADA 3 UNITATS, CINTURO EXTRAIBLE");
		Producte Chalecos = new Producte(35,5, "TE 10 BUTXAQUES, AJUSTABLE A L'ESQUENA, EDICIO LIMITADA 5 UNITATS,");
		Producte Sudaderes = new Producte(35,10,"100% ALGODON, LLIMPIAR MAXIM A 40ºC");
		Producte Gorres = new Producte(10,30, "100% POLIESTER, RENTAR A MAXIM 40ºC, AJUSTABLE, EDICIO LIMITADA 20 UNITATS,");
		
		//AFEGIR PRODUCTES AL VECTOR D'OBJECTES
		Almacen[0] = Camiseta;
		Almacen[1] = Pantalons;
		Almacen[2] = Chalecos;
		Almacen[3] = Sudaderes;
		Almacen[4] = Gorres;
		
		//AFEGIR PRODUCTES A L'ARRAYLIST
		Comptador.add(Camiseta);
		Comptador.add(Pantalons);
		Comptador.add(Chalecos);
		Comptador.add(Sudaderes);
		Comptador.add(Gorres);
		
		//BUCLE FOR EACH
		System.out.println("BUCLE FOR EACH");
		
		for (Producte x : Almacen) {	
			System.out.println(x.toString());
		}
		
	
		
		
		//AFEGIR NOU PRODUCTE
		Comptador.add(new Producte (40, 25, "80% ALGODON, 20% POLIESTER, RENTA A MAXIM 40ºC, CADASCUNA ES DIFERENT DE L'ATRA, EDICIO LIMITADA 20 UNITATS"));
			
		// ITERATOR AMB ELS 5 OBJECTES I EL PRODUCTE AFEGIT
			System.out.println("");
			System.out.println("ITERATOR 1");
				
				Iterator i = Comptador.iterator(); //CREACIO DE ITERATOR
				
				while (i.hasNext()) {
					System.out.println(i.next());
				}
				
		//ELIMINAR 2 PRODUCTES DE L'ARRAYLIST
		Comptador.remove(Sudaderes);
		Comptador.remove(Chalecos);
		
		
		
	
		// ITERATOR AMB ELS 2 PROCUTES ELIMINATS
			System.out.println("");
			System.out.println("ITERATOR 2");
			
			Iterator y = Comptador.iterator(); //CREACIO DE ITERATOR
		
				while (y.hasNext()) {
				System.out.println(y.next());
				}
		
	//ELIMINAR TOTS ELS ELEMENTS DE L'ARRAYLIST AMB CLEAR
		
		//Comptador.clear();
		//Comptador.remove(1);
		//Comptador.remove(Camiseta);
		

				
				
		
}
}//main
