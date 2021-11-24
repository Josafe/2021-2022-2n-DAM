package Piles;

import java.util.*;


public class ex7_StackV3 {


	public static void main(String[] Args) throws Exception {
		
		Scanner llegir = new Scanner(System.in);
		
		ArrayList<String> operador = new ArrayList<String>();
		Stack<Integer> calculadora = new Stack<>();
		
		int suma = 0;
		int resta = 0;
		int multi = 0;
		
	/*	calculadora.push(3);
		calculadora.push(4);
		calculadora.push(6);
		calculadora.push(5);
		calculadora.push("-");
		calculadora.push("+");
		calculadora.push("*");
		calculadora.push(6);
		calculadora.push("+"); */
		
		for(int i = 0; i < 4; i++) {
		System.out.println("Inserta un numero");
		String num = llegir.next();
		int transform;
		transform = Integer.parseInt(num);
		calculadora.push(transform);
		
		if(calculadora.isEmpty()) {
			throw new Exception("Error t'has deixat una pila buida");
		}
		}
		System.out.println("Introdueix l'operador");
		operador.add(llegir.next());
		
		for(int i = 0; i < calculadora.size(); i++) {
			if(operador.equals("+") || i == 1) {
				int resultatS = 0;
				resultatS = calculadora.get(3) + calculadora.get(2);
				calculadora.pop();
				calculadora.push(resultatS);
			}
			if(operador.equals("-") || i == 2 ) {
				int resultatR = 0;
				resultatR = calculadora.get(0) - calculadora.get(3);
				calculadora.pop();
			}
			if(operador.equals("*") || i == 3 ) {
				int resultatM = 0;
				resultatM = calculadora.get(0) * calculadora.get(2);
			}
			if(operador.equals("+") || i == 4) {
				int resultatT = 0;
				resultatT = calculadora.get(3) + calculadora.get(1);
			}
		
		}
		
		System.out.println(calculadora);
		
	
		if(!calculadora.isEmpty()) {
			throw new Exception("Error t'has deixat una pila buida");
		}
	/*	else {
			System.out.println("Inserta quin calcul vols realitzaR \n1 + \n2 - \n3 *");
			operador = llegir.nextLine();
		}*/
		//System.out.println(operar(3, 4, 6, 5, operador));
	}
	
	
	//Operadors
	public static boolean operador (String operador) {
		return operador.equals("+") || operador.equals("-") || operador.equals("*");
	}
	
	public static int operar(int a, int b, int c, int d,  String operador) {
		return ((c - d) + b) * a + 6 ;

	}
	
	
}

