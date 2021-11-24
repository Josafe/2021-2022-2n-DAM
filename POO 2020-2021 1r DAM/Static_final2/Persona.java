package Static_final2;
import java.util.regex.Pattern;
public class Persona{

private final String dni;
private String nombre;
private String apellidos;
private int edad;

//Declararem l'atribut final majoredad que no sera modificable
private static final int majorEdad = 18;


public Persona(String dni, String nombre, String apellidos, int edad){
	
	this.dni = dni;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
	
}



public String getdni() {
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

/*public void setdni(String dni) {
	this.dni = dni;
}*/

public void setnombre(String nombre) {
	this.nombre = nombre;
}
public void setapellidos(String apellidos) {
	this.apellidos = apellidos;
}
public void setedad(int edad) {	
	this.edad = edad;
}

public void imprime() {
	System.out.println(dni);
	System.out.println(nombre);
	System.out.println(apellidos);
	System.out.println(edad);
}
public boolean EsMayor() {
	
	if (this.edad < majorEdad) {
		return true;
	}
	else {
		return false;
	}
}

public boolean EsJubilado() {
	if (this.edad > 65 )
	{
		return true;
	}
	else {
		return false;
	}
}
public void diferenciaEdad (Persona p) {
	System.out.println( this.edad - p.edad);
}

public static boolean validarDNI(String dni) {
	 // rangos A-H J-N P-T V-Z (recordad, algunas no se permiten)
    String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";
    // Devuelve true si se cumple la expresion regular
    return Pattern.matches(dni, dniRegexp);
}

}