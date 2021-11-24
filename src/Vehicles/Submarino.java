package Vehicles;

public class Submarino extends Aquatics{

	private double profunditatmax;
	
	public Submarino(double profunditatmax, double eslora, String matricula, String modelo) {
		super(eslora, matricula, modelo);
		this.profunditatmax = profunditatmax;
	}
	
	public double getProfunditat() {
		return profunditatmax;
	}
	
	public void setProfunditat(double profunditatmax) {
		this.profunditatmax = profunditatmax;
	}
	
	public void imprimir() {
		System.out.println("El submari " + modelo + " amb la matricula " + matricula + " arriba a una profunditat maxima de " + profunditatmax + " i una eslora de " + eslora);
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
