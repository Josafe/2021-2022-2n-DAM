package POO.Constructors;
public class Articulo_UD8{
public static void main (String[] args)
{

Articulo coche = new Articulo("Audi" , 12000 , 21, 3);

Articulo misfit_tee = new Articulo("Kirby Tee", "0phi model", 10 , 30);

coche.pvp = coche.precio + coche.precio * 0.21;

System.out.println("El model " + coche.nombre + " te un preu de " + coche.precio + "E sense IVA i " + coche.pvp + "E amb IVA inclos, ens queden " + coche.stock + " unitats en Stock" );

//Sobrecarrega de constructors aplicada
System.out.println("L'article s'anomena " + misfit_tee.nom + ", i es el model: " + misfit_tee.model +  ", amb un IVA afegit de: " + misfit_tee.IVA + ", i un preu total de: " + misfit_tee.preu + " €");


}
}
