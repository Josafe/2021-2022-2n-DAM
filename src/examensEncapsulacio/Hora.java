package examensEncapsulacio;

public class Hora {

	private int hora;
	private int mins;
	
	public Hora(int h, int m) {
		this.hora = h;
		this.mins = m;
	}
	//GETTERS
	public void getHora() {
		this.hora = hora;
	}
	public void getMins() {
		this.mins = mins;
	}
	
	public int setHora(int h) {
		return h;
	}
	
	public int setMins(int m) {
		return m;
	}
	
	public String toString() {
		return "HH:MM  " + this.hora + ":" + this.mins;
	}
}
