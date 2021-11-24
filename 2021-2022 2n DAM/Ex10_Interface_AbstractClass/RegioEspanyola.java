package Ex10_Interface_AbstractClass;

public class RegioEspanyola extends Regio{

	public RegioEspanyola(String n) {
		super(n);
		this.nomRegio = n;
	}

	public String formata(int dia, int mes, int any) {
		return ("Dia" + dia + "mes" + mes + "any" + any);
	}

	public String mostrar() {
		return "Regio Espanyola: ";
	}
}
