package Empresa_Empleados;

public class Empleados {
	private final String nombre;
	private final String DNI;
	private double sueldo_bruto;
	private int edad;
	private long telefono;
	private String direccion;
	
	public Empleados(String nombre, String DNI, double sueldo, int edad, long telefono, String direccion) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.sueldo_bruto = sueldo;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	//Getters
	public String getNombre() {
		return nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public double getSueldo() {
		return sueldo_bruto;
	}
	public int getEdad() {
		return edad;
	}
	public long getTelef() {
		return telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	
	//SETTERS
	public void setSueldo(double sueldo) {
		this.sueldo_bruto = sueldo;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setTelf(long telefono) {
 		this.telefono = telefono;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public double sueldoBruto(double sueldoBruto) {
		
		double sueldoNeto = 0;
	
		if (sueldoBruto*12 < 12000) {
			sueldoNeto = sueldoBruto * 0.80 * 12;
		}
		else if (sueldoBruto*12 > 12000 && sueldoBruto*12 < 25000) {
			sueldoNeto = sueldoBruto * 0.70 * 12;
		}
		else if (sueldoBruto*12 > 25000) {
			sueldoNeto = sueldoBruto * 0.60 * 12;
		}
		return sueldoNeto;
	}
	public String toString() {
		return "L'empleat " + nombre + " amb el DNI " + DNI + " te un sou brut de " + sueldo_bruto + " amb l'edad de " + edad + " telefon: " + telefono + "direccion";
	}
}
