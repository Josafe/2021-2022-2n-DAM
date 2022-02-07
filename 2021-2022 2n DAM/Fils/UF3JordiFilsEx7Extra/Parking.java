package UF3JordiFilsEx7Extra;

import java.util.ArrayList;

public class Parking {
	
	int places;
	ArrayList<Integer> llista = new ArrayList<Integer>();
	String name;
	
	public Parking(int places) {
		if(places < 0) {
			places = 0;
		}
		this.places = places;
	}
	
	public int getPlacesLliures() {
		return this.places;
	}
	
	public synchronized void aparcar(String nom) {
		while (places <= 0) {
			try {
				System.out.println(nom + "Esta esperant, parquing ple");
				wait();
			}catch(InterruptedException e) {
				
			}
		}
		places--; //Al sortir el cotxe es llibera 1 plaça
	}
	
	public synchronized void sortir(String n) {
		places++;
		notify();
	}
	}


