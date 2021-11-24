package Getter_Setter;
public class Persona{

private int dni;
private String nombre;
private String apellidos;
private int edad;

public Persona(int dni, String nombre, String apellidos, int edad){
	
	this.dni = dni;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
	
}



public int getdni() {
	return dni;
}
public String getnombre() {
	return nombre;
}
public String getapellidos() {
	return apellidos;
}
public int getedad() {
	return edad;
}

public void setdni(int dni) {
	this.dni = dni;
}
public void setnombre(String nombre) {
	this.nombre = nombre;
}
public void setapellidos(String apellidos) {
	this.apellidos = apellidos;
}
public void setedad(int edad) {	
	this.edad = edad;
}

}