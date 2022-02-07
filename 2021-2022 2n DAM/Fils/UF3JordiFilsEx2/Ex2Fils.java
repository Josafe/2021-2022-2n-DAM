package UF3JordiFilsEx2;

public class Ex2Fils extends Thread {

	String name = "Fil: ";
	main mainAleatori;
	int num = (int)(Math.random()*6+1);
	int tirada;
	
	public void run() {
		
		System.out.println("Num aleatori " + name + " " + num);
	}
	
	public int getTirada() {
		return tirada;
	}
	
	public void setTirada(int tirada) {
		this.tirada = tirada;
	}
	
	public int dado() {
		return num;
	}
	
	public void almacenaDado() {
		int resultat = 0;
		resultat += num;
		System.out.println(resultat);
	}
}
