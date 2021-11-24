package Ex10_Interface_AbstractClass;

public abstract class Regio implements IData{

	protected String nomRegio;
	
	public Regio(String n) {
		this.nomRegio = n;
	}
	
	public static void main(String[] args) {
		RegioEspanyola RE = new RegioEspanyola("Valencia");
		RegioAnglesa RA = new RegioAnglesa("Birmingham");
		RegioISO RI = new RegioISO("Antonio");
		
		String RegioEspanyola = RE.formata(22, 8, 2000);
		String RegioAnglesa = RA.formata(22, 8, 2000);
		String RegioISO = RI.formata(22, 8, 2000);
		
		System.out.println(RegioEspanyola);
		System.out.println(RegioAnglesa);
		System.out.println(RegioISO);
	}
}
