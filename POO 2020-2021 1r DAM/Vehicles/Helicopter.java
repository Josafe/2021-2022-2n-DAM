package Vehicles;

public class Helicopter extends Aeris {

	private int helices;
	
	public Helicopter(int helices, int asientos, String matricula, String modelo) {
		super(asientos, matricula, modelo);
		this.helices = helices;
	}
	
	public int getHelices() {
		return helices;
	}
	
	public void setHelices(int helices) {
		this.helices = helices;
	}
	
	public void imprimir() {
		System.out.println("L'helicopter " + modelo + " amb la matricula " +  matricula + " te un total de " + helices + "helices");
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
