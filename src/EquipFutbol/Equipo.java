package EquipFutbol;
import java.util.ArrayList;
public class Equipo {

	private String nombreEquipo;
	private String estadio;
	private Entrenador entrenador;
	ArrayList<Jugador> jugador = new ArrayList<>();
	
	public String getNombre() {
		return nombreEquipo;
	}
	public String getEstadio() {
		return estadio;
	}
	public Entrenador getEntrenador() {
		return entrenador;
	}
	public ArrayList<Jugador> getJugador(){ //PER A L'EXERCICI D'EXAMEN
		return jugador;
	}
	public void setEstadio() {
		this.estadio = estadio;
	}
	public void setNombre(String NombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public String toString() {
		return "Equip" + nombreEquipo + "estadio" + estadio;
	}
	
	public void mostrarJugador() {
		for(Jugador jugador2: jugador) {
			System.out.println(jugador2.getNombre());
			System.out.println(jugador2.getNacionalidad());
			System.out.println(jugador2.getPosicion());
		}
	}
	
	public void mostrarEntrenador() {
		System.out.println();
	}
	
}
