package UF3JordiFilsEx5;

public class main {

	public static void main(String[] args) {
		AccesRW rw = new AccesRW();
		
	
			
			new Escritor("Escriptor ", rw).start();
			new Lector("Lector ", rw).start();
		
		
	}
	}

