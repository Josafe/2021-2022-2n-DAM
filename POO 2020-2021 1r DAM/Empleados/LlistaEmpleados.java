package Empleados;
import java.util.ArrayList;
import java.util.Scanner;

public class LlistaEmpleados {


	public static void main(String[] args) {
		
		Oficial Joan = new Oficial("Joan");
		Operario Moises = new Operario("Moises");
		Directivo Dani = new Directivo("Dani");
		Tecnico Isma = new Tecnico("Isma");
		
		System.out.println(Joan.toString());
		System.out.println(Isma.toString());
		System.out.println(Moises.toString());
		System.out.println(Dani.toString());
		System.out.println("");
		
		System.out.println("ARRAYLIST");
		ArrayList<Empleado> LlistaTreballadors = new ArrayList<>();
		
		LlistaTreballadors.add(Moises);
		LlistaTreballadors.add(Isma);
		LlistaTreballadors.add(Dani);
		LlistaTreballadors.add(Joan);
		
		for(Empleado x : LlistaTreballadors) {
			System.out.println(x.toString());
		}
	
		
	
	
	
	}
}
