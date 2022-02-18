package UF3JordiFilsEx7Extra;

import java.util.ArrayList;

public class Cotxe extends Thread{
	
	Parking parking;
	
	public Cotxe(String matricula, Parking p) {
		super(matricula);
		this.parking = p;
		start();
	}
	
	public void run() {
		
		int cotxe = (int)(Math.random()*50+1);
		int j = 0;
		
		System.out.println("El cotxe " + " entra al parking amb " + cotxe + "s");
		parking.llista.add(cotxe);
		
		while (parking.llista.size() > 10) {
			System.out.println("Num de places ocupades: " + j);
			j++;
		}
		
		try {
			estancia();
			wait();
			Thread.sleep(1500);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void estancia() throws InterruptedException {
		int estancia = (int)(Math.random()*30000+1000);
		
		Thread.sleep(estancia);
		System.out.println("El cotxe surt del parking despres de " + estancia + "s");
		
		
	}
	
	public static void main(String[] args) {
		
		int arribacotxe = (int)(Math.random()*60+0);
		
		for(int i = 0; i <= 40; i++) {
		
		
		try {
			Thread.sleep(arribacotxe);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}

