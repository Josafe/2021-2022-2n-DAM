package TendaArticles;
import java.util.Scanner;

public class GestioTenda {

	public static void main(String[]args) {

		Scanner llegir = new Scanner(System.in);
	
		Article Tenda[] = new Article[3];
		
		for (int i = 0; i < Tenda.length; i++) {
			Tenda[i] = new Article("Libre", "Descripcion", 0.0, 0.0, 0);
		}
		
		int menu = 0;
		int contador = 0;
		String compara = "";
		
	
		
		while (contador < 1) {
			
			System.out.println("Menu del Magatzem: \n 1: Llistat \n 2: Alta \n 3: Baixa \n 4: Modificació \n 5: Entrada de mercancía \n 6: Sortida de mercancía \n 7: Sortir del magatzem");
			menu = llegir.nextInt();
			
			for (int i = 0; i < 1; i++) {
				if (menu > 7) {
					
					System.out.println("No es reconeix aquesta entrada de numero degut a que es superior");
					contador++;
				
				}
				else if (menu <= 0) {
					System.out.println("No es reconeix aquesta entrada de numero degut a que es inferior");
					contador++;
				}
				else {
					
				}
				}
			switch (menu) {
			case 1: //Llistat
				System.out.println("Has seleccionat el llistat de l'objecte");
			
				for (int i = 0; i < Tenda.length; i++) {
					System.out.println("L'article " + i + " amb el codi: (" + Tenda[i].getCodi() + ") I descripcio - " + Tenda[i].getDescripcio() + " ha tingut un preu de compra de - " + Tenda[i].getCompra() + " i es ven a un preu de - " + Tenda[i].getVenta() + " amb un Stock disponible de - " + Tenda[i].getStock());
					Tenda[i].Llistar();
					}
				
				break;
			case 2: //Alta (Insertar objecte)
				System.out.println("Has seleccionat afegir objecte");
	
				for (int i = 0; i < Tenda.length; i++) {
					
					if (Tenda[i].getCodi().equals("Libre")) {
						
					System.out.println("Introdueix un codi de l' " + "Obj [" + i + "]");
					Tenda[i].setCodi(llegir.nextLine()); //EL SETTER ES PER A ASSIGNAR EL VALOR	
					
					System.out.println("Introdueix la descripcio de l'article: ");
					Tenda[i].setdescripcio(llegir.nextLine());
					
					System.out.println("Introdueix el preu de Compra: ");
					Tenda[i].setCompra(llegir.nextDouble());
					
					System.out.println("Introdueix el preu de venta: ");
					Tenda[i].setVenta(llegir.nextDouble());
					
					System.out.println("Introdueix el Stock disponible: ");
					Tenda[i].setStock(llegir.nextInt());
				}
					else {
						
					}	
				}
				break;
					
			case 3: //Baixa (Borrar objecte)
				
							
				for (int i = 0; i < Tenda.length; i++)
				{
					System.out.println("Introdueix el nº de l'objecte que vols eliminar");
					Tenda[i].setCodi(llegir.nextLine());
				
					if (Tenda[i].getCodi() != "Libre")
					{
					System.out.println("El codi de l'objecte [" + i + "] s'ha canviat pel predefinit (Libre)");
					Tenda[i].setCodi("Libre");
					}
					else {
						
					}
				}
					break;
			case 4: //Modificar valors
				
				System.out.println("Introdueix el codi d'article");
					compara = llegir.nextLine();
					
					for (int i = 0; i < 2; i++) {
						if (Tenda[i].getCodi().equals(compara)) {
						 //SI EL CODI ES IGUAL AL PREDEFINIT SE LI PODRAN MODIFICAR ELS ATRIBUTS
							System.out.println("Introdueix un nou codi de l'article " + i);
							Tenda[i].setCodi(llegir.nextLine()); //EL SETTER ES PER A ASSIGNAR EL VALOR
						
							System.out.println("Introdueix la descripcio de l'article: ");
							Tenda[i].setdescripcio(llegir.nextLine());
							
							System.out.println("Introdueix el preu de Compra: ");
							Tenda[i].setCompra(llegir.nextDouble());
					
							System.out.println("Introdueix el preu de venta: ");
							Tenda[i].setVenta(llegir.nextDouble());
					
							System.out.println("Introdueix el Stock disponible: ");
							Tenda[i].setStock(llegir.nextInt());
						}
					else {
						System.out.println("L'article nº " + i + " no es pot modificar degut a que ja no esta el seu valor per defecte");
					}
					}
				
					break;
			case 5: //Modificar entrada stock (augment)
				System.out.println("Has seleccionat la entrada d'Stock");
				System.out.println("Introdueix el codi de l'article al que li has de reduir el STOCK");
				compara = llegir.nextLine();
				
				for (int i = 0; i < Tenda.length; i++) {
					
					if (Tenda[i].getCodi() != (compara))
					{
						System.out.println("Introdueix el nº de Stock actualitzat");
						Tenda[i].setStock(llegir.nextInt());
					}
				}
				
					break;
			case 6: //Modificar sortida stock (disminuicio)
				
				System.out.println("Has seleccionat la sortida d'Stock");
				System.out.println("Introdueix el codi de l'article al que li has de reduir el STOCK");
				compara = llegir.nextLine();
				
				for (int i = 0; i < Tenda.length; i++) {
					if (Tenda[i].getCodi() != (compara))
						{
						System.out.println("Introdueix el nº de Stock actualitzat");
						Tenda[i].setStock(llegir.nextInt());
						}
				}
					break;
			case 7: //Sortir
				System.out.println("Has sortit del magatzem");
				contador++;
				break;
			}
		}
	}
	
}
