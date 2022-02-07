package UF3JordiFilsEx8Extra2;

public class Auxiliar extends Thread {

	Thread DaniEsTonto = new Thread();
	TemperaturesFuncions temp = new TemperaturesFuncions();
	
	public void run() {
	temp.AfegirTemp();
	temp.CalcularTemp();
	try {
		
		wait();
	}
	catch (Exception e) {
		 
	}
	notify();
	}
}
