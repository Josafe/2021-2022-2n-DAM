package Vehicles;

public class Aquatics extends Vehicles {

	protected final double eslora;
	
	public Aquatics (double eslora, String modelo, String matricula) {
		super(modelo, matricula);
		this.eslora = eslora;
	}	
	
	public double getEslora() {
		return eslora;
	}
	public void imprimir() {
		System.out.println("El vehicle aquatic te el model " + modelo + " i la matricula " + matricula + " i te una eslora total de " + eslora + "m.");
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
