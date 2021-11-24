package Llibres_Revistes;
import java.util.ArrayList;

public class Bibliomain {

	public static void main(String[] args) {
		
		Llibres llibre1 = new Llibres("435A", "Els segadors" , 1714);
		Llibres llibre2 = new Llibres("436B", "El gegant del pi", 1938);
		
		Revistes revista1 = new Revistes("ABI4", "Esports", 2021, 43);
		Revistes revista2 = new Revistes("ANX8", "Temps", 2020, 41);
		
		ArrayList<Publicacio> llistaLlibres = new ArrayList<>();
		
		llistaLlibres.add(llibre1);
		llistaLlibres.add(llibre2);
		llistaLlibres.add(revista1);
		llistaLlibres.add(revista2);
		
		llibre1.prestado();
		llibre1.prestar();
		llibre1.retornar();
		
		llibre2.prestar();
		llibre2.prestado();
		llibre2.retornar();
		
		for (Publicacio x : llistaLlibres) {
			System.out.println(x.imprimir());
		}
	}
}
