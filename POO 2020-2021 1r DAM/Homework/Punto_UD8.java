package Homework;
public class Punto_UD8{

public static void main(String[] args){

  int vector[][];
  vector = new int[11][11];

  Punto coordenada1 = new Punto(); /*[5][0]*/
  coordenada1.posiciox = 5;
  coordenada1.posicioy = 0;

  Punto coordenada2 = new Punto(); /*[10][10]*/
  coordenada2.posiciox = 10;
  coordenada2.posicioy = 10;

  Punto coordenada3 = new Punto(); /*[-3][7]*/
  coordenada3.posiciox = -3;
  coordenada3.posicioy = 7;


System.out.println("Coordenadas del punto p1 (" + coordenada1.posiciox + "," + coordenada1.posicioy + ")");
System.out.println("Coordenadas del punto p1 (" + coordenada2.posiciox + "," + coordenada2.posicioy + ")");
System.out.println("Coordenadas del punto p1 (" + coordenada3.posiciox + "," + coordenada3.posicioy + ")");


Punto coordenada4 = new Punto(); /*[5][0]*/
coordenada4.posiciox /= 5;
coordenada4.posicioy = 0;

Punto coordenada5 = new Punto(); /*[10][10]*/
coordenada5.posiciox += 10;
coordenada5.posicioy *= 10;

Punto coordenada6 = new Punto(); /*[-3][7]*/
coordenada6.posiciox -= -3;
coordenada6.posicioy %= 7;


System.out.println("Coordenadas del punto p1 (" + coordenada4.posiciox + "," + coordenada4.posicioy + ")");
System.out.println("Coordenadas del punto p1 (" + coordenada5.posiciox + "," + coordenada5.posicioy + ")");
System.out.println("Coordenadas del punto p1 (" + coordenada6.posiciox + "," + coordenada6.posicioy + ")");

}
}
