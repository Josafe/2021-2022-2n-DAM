package POO.Constructors;
public class Persona_UD8{

public static void main (String[] args){

Persona Joan = new  Persona(496648910, "Joan", "Sabater", 18);


Persona Jaume = new Persona(496191919, "Jaume", "Miralles", 15);



if (Jaume.edad < 18)
{
System.out.println(Jaume.nombre + Jaume.apellidos + "con DNI " + Jaume.dni + " es menor d'edat" );
}
else
{
System.out.println(Jaume.nombre + Jaume.apellidos + "con DNI " + Jaume.dni + " es major d'edat" );
}

if (Joan.edad >= 18)
{
System.out.println(Joan.nombre + Joan.apellidos + "con DNI " + Joan.dni + " es major d'edat" );
}
else
{
  System.out.println(Joan.nombre + Joan.apellidos + "con DNI " + Joan.dni + " es menor d'edat" );
}
}
}
