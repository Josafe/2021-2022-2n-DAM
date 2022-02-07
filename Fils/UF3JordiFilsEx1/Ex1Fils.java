package UF3JordiFilsEx1;

public class Ex1Fils extends Thread {

	String name = "Fil: ";
	main mainAleatori;
	
	public void run() {
		
		System.out.println("Num aleatori " + name + " " +  (int)(Math.random()*6+1));
	}
}
