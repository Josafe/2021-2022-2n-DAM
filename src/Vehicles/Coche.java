package Vehicles;

public class Coche extends Terrestres{

	private boolean aire;
	
	public Coche(boolean aire, int ruedas, String matricula, String modelo) {
		super(ruedas, matricula, modelo);
		this.aire = aire;
	}
	
	public boolean getAire() {
		return aire;
	}
	public void setAire(boolean aire) {
		this.aire = aire;
	}
	public void imprimir() {
		System.out.println("Model del cotxe: "  + modelo + " te " + ruedas + "rodes, i" + aire + " dispon d'aire acondicionat");
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
