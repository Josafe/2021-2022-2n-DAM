package Vehicles;

public class Avio extends Aeris {

	private String tiempoVuelo;
	
	public Avio (String tiempoVuelo, int asientos, String matricula, String modelo) {
		super(asientos, matricula, modelo);
		this.tiempoVuelo = tiempoVuelo;
	}
	
	public String getTiempo() {
		return tiempoVuelo;
	}
	
	public void setTiempo(String tiempoVuelo) {
		this.tiempoVuelo = tiempoVuelo;
	}
	public void imprimir() {
		System.out.println("L'avio " + modelo + " amb la matricula " + matricula + " te " + tiempoVuelo + " temps de vol");
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
