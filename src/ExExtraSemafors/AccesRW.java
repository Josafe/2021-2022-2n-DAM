package ExExtraSemafors;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class AccesRW {
	
	ArrayList<String> llista = new ArrayList<String>();
	
	Semaphore semaforLlegir = new Semaphore(0); //El semafor dels lectors no estara lliure fins que els escriptors haguen escrit, una vegada fet s'incrementara +1 permetent l'acces dels lectors.
	Semaphore semaforEscriure = new Semaphore(1); 
	
	
	public AccesRW(ArrayList<String> llista) {
		this.llista = llista;
	}
	
	public void escriurellegir() throws InterruptedException {
	
		LocalDateTime data = LocalDateTime.now();
		
		
		for(int i = 0; i < 10; i++) {
			
			semaforEscriure.acquire();
			
			Thread.sleep(1000);
				
		
			
			semaforEscriure.release();
		}
		
		
		for(int i = 0; i < 10; i++) {
			
			semaforEscriure.acquire();
			
			Thread.sleep(5000);
			
			System.out.println(escriurellegir);
			
			semaforEscriure.release();
			
			;
		}
		
	
		
		for(int i = 0; i < 10; i++) {
			semaforLlegir.acquire();
			
			System.out.println(llista);
			System.out.println("___________________");
			
			semaforLlegir.release();
			
			Thread.sleep(1000);
		}
		
	}
}
