package Getter_Setter;
public class Articulo_UD8{
public static void main (String[] args)
{

Articulo coche = new Articulo("Audi" , 12000 , 21, 3);


//coche.getpvp() = coche.getprecio() + coche.getprecio() * 0.21;

System.out.println("El model " + coche.getnombre() + " te un preu de " + coche.getprecio() + "E sense IVA i " + coche.getpvp() + "E amb IVA inclos, ens queden " + coche.getstock() + " unitats en Stock" );

}
}
