package UF3JordiFilsEx2;

public class main {

	public static void main(String[] args) throws InterruptedException {
	
		Ex2Fils fil1 = new Ex2Fils();
		Ex2Fils fil2 = new Ex2Fils();
		Ex2Fils fil3 = new Ex2Fils();
	
		fil1.start();
		fil2.start();
		fil3.start();
		
		fil1.join();
		fil2.join();
		fil3.join();
		
		System.out.println("Fils vius:  F1 [" + fil1.isAlive() + "] F2 [" + fil2.isAlive() + "] F3 [" + fil3.isAlive() + "] ");
		
		int resultat = fil1.num + fil2.num + fil3.num;
		
		System.out.println("Suma dados: " + resultat);
}
}
