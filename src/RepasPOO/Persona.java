package RepasPOO;

public abstract class Persona {

	protected String nombre;
	protected String dni;
	protected int edad;
	
	public Persona(String nombre, String dni, int edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDni() {
		return dni;
	}
	public int getEdad() {
		return edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public abstract String imprimir();
	
	
}
