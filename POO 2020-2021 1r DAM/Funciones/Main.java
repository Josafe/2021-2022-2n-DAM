package Funciones;
import java.util.Scanner;
public class Main {
	  public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);
	        
	      
	        int x,tamany;
	        int opcion;
	        boolean continuar=true;
	        
	        System.out.println("introduce la dimensi�n del vector: ");
	        tamany=entrada.nextInt();
	        System.out.println("introduce un n�mero: ");
	        x=entrada.nextInt();
	       
	        int v[] = new int[tamany];
	        
	        
	       

	        while (continuar) {
	        	
	            System.out.println();
	            System.out.println(" ********* MENU PRINCIPAL *********");
	            System.out.println("1.- Rellenar el vector");
	            System.out.println("2.- Calcular Media");
	            System.out.println("3.- Comprobar si existe");
	            System.out.println("4.- Mayores o iguales: ");
	            System.out.println("5.- Salir: ");
	            opcion = entrada.nextInt();
	            
	            switch (opcion) {
	                
	                case 1:
	                RellenaVector.rellenaVector(v, tamany);
	                	// System.out.println(v[]=rellenaVector(v, tamany));
	                    rellenaVector(v);
	                    break;
	                    
	                case 2:
	                    double valor=0;
	                    valor=Media.Media(v);
	                    System.out.println("La media es: " + valor);
	                    break;
	                    
	                case 3:
	                    boolean exist=Existe.Existe(v, x);
	                    System.out.println("el numero: " + x + " es " + exist);
	                    
	                    break;
	                    
	                case 4:   
	                	int numMayores=Mayores.Mayores(v, x);
	                	System.out.println("Hay "+numMayores+" numeros mayores que: " + x);
	                	break;   
	                	
	                case 5:   
	                	continuar=false;
	                	break;
	               
	                default:
	                    System.out.println("Opci�n no valida");
	                    break;
	            }
	        }
	  }

	private static void rellenaVector(int[] v) {
		// TODO Auto-generated method stub
		
	}
}


