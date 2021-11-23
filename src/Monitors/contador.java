package Monitors;

public class contador {

	int acumula;
	
	public contador() {
		this.acumula = 0;
	}
	
	public synchronized void numAleatorio(String n) throws InterruptedException {
		
		System.out.println("___________________");
		int random = (int) (Math.random()*5000+1);
		
		if(random % 2 == 0) {
			
			acumula += random;
			
		}
		else {
			acumula -= random;
		}
		
		System.out.println("S'ha generat: " + random + " / " + n + " s'ha acumulat " + acumula ); //Es passa e random definit a dalt i el "string n" que entra al metode 
																								  //introduit al main Thread fil = new Thread(new Ex9("Fil " + i, cont));
		Thread.sleep(1000);
	}
	
	public void numAleatorioNS(String n) {
		
		System.out.println("___________________");
		
		int random = (int)(Math.random()*5000+1);
		
		if (random % 2 == 0) {
			acumula += random;
		}
		else {
			acumula -= random;
		}
		
		System.out.println("S'ha generat: " + random + " / " + n + " s'ha acumulat " + acumula );
		
		
	}
}
