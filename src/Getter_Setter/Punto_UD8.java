package Getter_Setter;

public class Punto_UD8{

public static void main(String[] args){

  Punto coordenada1 = new Punto(2,7); /*[5][0]*/


  Punto coordenada2 = new Punto(9,5); /*[10][10]*/


  Punto coordenada3 = new Punto(4,2); /*[-3][7]*/
 

System.out.println("Coordenadas del punto p1 (" + coordenada1.getposiciox() + "," + coordenada1.getposicioy() + ")");
System.out.println("Coordenadas del punto p1 (" + coordenada2.getposiciox() + "," + coordenada2.getposicioy() + ")");
System.out.println("Coordenadas del punto p1 (" + coordenada3.getposiciox() + "," + coordenada3.getposicioy() + ")");


Punto coordenada4 = new Punto(5,0); /*[10][10]*/

Punto coordenada5 = new Punto(10,10); /*[10][10]*/

Punto coordenada6 = new Punto(10,10); /*[-3][7]*/

coordenada4.setposiciox(5);
coordenada4.setposicioy(0);

coordenada5.setposiciox(7);
coordenada5.setposicioy(4);

coordenada6.setposiciox(10);
coordenada6.setposicioy(20);
System.out.println("Coordenadas del punto p1 (" + coordenada4.getposiciox() + "," + coordenada4.getposicioy() + ")");
System.out.println("Coordenadas del punto p1 (" + coordenada5.getposiciox() + "," + coordenada5.getposicioy() + ")");
System.out.println("Coordenadas del punto p1 (" + coordenada6.getposiciox() + "," + coordenada6.getposicioy() + ")");

}
}
