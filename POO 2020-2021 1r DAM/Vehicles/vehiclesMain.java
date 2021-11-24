package Vehicles;
import java.util.ArrayList;

public class vehiclesMain {

	public static void main(String[] args) {
		
		Vehicles Audi = new Coche(true, 4, "4891-AB", "Audi A5");
		Vehicles Kawasaki = new Moto("Roig" , 2 , "4918-BG" , "Ninja");
		Vehicles SubmarinoMilitar = new Submarino(5800.0, 200, "7281-NA" , "USA");
		Vehicles BarcoNaval = new Barco(true, 250, "56-USA" , "7291-NA" );
		Vehicles HelicopterUCI = new Helicopter(4 , 4, "581-UCI" , "Helicoptero de transporte de pacientes");
		Vehicles Avio = new Avio("8 hores", 256, "4810-VUELING", "Avion comercial");
		
		Audi.imprimir();
		Kawasaki.imprimir();
		SubmarinoMilitar.imprimir();
		BarcoNaval.imprimir();
		HelicopterUCI.imprimir();
		Avio.imprimir();
		
		Audi.Validar();
		Kawasaki.Validar();
		SubmarinoMilitar.Validar();
		BarcoNaval.Validar();
		HelicopterUCI.Validar();
		Avio.Validar();
		
		ArrayList<Vehicles> Llista = new ArrayList<>();
		
		Llista.add(HelicopterUCI);
		Llista.add(Avio);
		Llista.add(BarcoNaval);
		Llista.add(SubmarinoMilitar);
		Llista.add(Kawasaki);
		Llista.add(Audi);
		
		System.out.println("");
		System.out.println("ARRAYLIST"); 
		System.out.println("");
		
		for (Vehicles x : Llista) {
			System.out.println(x.matricula);
		}
		
		
	}
}
