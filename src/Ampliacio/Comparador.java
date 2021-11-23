package Ampliacio;
import java.util.Comparator;

public abstract class Comparador implements Comparator<Comparador> {
	
	public int Comparator(Treballador t1, Treballador t2) {
		
	
		if(t1.souBrutAnual > t2.souBrutAnual) {
			return -1;
		}
		else if(t1.souBrutAnual > t2.souBrutAnual) {
			return 1;
		}
		else return 0;
	}
}
