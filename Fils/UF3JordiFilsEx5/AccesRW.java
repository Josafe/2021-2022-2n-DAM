package UF3JordiFilsEx5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.time.LocalDateTime;

public class AccesRW {

	ArrayList<String> llista = new ArrayList<String>();
	
		public String getTime() {
			
			LocalDateTime data = LocalDateTime.now();
			
			int hores = data.getHour();
			int mins = data.getMinute();
			int segs = data.getSecond();
			
			return hores + ":" + mins + ":" + segs;
		}
		
		
		public synchronized void escriure(String escriure) {
			
			try {
				Random r = new Random(); 
				Thread.sleep((r.nextInt(5)+1)*1000);
				System.out.println(escriure + " intentant escriure");
				
				while(llista.size() >= 5) {
					wait();
				}
					this.llista.add("Sóc " + escriure);
					notify();
			}catch(Exception x){}
		}
		
		public synchronized void llegir(String llegir) {
			try {
				
				while(llista.isEmpty()) {
					wait();
				}
				
				Random r;
				
				r = new Random();
				Thread.sleep((r.nextInt(5)+1)*1000);
				
				System.out.println(llegir + " llegeix " + this.llista.get(0));
		
				llista.remove(0);
				
				notify();
				
			}catch (Exception x) {}
		}
}