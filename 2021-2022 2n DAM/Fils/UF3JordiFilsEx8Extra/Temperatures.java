package UF3JordiFilsEx8Extra;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Temperatures {

		ArrayList<Integer> temperatures = new ArrayList();
		String name = "";
		ArrayList<Integer> temperaturaMax = new ArrayList<Integer>();
		TempMax temp;
		int comprueba;
		
		public void afegirTemperatures() throws InterruptedException {
			
			int graus = (int)(Math.random()*56 + 0);
			graus = graus -10;
			temperatures.add(graus);
		}
		
		public void calcularTemperatures() {
			
			int max = 10;
			int min = 0;
			
			int tempMax = 0;
			
			for(int i = min; i < max; i++) {
				comprueba = temperatures.get(0);
				if(comprueba > temperatures.get(i)) {
					temperaturaMax.add(comprueba);
				}
				else if(temperatures.get(min) < temperatures.get(max)) {
					tempMax = temperatures.get(i);
				}
			}
			System.out.println(Thread.currentThread().getName() +" Temp maxima fil "  + " : " + tempMax + " ºC");
			
			min = min+10;
			max = max+10;
			
		}	
}
