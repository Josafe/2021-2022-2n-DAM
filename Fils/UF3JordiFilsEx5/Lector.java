package UF3JordiFilsEx5;

import java.util.ArrayList;

public class Lector extends Thread{

	int escriptor;
	String data;
	AccesRW accesLector;
	
	public Lector(String name, AccesRW accesLector) {
		super(name);
		this.accesLector = accesLector;
	}
	
	public void run() {
		for(int i = 0; i < 50 ; i ++) {
			accesLector.llegir(this.getName());
		}
		}
	}

