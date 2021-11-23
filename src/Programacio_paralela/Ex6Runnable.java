package Programacio_paralela;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Ex6Runnable implements Runnable{

	Thread t;
	int i = 0;
	int j = 0;
	
	int num = 0;
	@Override
	public void run() {
			try {
				for(int i = 0; i < 1000; i++) {
					if((num%num)  == 0 | (num%num/2) == 0) {
						System.out.println("Num no prim: " + num);
					
					}else {
						System.out.println("Valor: " + num);
					}
				}
				Thread.sleep(500);
				}
				catch(InterruptedException e) {
					
				}
	}
	
	public Ex6Runnable(int i, int j) {
		this.i = i;
		this.j = j;
	}
	public static void main(String[] args) {
		Scanner llegir = new Scanner(System.in);
		int n = 0;
		
		System.out.println("Introdueix el nº que vols per a buscar els seus primers entre 1-10");
		n = llegir.nextInt();
	
		
		//Objecte runnable
		
			Ex6Runnable n1 = new Ex6Runnable(1,1000);
		
		
	}
	
	
		class ExecutaFil{
			//2 fils de execucio
			ScheduledExecutorService fils =  Executors.newScheduledThreadPool(2);
			
			int num = 0;
			
			public ExecutaFil() {
				t = new Thread("Fil 1");
				t.start();
			}
			public ExecutaFil(int n) {
				this.num = n;
				t = new Thread("Fil 2");
			}
			
			
		}


}
	
