package Ampliacio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Treballador<T> implements Comparable<Treballador>{

	String nom = "";
	int edat = 0;
	String carrec = "Director General | Cap d'oficina | Cap de Projecte | Analista | Programador";
	String oficina = "Madrid | Valencia";
	int anysExp = 0;
	int souMensual = 0;
	int numPagues = 12 | 14;
	int souBrutAnual = 0;
	
	public Treballador(String n, int e, String c, String o, int a, int s, int p) {
		this.nom = n;
		this.edat = e;
		this.carrec = c;
		this.oficina = o;
		this.anysExp = a;
		this.souMensual = s;
		this.numPagues = p;
	}
	public String mostrar() {
		return "Nom: " + nom + " - Carrec: " + carrec + " - Anys: " + anysExp + " " + souBrutAnual + " €";
	}
	public int souBrutAnual() {
		return souMensual * numPagues;
		
	}
	@Override
	public int compareTo(Treballador o) {
		if(this.carrec.equals("Director")) {
			return 1;
		}
		else if(carrec.equals("Director")) {
			return -1;
		}
		else if(!o.carrec.equals("Director") && carrec.equals("Oficinista") && oficina.equals("Madrid")) {
			return -1;
		}
		else if(anysExp > o.anysExp && carrec.equals("CapProjecte") || souBrutAnual > o.souBrutAnual && carrec.equals("CapProjecte")) {
			return -1;
		}
		else if(anysExp > o.anysExp) {
			return 1;
		}
		else return 0;
	}
	public static void main(String[] args) {
		
		List<Treballador> llista = new ArrayList<>();
		
		Treballador Dire = new Treballador("Agusti", 28, "Director", "Madrid", 25, 2500, 14);
		Treballador Oficinista1 = new Treballador("Laurentis", 28, "Oficinista", "Valencia", 12, 1800, 14);
		Treballador Oficinista2 = new Treballador("Eustaqui", 20, "Oficinista", "Madrid", 11, 1900, 12);
		Treballador Programador1 = new Treballador("Lamigo", 20, "Programador", "Valencia", 5, 1500, 12);
		Treballador Programador2 = new Treballador("Emporio", 20, "Programador", "Valencia", 7, 1200, 12);
		Treballador CapProjecte1 = new Treballador("Amado", 20, "CapProjecte", "Valencia", 5, 1500, 12);
		Treballador CapProjecte2= new Treballador("Lore", 20, "CapProjecte", "Madrid", 11, 1900, 12);
		Treballador Analista1 = new Treballador("Enriquet", 20, "Analista", "Valencia", 5, 1500, 12);
		Treballador Analista2 = new Treballador("Laipe", 20, "Analista", "Madrid", 11, 1900, 12);
		
		
		
		llista.add(Dire);
		llista.add(Oficinista1);
		llista.add(Oficinista2);
		llista.add(Programador1);
		llista.add(Programador2);
		llista.add(CapProjecte1);
		llista.add(CapProjecte2);
		llista.add(Analista1);
		llista.add(Analista2);
	
		Collections.sort(llista);
		for(Treballador t : llista) {
			System.out.println(t.nom + "-" + t.edat + "-" + t.anysExp);
		}
		
		List<Treballador> llista2 = new ArrayList<Treballador>();
		List<Treballador> llistaComp = llista2.stream().collect(Collectors.toList());

		llistaComp.add(Dire);
		llistaComp.add(Oficinista1);
		llistaComp.add(Oficinista2);
		llistaComp.add(Programador1);
		llistaComp.add(Programador2);
		llistaComp.add(CapProjecte1);
		llistaComp.add(CapProjecte2);
		llistaComp.add(Analista1);
		llistaComp.add(Analista2);
		
		System.out.println("-------------------------");
		for(Treballador t : llistaComp) {
			System.out.println(t.nom + "-" + t.edat + "-" + t.anysExp);
		}
	}
	
}
