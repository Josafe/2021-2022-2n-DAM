package HerenciaEx1;

public class Astros {
	protected int radio;
	protected int rotacion;
	protected int masa;
	protected int temperatura;
	protected int gravedad;
	
	public Astros(int radio, int rotacion, int masa, int temperatura, int gravedad) {
		this.radio = radio;
		this.rotacion = rotacion;
		this.masa = masa;
		this.temperatura = temperatura;
		this.gravedad = gravedad;
	}
	//GETTERS
	public void getRadio() {
		this.radio = radio;
	}
	public void getRotacion() {
		this.rotacion = rotacion;
	}
	public void getMasa() {
		this.masa = masa;
	}
	public void getTemperatura() {
		this.temperatura = temperatura;
	}
	public void getGravedad() {
		this.gravedad = gravedad;
	}
	
	//SETTERS
	public int setRadio(int radio) {
		return radio;
	}
	public int setRotacion(int rotacion) {
		return rotacion;
	}
	public int setMasa(int masa) {
		return masa;
	}
	public int setTemperatura(int temperatura) {
		return temperatura;
	}
	public int setGravedad(int gravedad) {
		return gravedad;
	}
}
