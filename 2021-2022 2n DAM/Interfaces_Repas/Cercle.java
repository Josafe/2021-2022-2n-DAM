package Interfaces_Repas;

public class Cercle implements FiguraGeo, Comparable<Cercle> {

	int radi = 10;
	
	public Cercle(int r) {
		this.radi = r;
	}

	@Override
	public float CalculaArea() {
		// TODO Auto-generated method stub
		return (float) (3.14 * radi * 2);
	}

	@Override
	public float CalculaPerimetre() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double calcularArea() {
		return 3.14 * radi * radi;
	}
	public float Comparable() {
		return radi*2;
	}
	
	@Override
	public int compareTo(Cercle o) {
		return (int) this.CalculaArea() - (int) o.CalculaArea();
	}
}
