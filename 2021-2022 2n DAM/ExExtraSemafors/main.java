package ExExtraSemafors;

import java.util.ArrayList;

public class main {
	
	public static void main(String[] args) {
		
		ArrayList<String> llista = new ArrayList<String>();
		AccesRW acces = new AccesRW(llista);
		
		for(String x : llista)
		{
				System.out.println(llista);
				
		}
	}
}
