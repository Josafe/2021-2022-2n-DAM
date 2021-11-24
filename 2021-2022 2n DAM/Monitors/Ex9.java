package Monitors;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Ex9 extends Thread {
	
	String name;
	contador cont; //variable tipo objeto de la clase cont dona acces a tots els seus metodes
	
	public Ex9(String n, contador cont) {
		this.name = n; //Definim una variable nom
		this.cont = cont;
	}
	
	public void run() {
		try {
			
			cont.numAleatorioNS(name);//variable 'n' de contador / numAleatorioNS
			cont.numAleatorio(name); //variable 'n' de contador / numAleatorio
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //cridem de la classe contador amb un nom
	}
}
