package Piles;

import java.util.ArrayList;
import java.util.Stack;

public class ex7_Stack {

	public ArrayList<String> prefija;
	public Stack<String> calculadora;

	public ex7_Stack(ArrayList<String> prefija) {
		this.prefija = prefija;
		this.calculadora = new Stack();
	}

	public static boolean esOperador(String token) {
		return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("%") || token.equals("^");
	}
	
	
	public double rpn() throws Exception {
		
		String dreta;
		String esquerra;
		int res = 0;
		
		for (String token : prefija) {
			
			if (esOperador(token)) 
			{
				dreta = calculadora.pop();
				
				if(calculadora.isEmpty()) 
				{
					throw new Exception("Error falta un element");
				}
				
				esquerra = calculadora.pop();
				double resultat = operar(esquerra,token,dreta);
				calculadora.push("" + resultat);
			}//if
			else {
				calculadora.push(token);
			}//else
			
		}//for
		
		return Double.parseDouble(calculadora.pop());
	}
	
	

	public double operar(String esquerra, String operador, String dreta) {
	
		double a = Double.parseDouble(esquerra); //Transformem els Strings a double
		double b = Double.parseDouble(dreta);
		
		switch(operador) {
		
		case "+": return  a+b;
		case "-": return a-b;
		case "*": return a*b;
		case "/": return a/b;
		case "%": return a%b;
		case "^": return Math.pow(a, b);
		default: return -1;
		}
		
	}
	
}

