package UF3JordiFilsEx7Extra2;

public class Parking {

	int places;
	
	public Parking(int places) {
		this.places = places;
	}
	
	//Getter places lliures
	public int getPlacesLliures() {
		return this.places;
	}
	
	//Metode per reduir les places lliures del parking
	public synchronized void aparcar(String nom) 	{
	
		while(places <= 0) { //Quan no queden places el fil es queda amb espera (wait)
			try {
				System.out.println(nom + " Esperant parking ple");
				wait();
			} catch (InterruptedException e) {}
		}
		places--;
	}
	
	//Metode per incrementar les places lliures del parking i notifica al fil per tornar a introduir cotxes
	public synchronized void sortir(String nom) {
		places++; 
		notify();
	}
}
