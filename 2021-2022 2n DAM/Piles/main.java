package Piles;

import java.util.HashMap;
import java.util.Stack;

public class main {
public static void main (String[] args) {
		
		HashMap<String, llista> paraules2 = new HashMap<>();
		
		Stack paraules = new Stack();
		
		//Afegim paraules a la pila
		
		paraules.push("hola");
		paraules.push("dos");
		paraules.push("tre");
		
		//Seleccionem la casella que volem borrar
		
		paraules.remove(0);
	
		
		for (int i = 0; i < paraules.size(); i++) {
			System.out.println(paraules.pop());
			}
		}
}
