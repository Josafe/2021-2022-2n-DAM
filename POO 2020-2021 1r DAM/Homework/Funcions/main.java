package Funcions;
import java.util.Scanner;
public class main{


public static void main(String[] args){

  Scanner llegir = new Scanner(System.in);
  int tamany = 0;
  int x = 0;

  System.out.println("Introdueix el tamany del vector");
  tamany = llegir.nextInt();
  System.out.println("Introdueix un numero");
  x = llegir.nextInt();

  int vector[];
  vector = new int[tamany];

  int menu = 0;
  boolean sortir = false;

  for (int i = 0; i < vector.length; i++)
  {
    System.out.println(vector[i]);
  }

  while (sortir = false)
  {
    System.out.println("1.- Rellenar el vector");
	  System.out.println("2.- Calcular Media");
	  System.out.println("3.- Comprobar si existe");
	  System.out.println("4.- Mayores o iguales: ");
	  System.out.println("5.- Salir: ");
	  menu = llegir.nextInt();

  switch (menu){
  case 1:

  rellenar.omplir(vector, x);
  System.out.println(rellenar.omplir(vector, x));

  break;

  case 2:

    double valor = 0;
    valor = mitja(vector);
    System.out.println("La mitja es: " + valor);
  break;

  case 3:

  System.out.println("El numero: " + x + "es" + existe);
  existe.igual(vector, x);
  break;

  case 4:
  int valor = 0;
  valor = gran(vector,x);
  System.out.println("Hi han un total de " + valor + "numeros mes grans que " + x);
  break;

  case 5:

  sortir = true;

}
}
}
}
