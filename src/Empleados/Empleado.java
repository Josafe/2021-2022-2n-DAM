package Empleados;

public class Empleado {
protected String nombre;

public Empleado(String nombre) {
	this.nombre = nombre;
}

public void getNombre() {
	this.nombre = nombre;
}
public String setNombre(String nombre) {
	return nombre;
}

public String toString() {
	return "L'empleat  " + this.nombre;
}
}
