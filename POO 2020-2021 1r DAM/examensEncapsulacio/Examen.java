package examensEncapsulacio;
public class Examen {

	public String Assignatura;
	public String Aula;
	public Hora hora;
	public Dia dia;
	
	public Examen(String Assignatura, String Aula, Hora hora, Dia dia) {
		this.Assignatura = Assignatura;
		this.Aula = Aula;
		this.hora = hora;
		this.dia = dia;
	}
	
	public void getAssignatura() {
		this.Assignatura = Assignatura;
	}
	public void getAula() {
		this.Aula = Aula;
	}
	public void getHora() {
		this.hora = hora;
	}
	public void getDia() {
		this.dia = dia;
	}
	
	//SETTERS
	public String setAssignatura(String Assignatura) {
		return Assignatura;
	}
	public String setAula(String Aula) {
		return Aula;
	}
	public Examen setHora(Examen hora) {
		return hora;
	}
	public Examen setDia(Examen dia) {
		return dia;
	}
	
	public String toString() {
		return "Examen de " + this.Assignatura + ", es realitzara a l'aula" + this.Aula;
	}
}
