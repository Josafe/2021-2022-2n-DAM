package Ex10_Interface_AbstractClass;

public class RegioISO extends Regio {

	public RegioISO(String n) {
		super(n);
		this.nomRegio = n;
	}
	
	public String formata(int dia, int mes, int any) {
		return ("Any" + any + "mes" + mes + "dia" + dia);
	}
	public String mostrar() {
		return "Regio ISO: ";
	}
}

