package UF3JordiFilsEx7Extra2;

public class Cotxe extends Thread {

	
	Parking parking;
	int arribada = (int)(Math.random()*60000+1000);
	int estadaparking = (int)(Math.random()*30000+1000);
	
	public Cotxe(String matricula, Parking p) {
		super(matricula);
		this.parking = p;
		start();
	}
	
	public void run() {
		try {
			//Simulem arribades durant 60s amb el thread sleep sempre envoltat del try catch
			Thread.sleep(arribada);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		parking.aparcar(getName()); //Cridem al metode aparcar de Parking
		
		System.out.println(getName() + " entra al parquing" + " places lliures: " + parking.getPlacesLliures()); //Cridem al getter placesLliures de la classe Parking
		
		try {
			//Simulem la entrada al parquing durant un temps aleatori de 30s amb el sleep sempre envoltat de try catch
			Thread.sleep(estadaparking);
		}
		catch (InterruptedException e) {}
		
		parking.sortir(getName());
		System.out.println(getName() + " surt del parking " + " places lliures: " + parking.getPlacesLliures());
	}
}

