package Static_final2;
public class Persona_UD8{

public static void main (String[] args){

Persona Joan = new  Persona("496648910C", "Joan", "Sabater", 18);
Persona Jaume = new Persona("496191919D", "Jaume", "Miralles", 15);



if (Jaume.getedad() < 18)
{
System.out.println(Jaume.getnombre() + Jaume.getapellidos() + "con DNI " + Jaume.getdni() + " es menor d'edat" );
}
else
{
System.out.println(Jaume.getnombre() + Jaume.getapellidos() + "con DNI " + Jaume.getdni() + " es major d'edat" );
}

if (Joan.getedad() >= 18)
{
System.out.println(Joan.getnombre() + Joan.getapellidos() + "con DNI " + Joan.getdni() + " es major d'edat" );
}
else
{
  System.out.println(Joan.getnombre() + Joan.getapellidos() + "con DNI " + Joan.getdni() + " es menor d'edat" );
}

Persona Dani = new  Persona("496648910B", "Daniel", "Xoris", 18);
Persona Jordi = new Persona("496191919V", "Jordi", "Querola", 15);

/*Jordi.setdni("17455213B");*/
Jordi.setnombre("Jordi");
Jordi.setedad(46);
Jordi.setapellidos("Querol");

/*Dani.setdni("17453834B");*/
Dani.setnombre("Daniela");
Dani.setedad(89);
Dani.setapellidos("Maria Antonia");
	
if (Dani.getedad() > 55)
{
System.out.println(Dani.getnombre() + Dani.getapellidos() + "con DNI " + Dani.getdni() + " es d'edad avan�ada" );
}
else
{
System.out.println(Dani.getnombre() + Dani.getapellidos() + "con DNI " + Dani.getdni() + " es d'edad tendra" );
}

if (Jordi.getedad() > 55)
{
System.out.println(Jordi.getnombre() + Jordi.getapellidos() + "con DNI " + Jordi.getdni() + " es d'edad avan�ada" );
}
else
{
  System.out.println(Jordi.getnombre() + Jordi.getapellidos() + "con DNI " + Jordi.getdni() + " es d'edad tendra" );
}
}
}
