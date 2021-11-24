package ExExtraSemafors;

import java.util.ArrayList;

public class Lector extends Thread	 {

	
	ArrayList<String> s;
	int escriptor;
	String data;
	AccesRW accesLector; //Dona accces a tots els metodes de la classe Lector
	
	public Lector (AccesRW accesLector) {
		this.accesLector = accesLector;
	}
	
	public void run()
	{

		System.out.println(accesLector.llista);
	}
	
}
