package GatoSimple;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	
		Gato gat1 = new Gato("Taronja" , "Tigre" , 8 , "Macho" , 7.4);
		Gato gat2 = new Gato("Roig" , "Pantera" , 9 , "Macho" , 4.7);
		Gato gat3 = new Gato("Blanc" , "Siberia" , 12 , "Hembra" , 7.1);
		Gato gat4 = new Gato("Groc" , "Lleo" , 11 , "Hembra" , 8.4);
		Gato gat5 = new Gato("Gris" , "Guepard" , 6 , "Macho" , 5.7);
		
		
		gat1.maulla();
		gat1.Descripcio();
		gat1.baralla(gat2);
		gat1.ronronea();
		
		
		Gato manada[] = new Gato[4];
		manada[0] = gat1;
		manada[1] = gat2;
		manada[2] = gat3;
		manada[3] = gat4;
		manada[4] = gat5;
	
		for (int i = 0; i < manada.length; i++) {
		
		}
	}
}
