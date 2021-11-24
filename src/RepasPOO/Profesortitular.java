package RepasPOO;

public class Profesortitular extends Profesor {

	private String dataContracte;
	
	public Profesortitular(String nombre, String dni, int edad, int centresTreballats,String dataContracte) {
		super(nombre, dni, edad, centresTreballats);
		this.dataContracte = dataContracte;
	}
	public String getData() {
		return dataContracte;
	}
	public void setData() {
		this.dataContracte = dataContracte;
	}
}
