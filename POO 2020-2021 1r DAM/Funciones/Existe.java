package Funciones;
public class Existe{
public static boolean Existe(int vector[], int x) {
	
	boolean exist=false;
		for(int i=0;i<vector.length;i++) {
			if(vector[i]==x)
				exist=true;
	    }
	return exist;
}
 }