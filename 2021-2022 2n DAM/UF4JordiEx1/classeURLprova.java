package UF4JordiEx1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class classeURLprova {

	public static void main(String[] args) {
		
		String direccio = ("https://t1.up.ltmcdn.com/es/posts/0/1/8/historia_resumida_de_moises_2810_600.jpg ");
		
		URL url = null;
		
				
		try {
			
			url = new URL(direccio);
			url.openConnection();
			
			url.getProtocol();
			url.getAuthority();
			url.getFile();
			url.getContent();
		
			System.out.println("La URL que es? " + direccio + "  " +  validarURL(direccio) + " \n Protocol: " + url.getProtocol() + " \n Autoritat " + url.getAuthority() + " \n Arxiu " + url.getFile() + " \n " + url.getContent());
		}
		catch(Exception e) {
			
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
