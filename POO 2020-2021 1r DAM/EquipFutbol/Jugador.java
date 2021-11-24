package EquipFutbol;

public class Jugador {

	private String nombreJugador;
	private String nacionalidad;
	private String posicion;
	
	public String getNombre() {
		return nombreJugador;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public String getPosicion() {
		return posicion;
	}
	
	public void setNombre(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public void setposicion(String posicion) {
		this.posicion = posicion;
	}
}
