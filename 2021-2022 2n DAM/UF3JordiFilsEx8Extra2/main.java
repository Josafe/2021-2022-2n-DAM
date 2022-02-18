package UF3JordiFilsEx8Extra2;

public class main {

	
	public static void main(String[] args) {
		
		TemperaturesFuncions temp = new TemperaturesFuncions();
		
		Auxiliar fils = new Auxiliar();
		
		for(int i = 0; i < 10; i++) {
			
			try{
				fils.join();
			}catch(InterruptedException e) {
			
			}
			fils.start();
			}
	}
}
