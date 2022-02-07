package UF3JordiFilsEx8Extra;

import java.util.ArrayList;

public class main {
	
	public static void main(String[] args) throws InterruptedException {
		Temperatures temperatura = new Temperatures();
		
		TempMax tempMax = new TempMax(temperatura);
	
		
		int max = 10;
		int min = 0;
		
		for(int i = 0; i < 100; i++) {
		temperatura.afegirTemperatures();
		}	
		
		System.out.println(temperatura.temperatures);
		System.out.println("Afegint temperatures..");
		
		
		for(int i = 0; i < 10; i++) {
			tempMax.start();
			tempMax.join();
		}
			
			
		
	}
}
 