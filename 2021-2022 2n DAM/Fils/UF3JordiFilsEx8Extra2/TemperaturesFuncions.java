package UF3JordiFilsEx8Extra2;

import java.util.ArrayList;

public class TemperaturesFuncions {

	ArrayList<Integer> llistaTemp = new ArrayList<>();
	ArrayList<Integer> tempMax = new ArrayList<Integer>();
	
	int rangMin = 0;
	int rangMax = 10;
	
	int numTemp = 100;
	
	public void AfegirTemp() {
		
		for(int i = 0; i < numTemp; i ++) {
			int temp = (int)(Math.random()*56+0);
			temp = temp - 10;
			llistaTemp.add(temp);
			System.out.println(llistaTemp);
		}
	}
	
	public void CalcularTemp() {
		
		for(int i = 0; i < 10; i++) {
			if(llistaTemp.get(i) < llistaTemp.get(i+1)) {
				tempMax.add(llistaTemp.get(i+1));
			}
			else {
				tempMax.add(llistaTemp.get(i));
			}
			
		}
		System.out.println(tempMax);
	}
}
