package Programacio_paralela;

public class Ex6RunnableV2 implements Runnable {

	private int num;
	int contador = 1;
	int nInicial = 0;
	int nFinal = 0;
	boolean prim;

	public Ex6RunnableV2(int n) {
		this.num = n;
	}
	
	@Override
	public void run() {
		
		if (num == 1) {
			nFinal = 1000;
			System.out.println("Fil d'execució 1");
			
			for(int i = nInicial; i <= nFinal; i++) {
				prim = true;
				for(int j = 2; j <= Math.sqrt(i) && prim; j++) {
					if(i % j == 0) 
					{ prim = false; }
				}
				if (prim) {
					System.out.println(i);
					System.out.println("----");
				}
			}
		}
			
		if(num == 2) {
			nInicial = 1000;
			nFinal = 2000;
			System.out.println("Fil d'execució 2");
			
			for(int i = nInicial; i <= nFinal; i++) {
				prim = true;
				for(int j = 2; j <= Math.sqrt(i) && prim; j++) {
					if(i % j == 0) {
						prim = false;
					}
				}
				if(prim) {
					System.out.println(i);
					System.out.println("----");
				}
			}
		}
			if(num == 3) {
				nInicial = 3000;
				nFinal = 4000;
				System.out.println("Fil d'execució 3");
				
				for(int i = nInicial; i <= nFinal; i++) {
					prim = true;
					for(int j = 2; j <= Math.sqrt(i) && prim; j++){
						if(i % j == 0) {
							prim = false;
						}
					}
					if(prim) {
						System.out.println(i);
						System.out.println("----");
					}
				}
			}
			if(num == 4) {
				nInicial = 4000;
				nFinal = 5000;
				
				System.out.println("Fil d'execució 4");
				
				for(int i = nInicial; i <= nFinal; i++) {
					prim = true;
				
					for(int j = 2; j <= Math.sqrt(i); j++) {
						if(i % j == 0) {
							prim = false;
						}
					}
					if(prim) {
						System.out.println(i);
						System.out.println("----");
					}
				}
			}
			
			if(num == 5) {
				nInicial = 5000;
				nFinal = 6000;
				
				System.out.println("Fil d'execució 5");
				
				for(int i = nInicial; i <= nFinal; i++) {
					prim = true;
					
					for(int j = 2; j < Math.sqrt(i); j++) {
						if(i % j == 0) {
							prim = false;
						}
					}
					if(prim) {
						System.out.println(i);
						System.out.println("----");
					}
					}	
				}
				if(num == 6) {
					nInicial = 6000;
					nFinal = 7000;
					
					System.out.println("Fil d'execució 6");
					
					for(int i = nInicial; i <= nFinal; i++) {
						prim = true;
						
						for(int j = 2; j < Math.sqrt(i); j++) {
							if(i % j == 0) {
								prim = false;
							}
						}
						if(prim) {
							System.out.println(i);
							System.out.println("----");
						}
					}
				}
				if(num == 7) {
					nInicial = 7000;
					nFinal = 8000;
					
					System.out.println("Fil d'execució 7");
					
					for(int i = nInicial; i <= nFinal; i++) {
						prim = true;
						
						for(int j = 2; j <= Math.sqrt(i); j++) {
							if(i % j == 0) {
								prim = false;
							}
						}
						if(prim) {
							System.out.println(i);
							System.out.println("----");
						}
					}
				}
				if(num == 8) {
					nInicial = 8000;
					nFinal = 9000;
					
					System.out.println("Fil d'execució 8");
					
					for(int i = nInicial; i<= nFinal; i++) {
						prim = true;
						
						for(int j = 2; j <= Math.sqrt(i); j++) {
							if(i % j == 0) {
								prim = false;
							}
						}
						if(prim) {
							System.out.println(i);
							System.out.println("----");
						}
					}
				}
				if(num == 9) {
					nInicial = 9000;
					nFinal = 10000;
					
					System.out.println("Fil d'execució 9");
					
					for(int i = nInicial; i <= nFinal; i++) {
						prim = true;
						
						for(int j = 2; j <= Math.sqrt(i); j++) {
							if(i % j == 0) {
								prim = false;
							}
						}
						if(prim) {
							System.out.println(i);
							System.out.println("----");
						}
					}
				}
		
	}
}
