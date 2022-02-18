package UF3JordiFilsEx7Extra;

public class main {

	public static void main(String[] args) {
		
		Parking parking = new Parking(10); //Num de places 
		
		for (int i = 0; i < 40; i++) {
			new Cotxe("Cotxe matricula " + i, parking);
		}
		
	}
}
