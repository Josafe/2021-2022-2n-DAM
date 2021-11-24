package Empresa_Empleados;
import java.util.ArrayList;
public class EmpresasMain {

	public static void main(String[] args) {
		
		Empleados empleado1 = new Empleados("Joan", "32432424", 1500.00, 21, 400100400, "AvCons");
		
		Empresas.añadirEmpleado("Joan", "32432424", 1500.00, 21, 400100400, "AvCons");
		
	}
}
