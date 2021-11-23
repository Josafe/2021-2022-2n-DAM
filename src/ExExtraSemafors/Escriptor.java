package ExExtraSemafors;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Escriptor extends Thread {

	//
	//AccesRW lista = new AccesRW(AccesRW.llista);
	ArrayList<String> s;
	int escriptor;
	int min;
	int seg;
	AccesRW accesEscriptor; //Dona acces a tots els metodes de la classe Escriptor
	
	
	public Escriptor (AccesRW accesEscriptor) {
		this.accesEscriptor = accesEscriptor;
	}
	
	public void run() {
		accesEscriptor.llista.add("Soc l'escriptor" + escriptor + " i son les " + min + ":" + seg);
		//((List<String>) lista).add("Soc l'escriptor" + escriptor + " i son les " + min + ":" + seg);
	}	
}
