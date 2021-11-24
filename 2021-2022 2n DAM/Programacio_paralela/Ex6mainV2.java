package Programacio_paralela;

import java.util.Scanner;

public class Ex6mainV2 {

	public static void main(String[] args) throws InterruptedException {
		Scanner llegir = new Scanner(System.in);
		
		int n = 0; //Numero de fils que crearem
		
		System.out.println("Introdueix un nº de l'1 al 9");
		n = llegir.nextInt();
		
		if(n > 9 || n <= 0) {
			System.out.println("El numero introduit no es dins del rang");
		}
		else {
			System.out.println("Num introduit: " + n);
			
			//Processos creats
			
			for(int i = 1; i <= n; i++) {
				Ex6RunnableV2 pFor = new Ex6RunnableV2(i);
				Thread filFor = new Thread(pFor);
				
				filFor.start();
				filFor.join();
			}
			
			/*
			Ex6RunnableV2 p1 = new Ex6RunnableV2(1);
			Ex6RunnableV2 p2 = new Ex6RunnableV2(2);
			Ex6RunnableV2 p3 = new Ex6RunnableV2(3);
			Ex6RunnableV2 p4 = new Ex6RunnableV2(4);
			Ex6RunnableV2 p5 = new Ex6RunnableV2(5);
			Ex6RunnableV2 p6 = new Ex6RunnableV2(6);
			Ex6RunnableV2 p7 = new Ex6RunnableV2(7);
			Ex6RunnableV2 p8 = new Ex6RunnableV2(8);
			Ex6RunnableV2 p9 = new Ex6RunnableV2(9);
			
 			Thread fil1 = new Thread(p1);
 			Thread fil2 = new Thread(p2);
 			Thread fil3 = new Thread(p3);
 			Thread fil4 = new Thread(p4);
 			Thread fil5 = new Thread(p5);
 			Thread fil6 = new Thread(p6);
 			Thread fil7 = new Thread(p7);
 			Thread fil8 = new Thread(p8);
 			Thread fil9 = new Thread(p9);
 			
 			switch(n) {
 			
 			case 1:
 				fil1.start();
 				fil1.join();
 				
 			case 2:
 				fil1.start();
 				fil1.join();
 				fil2.start();
 				fil2.join();
 				
 			case 3:
 				fil1.start();
 				fil1.join();
 				fil2.start();
 				fil2.join();
 				fil3.start();
 				fil3.join();
 				
 			case 4:
 				fil1.start();
 				fil1.join();
 				fil2.start();
 				fil2.join();
 				fil3.start();
 				fil3.join();
 				fil4.start();
 				fil4.join();
 				
 			case 5:
 				fil1.start();
 				fil1.join();
 				fil2.start();
 				fil2.join();
 				fil3.start();
 				fil3.join();
 				fil4.start();
 				fil4.join();
 				fil5.start();
 				fil5.join();
 				
 			case 6:
 				fil1.start();
 				fil1.join();
 				fil2.start();
 				fil2.join();
 				fil3.start();
 				fil3.join();
 				fil4.start();
 				fil4.join();
 				fil5.start();
 				fil5.join();
 				fil6.start();
 				fil6.join();
 				
 			case 7:
 				
 				fil1.start();
 				fil1.join();
 				fil2.start();
 				fil2.join();
 				fil3.start();
 				fil3.join();
 				fil4.start();
 				fil4.join();
 				fil5.start();
 				fil5.join();
 				fil6.start();
 				fil6.join();
 				fil7.start();
 				fil7.join();
 				
 			case 8:
 				
 				fil1.start();
 				fil1.join();
 				fil2.start();
 				fil2.join();
 				fil3.start();
 				fil3.join();
 				fil4.start();
 				fil4.join();
 				fil5.start();
 				fil5.join();
 				fil6.start();
 				fil6.join();
 				fil7.start();
 				fil7.join();
 				fil8.start();
 				fil8.join();
 			
 			case 9:
 				fil1.start();
 				fil1.join();
 				fil2.start();
 				fil2.join();
 				fil3.start();
 				fil3.join();
 				fil4.start();
 				fil4.join();
 				fil5.start();
 				fil5.join();
 				fil6.start();
 				fil6.join();
 				fil7.start();
 				fil7.join();
 				fil8.start();
 				fil8.join();
 				fil9.start();
 				fil9.join();
 			}*/
		}
	}
}
