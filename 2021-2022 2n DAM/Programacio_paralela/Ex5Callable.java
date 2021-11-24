package Programacio_paralela;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public abstract class Ex5Callable implements Callable<Integer>{
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2); //Declaracio de fils maxims
		List<Divisible> llista = new ArrayList<Divisible>();
		
		for(int i = 0; i < 101; i++) {
			Divisible calcula = new Divisible(i);
			llista.add(calcula);
		}
		List <Future<Integer>> llistaResultats;
		llistaResultats = executor.invokeAll(llista);
		executor.shutdown();
		
		for(int i = 0; i < llistaResultats.size(); i++) {
			Future<Integer> resultat = llistaResultats.get(i);
			try {
				System.out.println("Els num divisibles poden ser: " +i+ " i son: " + resultat.get());
			}catch(InterruptedException | ExecutionException e) {
				
			}
		}
	}
	
	static class Divisible implements Callable<Integer>{
		int num;
		
		public Divisible(int n) {
			this.num = n;
		}
		public Integer call() throws Exception {
			
			int resultat = 0;
			
			if((num % 2) == 0) { //Si el residu divisible entre 2 es 0
				resultat = 1;
			}
			else if((num % 3) == 0) { //Si el residu divisible entre 3 es 0
				resultat = 1;	
			}
			else {
				resultat = 0;
			}
			return resultat;
			}

		
	}	
	}
	
