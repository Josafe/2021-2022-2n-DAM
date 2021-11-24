package HerenciaEx1;
import java.util.ArrayList;
import java.util.Scanner;
public class DiosAstros {
	
	public static void main(String[] args) {
		Scanner llegir = new Scanner(System.in);
		//Planetas planetes[] = new Planetas[5];
		
		Planetas Terra = new Planetas("Terra",50000, 300, 800000, 16, 10, 6000000, 365);
		Planetas Marte = new Planetas("Marte",30000, 150, 200000, 3, 6, 800000, 582);
		Planetas Jupiter = new Planetas("Jupiter",900000, 1106, 98100000, -40, 230, 10482311, 1080);
		Planetas Saturno = new Planetas("Saturno",750000, 1016, 90100000, -80, 270, 20482311, 955);
		Planetas Pluton = new Planetas("Pluton",300, 71, 5000, -250, 1, 910482311, 18291);
		
		Satelites Europa = new Satelites(4000, 200, 10000 ,12 , 1, 500, 82, true);
		Satelites Lluna = new Satelites(3000, 150, 8000, 9, 1, 600, 30, true);
		
		ArrayList<Planetas> LlistaPlanetes = new ArrayList<>();
		
		LlistaPlanetes.add(Terra);
		LlistaPlanetes.add(Marte);
		LlistaPlanetes.add(Jupiter);
		LlistaPlanetes.add(Saturno);
		LlistaPlanetes.add(Pluton);
		LlistaPlanetes.add(new Planetas ("Neptuno",223432, 234, 61111, 15, 12, 1500000, 895));
		
		Terra.Añadir(Lluna);
		Jupiter.Añadir(Europa);
		
		for (Planetas x : LlistaPlanetes) {
			System.out.println(x.muestra());
		}
		
		int menu = 0;
		System.out.println("Menu Astros \n 1 Llistat \n 2 Caracteristiques");
		menu = llegir.nextInt();
		switch (menu) {
		
		case 1:
			System.out.println("Llistat Astros");
			for (Planetas i : LlistaPlanetes) {
			i.getNombre();
			}
			break;
		
		
		case 2:
			System.out.println("Descripcio Planetes");
			for (Planetas i : LlistaPlanetes) {
				i.toString();
				}
			break;
		}
		/*planetes[0] = Terra;
		planetes[1] = Marte;
		planetes[2] = Jupiter;
		planetes[3] = Saturno;
		planetes[4] = Pluton;*/

	}
}
