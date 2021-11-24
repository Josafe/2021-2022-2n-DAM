package POO.Constructors;
public class Punto_UD8{

public static void main(String[] args){

  Punto coordenada1 = new Punto(2,7); /*[5][0]*/


  Punto coordenada2 = new Punto(9,5); /*[10][10]*/


  Punto coordenada3 = new Punto(4,2); /*[-3][7]*/
 

System.out.println("Coordenadas del punto p1 (" + coordenada1.posiciox + "," + coordenada1.posicioy + ")");
System.out.println("Coordenadas del punto p1 (" + coordenada2.posiciox + "," + coordenada2.posicioy + ")");
System.out.println("Coordenadas del punto p1 (" + coordenada3.posiciox + "," + coordenada3.posicioy + ")");


Punto coordenada4 = new Punto(5,0); /*[5][0]*/

Punto coordenada5 = new Punto(10,10); /*[10][10]*/

Punto coordenada6 = new Punto(10,10); /*[-3][7]*/


System.out.println("Coordenadas del punto p1 (" + coordenada4.posiciox + "," + coordenada4.posicioy + ")");
System.out.println("Coordenadas del punto p1 (" + coordenada5.posiciox + "," + coordenada5.posicioy + ")");
System.out.println("Coordenadas del punto p1 (" + coordenada6.posiciox + "," + coordenada6.posicioy + ")");

}
}
