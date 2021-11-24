package RepasPOO;

public class Profesor extends Persona{

	private int centresTreballats;
	
	public Profesor(String nombre, String dni, int edad, int centresTreballats) {
		super(nombre, dni, edad);
		this.centresTreballats = centresTreballats;
	}
	
	public String imprimir() {
		return "El professor ha treballat a " + centresTreballats;
	}
	
	public int getCentres() {
		return centresTreballats;
	}
	public void setCentres() {
		this.centresTreballats = centresTreballats;
	}
}
