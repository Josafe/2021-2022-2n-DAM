package UF4JordiEx1;

import java.lang.invoke.MethodHandles.Lookup;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		InetAddress[] addresses = new InetAddress[6];
		InetAddress[] addresses2 = new InetAddress[6];
		
		Scanner llegir = new Scanner(System.in);
		String entrada = "";
		
		InetAddress usuari = null;

		byte[] ipaddress = new byte[] { 12, 58, 20, 20 };
		
		try {
			usuari = InetAddress.getByName(entrada);
			//usuari = InetAddress.getByAddress(entrada);
			
			ipaddress = usuari.getAddress();
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			while(true) {
				
				System.out.println("Introdueix adreça IP");
				entrada = llegir.nextLine();
				
				if(entrada.matches("([0-9]+.)+")) {
					System.out.println("Es un numero");
					usuari.getAddress();
				}
				else if(entrada.equals("exit") && entrada.equals("quit")) {
					System.out.println("Has finalitzat el programa.");
					System.exit(0);
				}
				else {
					System.out.println("Es un digit");
					usuari.getHostAddress();
				}
			}
	}
}
