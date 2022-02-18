package UF3JordiFilsEx3;

public class Client extends Thread {

	avio avio;
	
	public Client(String n, avio avio ) {
		super(n);
		this.avio = avio;
	}
	
	public void run() {
		try {
			avio.seientsLliures(getName(), 3); // Reserva 3 seients
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
