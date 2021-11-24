package ClasePersonas;

public class Persona {
	//atributos o carcteristicas//
String nombre = "juancarlos";
String apellido = "Granados";
float Altura =183;
int edad = 19;
char genero = 'H';
int peso = 70;


//metodos acciones//
public void caminar(){
	System.out.println("estoy corriendo");
}
public void comer()  {
	System.out.println("Estoy comiendo");	
}
public void dormir() {
	System.out.println("Estoy Durmiendo");	
}
public void correr() {
	System.out.println("Estoy Corriendo");	
}
public void listar() {
	System.out.println(nombre);	
	System.out.println(apellido);	
	System.out.println(Altura);
	System.out.println(edad);
	System.out.println(genero);
	System.out.println(peso);
 }
}