package Agenda;

public class programaAgenda {

	public static void main(String[] args) {
		
		contacto t1 = new ContactoEmpresa("Jose Anton" , "988977966", "Anton.com");
		contacto t2 = new ContactoEmpresa("Manue Albal" , "911900922", "Empresa.com");
		contacto t3 = new ContactoEmpresa("Federico Garcia" , "966955944", "FedericoFerreteres.com");
		
		contacto t4 = new ContactoPersona("Manel Climent" , "88324921", "22/01/2000");
		contacto t5 = new ContactoPersona("Jordi Querol" , "24623432", "14/03/2000");
	
		agenda 	LlistaPersones = new agenda();
		
		LlistaPersones.Llista.add(t1);
		LlistaPersones.Llista.add(t2);
		LlistaPersones.Llista.add(t3);
		LlistaPersones.Llista.add(t4);
		LlistaPersones.Llista.add(t5);
	
		//METODO IMPRIMIR
		LlistaPersones.imprimir();
		
		//METODO EXISTE CONTACTE
		LlistaPersones.existeC(new ContactoEmpresa ("Jose Anton", "2349324932", "Anton.com"));
		
		//METODO BORRAR CONTACTE
		LlistaPersones.borrarC(new ContactoEmpresa ("Jose Anton", "22349324932", "Anton.com"));
		
		//METODO BUSCAR CONTACTE
		LlistaPersones.buscarC(t1); 
	
		//METODO AÑADIR CONTACTO
		LlistaPersones.añadirC(new ContactoPersona ("Manolito Gafotas", "22349324932","22/01/1980"));
		
		LlistaPersones.imprimir();
		
		
	}
}

