package Recorregut_mapes;
import java.util.*;

public class main {

	public static void main(String[] args) {
		HashMap<String, Producte> productes = new HashMap<>();
		
		productes.put("clau1", new Producte("clau1", "Monitor", 82.19f)); //es posa la f perque es un float
		productes.put("clau2", new Producte("clau2", "Pantalla 4K", 198.28f));
	
	
		for(String codi : productes.keySet()) {
			System.out.println(productes.get(codi).mostrar());
		}
	}
}
