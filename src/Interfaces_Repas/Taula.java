package Interfaces_Repas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Taula {

	public static void main(String[] args)
	{
		ArrayList<FiguraGeo> Figures = new ArrayList<>();
		
		Figures.add(new Cercle(20));
		Figures.add(new Cuadrat(20));
		Figures.add(new Rectangle(60,5));
		
		Collections.sort(Figures);
		
		for(FiguraGeo f : Figures) {
			System.out.println(f.Comparable());
			
		}
	}
}
