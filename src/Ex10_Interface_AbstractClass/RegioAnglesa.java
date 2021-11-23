package Ex10_Interface_AbstractClass;

public class RegioAnglesa extends Regio{

	public RegioAnglesa(String n) {
		super(n);
		this.nomRegio = n;
	}
	
	public String formata(int dia, int mes, int any) {
		return ("Mes" + mes + "dia" +  dia + "any" + any);
	}

	public String mostrar() {
		return "Regio Anglesa: ";
	}
}
