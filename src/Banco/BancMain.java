package Banco;
import java.util.Scanner;
import java.util.ArrayList;

public class BancMain {


	public static void main(String[] args) {
		
		CuentaBancaria cuenta1 = new CuentaCorriente("NNA342", 50, 0);
		CuentaBancaria cuenta2 = new CuentaAhorro("EUW341", 50, 0, 50);
		
		ArrayList<CuentaBancaria> LlistaComptes = new ArrayList<>();
		
		LlistaComptes.add(cuenta1);
		LlistaComptes.add(cuenta2);
		
		//Consultar
		cuenta1.Consulta();
		cuenta2.Consulta();
		
		//Ingressar
		cuenta1.Ingressar();
		cuenta2.Ingressar();
		
		//Retirada
		cuenta1.Retirar();
		cuenta2.Retirar();
		
		//Traspas
		cuenta1.Traspas(500, cuenta2);
		cuenta1.toString();
		cuenta2.toString();
		
		cuenta1.calcularInteres();
		cuenta2.calcularInteres();
		
		
		
		Scanner llegir = new Scanner(System.in);
		
		/*int menu = 0;
		System.out.println("Menu del banc:");
		System.out.println("\n1 Atributs \n2 Ingressar \n3 Retirar \n4 Traspas");
		menu = llegir.nextInt();
		
		switch(menu) {
		
		case 1:
			//Atributs
			break;
			
		case 2:
			//Ingressar
			break;
		
		case 3:
			//Retirar
			break;
			
		case 4:
			//Traspassar
			
		}*/
	}
}
