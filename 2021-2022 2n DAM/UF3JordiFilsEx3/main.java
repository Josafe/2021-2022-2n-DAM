package UF3JordiFilsEx3;

public class main {

	public static void main(String[] args) throws InterruptedException {
		
		avio avio = new avio(5);
		
	String name;
	Client fil1 = new Client("Client " , avio);
	Client fil2 = new Client("Client " , avio);
	Client fil3 = new Client("Client " , avio);
	
		
				fil1.start();
				fil2.start();
				fil3.start();
				
		
	}
	
}
