package Equifutbolrepas;
import java.util.ArrayList;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		
		SeleccionFutbol jugador1 = new Futbolista(41, "Jose", "Mota", 28, 7, "Montsianell");
		SeleccionFutbol jugador2 = new Futbolista(80, "Angel", "Rangel", 30, 10, "Alfacs");
		
		SeleccionFutbol entrenador = new Entrenador(19, "Miquel", "Masdeu", 46, 19);
		
		SeleccionFutbol massagista = new Masajista(18, "Alfredo", "Armengol", 30, "Graduat en acupuntura", 8);
		
		ArrayList<SeleccionFutbol> llistaSeleccio = new ArrayList<>();
		llistaSeleccio.add(jugador1);
		llistaSeleccio.add(entrenador);
		
	
		for(SeleccionFutbol x : llistaSeleccio) {
			System.out.println(x.nombre);
			System.out.println(x.apellidos);
			System.out.println(x.edad);
			System.out.println(x.id);
			System.out.println("");
		}
		for(SeleccionFutbol x : llistaSeleccio) {
			x.concentrarse();
			x.viajar();
			x.entrenar();
			x.jugarPartido();
			x.massatge();
			System.out.println("");
		}
		
		Iterator i = llistaSeleccio.iterator();
		
		jugador1.concentrarse();
		jugador1.entrenar();
		jugador1.jugarPartido();
		jugador1.viajar();
		
		System.out.println("");
		
		entrenador.concentrarse();
		entrenador.entrenar();
		entrenador.jugarPartido();
		entrenador.viajar();
		
		System.out.println("");
		
		massagista.massatge();
	}
}
