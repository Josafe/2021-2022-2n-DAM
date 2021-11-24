package EquipFutbol;
import java.util.ArrayList;
public class PruebaEquipo {

	public static void main(String[] args) {
		
		Entrenador entrenador = new Entrenador();
		
		entrenador.setNombre("Pep Guardiola");
		entrenador.setNacionalidad("Espanya");
		
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		Jugador jugador3 = new Jugador();
		Jugador jugador4 = new Jugador();
		Jugador jugador5 = new Jugador();
		
		jugador1.setNombre("Messi");
		jugador2.setNombre("Iniesta");
		jugador3.setNombre("Puyol");
		jugador4.setNombre("Xavi");
		jugador5.setNombre("Pique");
		
		jugador1.setNacionalidad("Argentina");
		jugador2.setNacionalidad("España");
		jugador3.setNacionalidad("España");
		jugador4.setNacionalidad("España");
		jugador5.setNacionalidad("España");
		
		ArrayList<Jugador> jugadores = new ArrayList<>();
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		jugadores.add(jugador3);
		jugadores.add(jugador4);
		jugadores.add(jugador5);
		
		Equipo Equipo = new Equipo();
		
		Equipo.setNombre("FCBarcelona");
		Equipo.setEstadio("Camp Nou");
		Equipo.setEntrenador(entrenador);
		Equipo.setJugador(jugadores);
		
		Equipo.mostrarEntrenador();
		Equipo.mostrarJugador();
	}
}
