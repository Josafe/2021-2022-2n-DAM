package Algoritmes;
import java.util.Scanner;

import org.junit.jupiter.api.io.TempDir;

public class FCFS_SRTF_RR {

	public static void main(String[] args) {
		Scanner llegir = new Scanner(System.in);
		
		
		//FCFS
		int numP = 0;
		System.out.println("Introdueix el numero de proces");
		numP = llegir.nextInt();
		
		int pid[] = new int[numP];
		int bt[] = new int[numP]; //burst time
		int ar[] = new int[numP];
		int ct[] = new int[numP]; //current time
		int ta[] = new int[numP]; //time arrival
		
		
		for(int i = 0; i < numP; i++) {
			System.out.println("Introdueix proces " + (i+1) + " temps d'arribada: ");
			ar[i] = llegir.nextInt();
			
			System.out.println("Introdueix proces " + (i+1) + " burst time: ");
			bt[i] = llegir.nextInt();
			pid[i] = i + 1;
		}
		
		int temp = 0;
		
		for(int i = 0; i < numP; i++) {
			for(int j = 0; j  < numP; i++) {
				
			if(ar[i] > ar[j]) {
				temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
				
				temp = pid[i];
				pid[i] = pid[j];
				pid[j] = temp;
				
				temp = bt[i];
				bt[i] = bt[j];
				bt[j] = temp;
			}
		}
	}
	
		int wt[] = new int[numP]; //waiting time
		
		System.out.println("___________________________________");
		
		ct[0] = bt[0] + ar[0];
		for(int i = 1; i < numP; i++) {
			ct[i] = ct[i] - ar[i];
			wt[i] = ta[i] - bt[i];
		}
		for(int i = 0; i < numP; i++) {
			ta[i] = ct[i] - ar[i];
			wt[i] = ta[i] - bt[i];
		}
		System.out.println("Proces \t \tAT \t\tBT\t\tCT\t\tTAT\t\tWT");
	
		for(int i = 0; i < numP; i++) {
			System.out.println(pid[i]+"\t\t\t" + ar[i] + "\t\t" + bt[i] + "\t\t" + ct[i] + "\t\t" + ta[i] + "\t\t" + wt[i]);
		}
		
		System.out.println("gant chart: ");
		for(int i = 0; i < numP; i++) {
			System.out.println("P" + pid[i] + " ");
		}
		
		//RR
		
		int quantum = 2;
		
		//Copia del burst time
		int rem_bt[] = new int[numP];
		
		for(int i = 0; i < numP; i++) {
			rem_bt[i] = bt[i];
		}
		
		//Quantum RR
		System.out.println("Introdueix el quantum per al RR");
		quantum = llegir.nextInt();
		
		//Assignem una variable per a contar el burst time total
		int total = 0;
		
		do {
			for(int i = 0; i < numP; i++) {
				if(bt[i] > quantum) {
					for (int j = 0; j < numP; j++) {
						if(j != i && bt[j] != 0) {
							wt[j] += quantum;
						}
					}
					bt[i] -= quantum;
				}
				else {
					for(int j = 0; j < numP; j++) {
						if(j != i && bt[j] != 0) {
							wt[j]+=quantum;
						}
					}
					bt[i] = 0;
				}
			}
			total = 0;
			for(int i = 0; i < numP; i++) {
				total += bt[i];
			}
		} while (total != 0); //Quan tots els processos arriben a 0 es pararà el do-while
		
			System.out.println("Process \t\t\twaiting time");
			
			//Ara assignarem una variable per a obtenir el total de waiting time
			float total_wt = 0;
			
			for(int  i = 0; i < numP; i++) {
				System.out.println("p" + (i+1) + "\t\t\t" + wt[i]);
				total_wt += wt[i];
			}
			
			System.out.println("Average waiting time is: " + (total_wt / numP));
		}
			
			
}
