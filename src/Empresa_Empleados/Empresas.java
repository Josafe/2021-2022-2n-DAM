package Empresa_Empleados;
import java.util.ArrayList;
import java.util.Scanner;

public class Empresas {
Scanner llegir = new Scanner(System.in);
	
	private final String CIF;
	private long telefono;
	private String direccion;
	private int empleados;
	private ArrayList<Empleados> LlistaEmpleats;
	
public Empresas(String CIF, long telefono, String direccion, int empleados, ArrayList ListaEmpleats) {
	this.CIF = CIF;
	this.telefono = telefono;
	this.direccion = direccion;
	this.empleados = empleados;
	this.LlistaEmpleats = new ArrayList<>();
}
//GETTERS
public String getCIF() {
	return CIF;
}
public long getTelf() {
	return telefono;
}
public String getDireccion() {
	return direccion;
}
public int getEmpleados() {
	return empleados;
}
public ArrayList getEmpleado() {
	return LlistaEmpleats;
}

//SETTERS
public void setTelf(long telefono) {
	this.telefono = telefono;
}
public void setEmpleados(int empleados) {
	this.empleados = empleados;
}
public void setEmpleado(ArrayList LlistaEmpleats) {
	this.LlistaEmpleats = LlistaEmpleats;
}

public void anadirEmpleado(Empleados m) {
	LlistaEmpleats.add(m);
}
public void eliminarEmpleado(Empleados r) {
	LlistaEmpleats.remove(r);
}
public String toString() {
	return Empleados.toString();
		
}
}