package RepasPOO;

public class Profesorinterino extends Profesor{

	private String experienciaLaboral;
	
	public Profesorinterino(String nombre, String dni, int edad, int centresTreballats,String experienciaLaboral) {
		super(nombre, dni, edad, centresTreballats);
		this.experienciaLaboral = experienciaLaboral;
	}
	public String getExperiencia() {
		return experienciaLaboral;
	}
	public void setExperiencia(String experienciaLaboral) {
		this.experienciaLaboral = experienciaLaboral;
	}
	
}


