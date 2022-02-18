package UF3JordiFilsEx3;

public class avio extends Thread {

	int seients;

	public avio( int seients) {
		this.seients = seients;
	}
	
	public synchronized void seientsLliures(String n, int seients) throws InterruptedException {
		if(this.seients - seients < 0) {
			System.out.println("No queden seients lliures");
		}
		else {
		System.out.println(n + " reserva " + seients);
		this.pagar();
		this.reservaSeients(seients);
		System.out.println("Seients lliures: " + this.seients);
		}
	}
	public void pagar() throws InterruptedException {
		System.out.println("Realitzant pagament");
		Thread.sleep(3000);	
	}
	
	public void reservaSeients(int seients) {
		this.seients = this.seients - seients;
	}
}
