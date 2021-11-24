package HerenciaEx1;
import java.util.ArrayList;
public class Planetas extends
Astros {
	private String nombre;
	private int distanciaSol;
	private int orbitaSol;
	private boolean teSatelites;
	private ArrayList<Satelites> EsDe = new ArrayList<>();
	
	public Planetas(String nombre, int radio, int rotacion, int masa, int temperatura, int gravedad, int dSol, int oSol) {
		super(radio, rotacion, masa, temperatura, gravedad);
		this.distanciaSol = dSol;
		this.orbitaSol = oSol;
		this.teSatelites = false;
	}
	
	public void Añadir(Satelites Satelite) {
		EsDe.add(Satelite);
		this.teSatelites = true;
		}
	
	//GETTERS
public void getNombre() {
	this.nombre = nombre;
}
public void getDistancia() {
	this.distanciaSol = distanciaSol;
}
public void getOrbita() {
	this.orbitaSol = orbitaSol;
}
public void getSatelite() {
	this.teSatelites = teSatelites;
}
 	//SETTERS
public String setNombre(String nombre) {
	return nombre;
}
public int setDistancia(int distanciaSol) {
	return distanciaSol;
}
public int setOrbita(int orbitaSol) {
	return orbitaSol;
}
public boolean setSatelites(boolean teSatelites) {
	return teSatelites;
}
public String muestra() {
	return "El planeta te un radi de: " + radio + " i gira a una velocitat de " + rotacion + " la seva massa es de: " + masa + " i una temperatura de: " + temperatura + " tenint una gravetat de: " + gravedad + " i te una distancia del sol de: " + this.distanciaSol + "i una orbita al rededor seu de: " + this.orbitaSol + " ademes de que " + this.teSatelites + " te satelites orbitant"; 
}
}
