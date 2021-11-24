package examensEncapsulacio;
import java.util.ArrayList;
import java.util.Iterator;

public class ControladorExamens {

	public static void main(String[] args) {
		
		Examen examen1 = new Examen("Matematiques" , "2nB" , new Hora(10,42),new Dia(10,8,2000));
		Examen examen2 = new Examen("Catala" , "2nB" , new Hora(20,42),new Dia(20,8,2000));
		Examen examen3 = new Examen("Castella" , "2nB" , new Hora(30,42),new Dia(30,8,2000));
		Examen examen4 = new Examen("Ingles" , "2nB" , new Hora(40,42),new Dia(40,8,2000));
		Examen examen5 = new Examen("Tecnologia" , "2nB" , new Hora(50,42),new Dia(50,8,2000));
		
		Examen vector[] = new Examen[5];
		
		ArrayList<Examen> Llista = new ArrayList<>();
		
		vector[0] = examen1;
		vector[1] = examen2;
		vector[2] = examen3;
		vector[3] = examen4;
		vector[4] = examen5;
	
		Llista.add(examen1);
		Llista.add(examen2);
		Llista.add(examen3);
		Llista.add(examen4);
		Llista.add(examen5);
		
		for(Examen x : vector){
			System.out.println(x.dia.toString());
			System.out.println(x.hora.toString());
			System.out.println(x.Assignatura.toString());
			System.out.println(x.Aula.toString());
			System.out.println("");
		}
		
		
		Iterator x = Llista.iterator();
		
		while(x.hasNext()) {
			System.out.println(x.next());
		}
		
	}
}
