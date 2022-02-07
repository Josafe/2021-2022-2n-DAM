package UF3JordiFilsEx8Extra;

public class TempMax extends Thread{

	
	Temperatures temperatura = new Temperatures();
	
	
	public TempMax(Temperatures temperatura) {
		this.temperatura = temperatura;
	}
	
	@Override
	public void run() {
		temperatura.calcularTemperatures();
		
	}
}
 