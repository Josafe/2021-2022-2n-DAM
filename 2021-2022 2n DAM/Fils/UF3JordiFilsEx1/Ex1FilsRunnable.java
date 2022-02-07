package UF3JordiFilsEx1;

public class Ex1FilsRunnable implements Runnable {

	String name = "Fil: ";
	main mainAleatori;
	
	@Override
	public void run() {
		System.out.println("Num aleatori " + name + " " + (int)(Math.random()*6+1));
		
	}

}
