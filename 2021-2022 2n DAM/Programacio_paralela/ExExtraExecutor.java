package Programacio_paralela;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExExtraExecutor {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		//Crearem una pool de 2 fils
		ScheduledExecutorService ServeiExecutor = Executors.newScheduledThreadPool(1);
		
		//Crearem un objecte runnable
		Cartell cartell = new Cartell();
		
		//Amb la pool d'1 fil crearem un scheduleWithFixedDelay per a que mostre missatges cada cert temps
		ServeiExecutor.scheduleWithFixedDelay(cartell, 0, 3, TimeUnit.SECONDS);
		
		//Duracio en que s'executaran les frases aleatories
		ServeiExecutor.awaitTermination(60, TimeUnit.SECONDS);
		
		//Quan s'acabe el temps es para el runnable
		ServeiExecutor.shutdown();
		
		//Fi del programa
		System.out.println("Fi del programa");
	}
	}

class Cartell implements Runnable {
	int contador = 0;
	int numrepe = 0;
	boolean nrep = false;
	
	String m1 = "Fes esport";
	String m2 = "No fumes, no faigues com jo";
	String m3 = "Menja fruita cada dia";
	String m4 = "Consumeix 5 lactis al dia";
	String m5 = "Beu 1,5l d'aigua al dia";
	
	ArrayList<String> miss = new ArrayList<String>();
	
	@Override
	public void run() {
		int random = (int)(Math.random()*4);
		
		//Afegim els missatges a l'array
		miss.add(m1);
		miss.add(m2);
		miss.add(m3);
		miss.add(m4);
		miss.add(m5);
		
		//Si el numero random es igual al numero que s'ha mostrat
		if(random == numrepe) {
			nrep = true;
		}
		else {
			nrep = false;
		}
		
		numrepe = random;
		
		if(nrep == true) {
			random = (int)(Math.random()*4);
			nrep = false;
		}
		else {
			System.out.println(miss.get(random) + "   Segon: [" + contador + "]");
		}
		contador = contador + 3;
	}
}
