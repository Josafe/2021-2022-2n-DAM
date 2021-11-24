package Vehicles;

public class Moto extends Terrestres {
 
	private String color;
	
	public Moto(String color, int ruedas, String matricula, String modelo) {
		super(ruedas, matricula, modelo);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void imprimir() {
		System.out.println( "La moto " + modelo + " amb la matricula " + matricula + "te" + ruedas +  "rodes i es de color: " + color);
	}
	public void Validar() {
		System.out.println("");
		if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{2}$")) {
			System.out.println("La matricula del " + modelo + " es correcta");
		}
		else {
			System.out.println("La matricula del " + modelo + " es correcta");
		}
}
}
