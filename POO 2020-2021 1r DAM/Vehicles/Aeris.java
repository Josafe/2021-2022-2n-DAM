package Vehicles;

public class Aeris extends Vehicles {

	private final int asientos;
	
	public Aeris(int asientos, String modelo, String matricula) {
		super(modelo, matricula);
		this.asientos = asientos;
	}
	
	public int getAsientos() {
		return asientos;
	}
	
public void imprimir() {
	System.out.println("Els models aeris tenen " + modelo + "i amb la matricula " + matricula + " i una capacitat de " + asientos + " asientos ");
}
//Validar matricula

		public void Validar() {
			System.out.println("");
			if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
				System.out.println("La matricula del " + modelo + " es correcta");
			}
			else {
				System.out.println("La matricula del " + modelo + " es correcta");
			}
	}
}
