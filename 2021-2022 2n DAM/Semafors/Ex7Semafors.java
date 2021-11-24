package Semafors;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;


public class Ex7Semafors {
	public static void main(String[] args) throws InterruptedException {
		int s = 500;
		
		operativitat operacio = new operativitat(s);
		
		ingresar ingres = new ingresar(operacio);
		retirar retir = new retirar(operacio);
		
		while(s>0) {
			ingres.run();
			retir.run();
			Thread.sleep(1000);
		}
	}
}
	
	class operativitat {
		Semaphore semafor = new Semaphore(1);
		
		int saldo = 0;
		int total = 0;
		
		public operativitat(int s) {
		this.saldo = s; }
		
		int ingresar() throws InterruptedException { //metodo ingresar amb el semafor d'operativitat llançant l'excepcio
			semafor.acquire();
			
			int ingres = (int)(Math.random()*100+0);
			
			System.out.println(total +  "antes");
			
			total = saldo + ingres;
			
			System.out.println(total + " despres");
			
			System.out.println("S'han ingresat " + saldo + " saldo total " + total);
			
			semafor.release();
			
			return total;
		}
		
		int retirar() throws InterruptedException { //metodo retirar amb el semafor d'operativitat llançant l'excepcio
			semafor.acquire();
			
			int retira = (int)(Math.random()*100+0);
			
			System.out.println(total +  "antes");
			
			total = saldo - retira;
			
			System.out.println(total + " despres");
			
			System.out.println("S'han retiratS " + saldo + " saldo total " + total);
			
			semafor.release();
			
			return total;
		}

	}

	class ingresar extends Thread {
		
		operativitat operaciones; //variable de la classe operativitat
		
		ingresar(operativitat operaciones){ //Constructor de classe operativitat
			this.operaciones=operaciones;
		}
		
		public void run() {
			try {
				operaciones.ingresar(); //cridem a la funcio ingresar de la classe operativitat
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	class retirar extends Thread {
	
		operativitat operaciones;
		
		retirar(operativitat operaciones){ //Constructor de la classe operativitat
			this.operaciones = operaciones;
		}
		
		public void run() {
			try {
				operaciones.retirar(); //Cridem al metode/funcio retirar de la classe operativitat
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}





