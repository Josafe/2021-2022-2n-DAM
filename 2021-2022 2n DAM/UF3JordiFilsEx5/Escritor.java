package UF3JordiFilsEx5;

import java.util.ArrayList;

public class Escritor extends Thread {

	int min;
	int seg;
	AccesRW accesEscriptor; //Acces a tots els metodes de classe escriptor
	
	public Escritor(String name, AccesRW accesEscriptor) {
		super(name);
		this.accesEscriptor = accesEscriptor;
	}
	
	public synchronized void run() {
		
		for(int i = 0; i < 50 ; i ++) {
			int random = (int)(Math.random()*50+1);
			accesEscriptor.llista.add("Numero agafat " + random);
			accesEscriptor.escriure(getName());
		}
	}
	
}
