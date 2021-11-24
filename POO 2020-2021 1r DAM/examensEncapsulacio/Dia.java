package examensEncapsulacio;

public class Dia {

	private int any;
	private int mes;
	private int dia;
	
	//CONSTRUCTOR
	public Dia(int a, int m, int d) {
		this.any = a;
		this.mes = m;
		this.dia = d;
	}
	
	//GETTERS
	public void getAny() {
		this.any = any;
	}
	public void getMes() {
		this.mes = mes;
	}
	public void getDia() {
		this.dia = dia;
	}
	
	//SETTERS
	public int setAny(int a) {
		return a;
	}
	public int setMes(int m) {
		return m;
	}
	public int setDia(int d) {
		return d;
	}
	
	//ToString
	public String toString() {
		return "D/M/A  " + this.dia + "/" + this.mes + "/" + this.any;
	}
}
