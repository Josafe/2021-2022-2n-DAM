package Vehicles;

public class Barco extends Aquatics{
	
	private boolean motor;
	
	public Barco(boolean motor, double eslora, String matricula, String modelo) {
		super(eslora, matricula, modelo);
		this.motor = motor;
	}
	
	public boolean getMotor() {
		return motor;
	}
	
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	
	public void imprimir() {
		System.out.println("El vaixell " + modelo + " amb la matricula " + matricula + motor + " dispon de motor, te un total de " + eslora + "m d'eslora" );
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
