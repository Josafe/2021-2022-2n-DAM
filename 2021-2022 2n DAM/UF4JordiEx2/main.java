package UF4JordiEx2;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner llegir = new Scanner(System.in);
		
		URL url = null;
		String entrada = "";
		
		boolean acabar = true;
		
		while (acabar = true) {
			System.out.println("Introduiu URLS reals o quit & exit");
			entrada = llegir.nextLine();

		if(entrada.equals("exit") || entrada.equals("quit")) {
			System.out.println("Has finalitzat el programa.");
			System.exit(0);
			acabar = false;
		}
		else {
			
			URLConnection urlC = new URLConnection(url) {
				
				@Override
				public void connect() throws IOException {
				
				}
			};
			
			try {
				
				url = new URL(entrada);
				url.openConnection();
				
				
				url.getProtocol();
				url.getAuthority();
				url.getFile();
				url.getContent();
				url.getUserInfo();
				
				urlC.connect();
		
				
				urlC.getContentLength(); //tamany del contingut
				urlC.getContentType(); //tipo de recurs
				urlC.getContentEncoding();

				urlC.getURL(); // torna l'URL asociada
				urlC.getDate(); // Torna la data en format long des de l'1 de gener de 1970
				urlC.getExpiration();
				urlC.getLastModified();
			
				System.out.println("URL: " + entrada + "  " +  validarURL(entrada) 
				+ " \n Protocol: " + url.getProtocol() + " \n Autoritat " + url.getAuthority() 
				+ " \n Arxiu tipo " + url.getFile() + " \n Contingut " + url.getContent() + " \n Tamany " 
				+ urlC.getContentLength() + " \n Contingut  " + urlC.getContentType() +  " \n Codificacio caracters " + urlC.getContentEncoding() +" \n URL "
				+ urlC.getURL() + " \n Fecha " + urlC.getDate() + " \n Fecha " + urlC.getDate());
			}
			catch(Exception e) {
				System.out.println("rafael es puto");
			}
		} //else
		
		validarURL(entrada);
		
		}
	}
	
	
	public static boolean validarURL(String url) {
		try {
			(new URL(url)).openStream().close();
			return true;
			
		} catch(Exception e) {
			
		}
		return false;
	}
}
