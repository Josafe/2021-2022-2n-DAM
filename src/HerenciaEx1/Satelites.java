package HerenciaEx1;

public class Satelites extends
Astros {

	private int distanciaPlaneta;
	private int OrbitaPlaneta;
	private boolean PlanetaPerte;
	
	public Satelites(int radio, int rotacion, int masa, int temperatura, int gravedad,int distanciaPlaneta, int OrbitaPlaneta, boolean PlanetaPerte) {
		super(radio, rotacion, masa, temperatura, gravedad);
		this.distanciaPlaneta = distanciaPlaneta;
		this.OrbitaPlaneta = OrbitaPlaneta;
		this.PlanetaPerte = PlanetaPerte;
	}
	
	//GETTERS
	public void getDistancia() {
		this.distanciaPlaneta = distanciaPlaneta;
	}
	
	public void getOrbita() {
		this.OrbitaPlaneta = OrbitaPlaneta;
	}
	
	public void getPlaneta() {
		this.PlanetaPerte = PlanetaPerte;
	}
	
	//SETTERS
	public int setDistancia(int distanciaPlaneta) {
		return distanciaPlaneta;
	}
	public int setOrbita(int OrbitaPlaneta) {
		return OrbitaPlaneta;
	}
	public boolean setPlaneta(boolean PlanetaPerte) {
		return PlanetaPerte;
	}
	public String muestra() {
		return "El planeta te un radi de: " + radio + " i gira a una velocitat de " + rotacion + " la seva massa es de: " + masa + " i una temperatura de: " + temperatura + " tenint una gravetat de: " + gravedad + " i te una distancia del sol de: " + this.distanciaPlaneta + "i una orbita al rededor seu de: " + this.OrbitaPlaneta + "ademes de que " + this.PlanetaPerte + " te satelites orbitant"; 
	}
}
