package Metodesex4;
public class Articulo_UD8{
public static void main (String[] args)
{

Articulo coche = new Articulo("Audi" , 12000 , 21, 3);


double pvp = coche.getprecio() + coche.getprecio() * 0.21;

System.out.println("El model " + coche.getnombre() + " te un preu de " + coche.getprecio() + "E sense IVA i " + pvp + "E amb IVA inclos, ens queden " + coche.getstock() + " unitats en Stock" );

coche.setnombre("Porsche");
coche.setprecio(170000);
coche.setiva(21);
coche.setstock(8);
coche.imprimir();

System.out.println("");

if (coche.vender(10))
{
	System.out.println("10 unitats venudes");
}
else {
	System.out.println("No he arribat a les 10 unitats venudes, es cancela la venta per falta d'stock");
}

if (coche.vender(2)) {
	System.out.println("2 Unitats venudes");
}
else {
	System.out.println("No n'he venut ni 2, es cancela la venta per falta d'stock");
}



}
}
