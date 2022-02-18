package UF3JordiFilsEx4;


public class Hola extends Thread{

	
	public synchronized void miss()
	{
		System.out.println("Hola");
	}
	
	public void notifying() {
		notify();
	}
	
	public void run() {
		miss();
		notifying();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
