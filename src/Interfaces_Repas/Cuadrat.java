package Interfaces_Repas;


public class Cuadrat implements FiguraGeo, Comparable<Cuadrat>{

	private int costat;
	
	public Cuadrat(int c) {
		this.costat = c;
	}
	
	public float CalculaArea() {
		return this.costat*this.costat;
	}
	
	public float CalculaPerimetre() {
		return 4*this.costat;
	}
	
	public float Comparable() {
		return costat;
	}

	@Override
	public int compareTo(Cuadrat o) {
		return this.costat - o.costat;
	}
}
