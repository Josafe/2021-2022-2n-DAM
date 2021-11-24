public class Persona_UD8{

public static void main (String[] args){

Persona Joan = new  Persona();

Joan.nombre = "Joan ";
Joan.apellidos = "Sabater Ferre ";
Joan.dni = 49648910;
Joan.edad = 21;

Persona Jaume = new Persona();

Jaume.nombre = "Jaume ";
Jaume.apellidos = "Miralles ";
Jaume.dni = 49197102;
Jaume.edad = 16;

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
