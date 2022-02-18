package UF3JordiFilsEx4;

public class Adeu extends Thread{

	
	public synchronized void miss()
	{
		System.out.println("Adeu");
	}
	
	public void waitin() throws InterruptedException {
		wait();
	}
	
	public void run() {
		miss();
		
		try {
			Thread.sleep(3000);
			waitin();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
