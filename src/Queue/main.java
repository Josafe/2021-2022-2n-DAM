package Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class main {

	public static void main(String[] args) {
							//Amb PriorityQueue t'ho ordena alfabeticament
							//Amb LinkedList no s'ordena
							//Amb queue el primer que arriba es el primer que surt FIFO mentre que pila es LIFO (last in first out)
	
		Queue<String> cola = new PriorityQueue<String>();
	
	cola.add("uno");
	cola.add("do");
	cola.add("tre");
	
	//cola.clear();
	
	while(!cola.isEmpty())
	System.out.println(cola.poll() + "-");
	}
}
