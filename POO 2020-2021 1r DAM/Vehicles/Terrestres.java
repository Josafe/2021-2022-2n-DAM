package Vehicles;

public class Terrestres extends Vehicles {
	
	protected final int ruedas;

	public Terrestres (int ruedas, String matricula, String modelo) {
		super(matricula, modelo);
		this.ruedas = ruedas;
	}
	
	public int getRuedas() {
		return ruedas;
	}
	//NO ES POT AMB FINAL
	/*public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}*/
	
	public void imprimir() {
		 System.out.println("Els models terrestres tenen " + modelo + " i amb la matricula " + matricula + " te " + ruedas + " rodes");
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
