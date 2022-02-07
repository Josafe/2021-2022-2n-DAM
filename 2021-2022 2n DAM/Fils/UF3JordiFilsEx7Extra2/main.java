package UF3JordiFilsEx7Extra2;

public class main {

	public static void main(String[] args) {
		
		Parking parking = new Parking(10);
		
		for (int i = 1; i < 40; i++) {
			new Cotxe("Cotxe matricula " + i, parking);
		}
	}
}
