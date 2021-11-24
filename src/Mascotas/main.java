package Mascotas;
import java.util.ArrayList;

public class main {

	
	public static void main (String[] args) {
		
		Animales Gos = new Perros("Chiguagua" , false , "Poxolo" , 17 , "Saludable" , "22/32/2009");
		Animales Gat = new Gatos ("Persa" , false , "Misha" , 13 , "Saludable" , "23/02/2013");
		Aves Loro = new Loros ("Tailandia" , true , "Pixa" , 12 , "Saludable" , "24/03/2012", "Pico curvado", true);
		Aves Canario = new Canarios ("Croacia" , false , "Picu" , 92 , "Sakydable" , "25/23/1928", "Pico puntiagudo" , true);
	
		
		Gos.hablar();
		Gos.cumpleaños();
		Gos.morir();
		Gos.muestra();
		
		Gat.hablar();
		Gat.cumpleaños();
		Gat.morir();
		Gat.muestra();
		
		Loro.hablar();
		Loro.cumpleaños();
		Loro.morir();
		Loro.muestra();
		
		Canario.volar();
		
		
	}
}
