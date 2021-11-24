package Funciones;
public class Media{
public static double Media(int vector[]) {
	
	int x=0;	
	for(int i=0;i<vector.length;i++) 
		x=x+vector[i];
	x=x/vector.length;
	return x;
}
}
