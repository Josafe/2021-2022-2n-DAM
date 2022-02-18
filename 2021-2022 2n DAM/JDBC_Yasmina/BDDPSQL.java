package JDBC_Yasmina;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDDPSQL {
	
	public static String url="jdbc:postgresql://localhost:5432/lineas";
	//Credenciales de la BD
	public static String user = "postgres";
	public static  String pwd = "123456789";
	
	public static void main(String[] args) {
	//Donde se localiza la BD
	
	//creaTablas();
	//insertaDatos();
	seleccionarDatos();
	
	}
	
	public static void creaTablas() {
		try {	
			// Establece la conexión con la BD
			Connection conexion=
			DriverManager.getConnection(url,user,pwd);
			try {
			Statement s = conexion.createStatement();
			
			s.execute( "CREATE DOMAIN Dom_DNI as text check ( value ~ '^[0-9]{8}[A-Z]$')");
			
			s.executeUpdate( "CREATE TABLE Bonos"
					+ "( ID_bono smallint not null primary key, "
					+ " Tipo varchar(20) not null, " + " Duracion varchar(20) not null)");
			
			s.executeUpdate( "CREATE TABLE Usuarios"
					+ "( DNI Dom_DNI not null primary key,"
					+ " Nombre varchar(20), " + "F_Nacimiento varchar(20), " + " Ciudad varchar(20)) ");
					
			s.executeUpdate( "CREATE TABLE Bonos_Activos" + " (ID_bono smallint not null References Bonos(ID_bono), " 
					+ "DNI_Usuario Dom_DNI not null References Usuarios(DNI),"
					+ " ID_linea smallint not null References Lineas(ID_linea),"
					+ " Caducidad varchar(20), primary key(ID_bono, DNI_Usuario, ID_linea))");
		
			/* Creacio en pgadmin4 no se com ficar la triple primary key
			 * CREATE TABLE Bonos_Activos (DNI_Usuario Dom_DNI not null References Usuarios(DNI),
					ID_linea smallint not null References Lineas(ID_linea),
					ID_bono smallint not null References Bonos(ID_bono),
					Caducidad varchar(20), ADD CONSTRAINT "ID_PKEY" PRIMARY KEY (ID_bono, DNI_Usuario, ID_linea); */
			
			
			s.executeUpdate( "DELETE FROM Bonos_Activos WHERE DNI_Usuario IN (SELECT DNI_Usuario FROM Usuarios WHERE F_Nacimiento < current_date - interval '18 year')");
			
			/*s.executeUpdate( "CREATE TABLE Usuarios"
					+ " DNI Dom_DNI not null primary key,"
					+ " Nombre varchar(20)" + "F_Nacimiento varchar(20) " + " Ciudad varchar(20) ");
					
			s.executeUpdate( "CREATE TABLE Bonos_Activos" + "DNI_Usuario Dom_DNI not null References Usuarios(DNI)"
					+ " ID_linea smallint not null References Lineas(ID_linea)"
					+ " ID_bono smallint not null References Bonos(ID_bono)"
					+ " Caducidad varchar(20) primary key(ID_bono, DNI_Usuario, ID_linea)");*/
			
			
			
			
			} catch(SQLException e) {
			System.err.println( e.getMessage() );
			}
			
			// Cierra la conexión con la BD
			conexion.close();
			
			} catch (Exception e){
			System.err.println( e.getMessage() );
			}
	}
	
	public static void insertaDatos() {
		 
		try {
			// Establece la conexión con la BD
			Connection conexion=
			DriverManager.getConnection(url,user,pwd);
			try {
			Statement s = conexion.createStatement();
			int nFil = s.executeUpdate //Insertar a la BDD
				("INSERT INTO Bonos"
			+ " (ID_bono, Tipo, Duracion) VALUES "
			+ " (1, 'todo incluido', 1), "
			+ " (2, 'todo incluido', 7),"
			+ " (3, 'todo incluido', 30),"
			+ " (4, '50%', 1),"
			+ " (5, '50%', 7),"
			+ " (6, '50%', 30);");
			
			System.out.println(nFil + " filas insertadas en Bonos.");
			
			int nFil2 = s.executeUpdate //Insertar a la BDD
					("INSERT INTO Usuarios"
				+ " (DNI, Nombre, F_Nacimiento, Ciudad) VALUES "
				+ "('11222333A', 'Patricia Perez', '10/12/1990', 'Burriana'),"
				+ "('22333444B', 'Lia Lorca', '31/01/2002', 'Castellon'),"
				+ "('33444555C', 'Nela Nunez', '28/03/2008', 'Almazora'),"
				+ "('44555666D', 'Jose Jim´enez', '15/12/2001', 'Nules'),"
				+ "('55666777E', 'Antonio Aranda', '09/09/1989', 'Mascarell')");
			
			System.out.println(nFil2 + " filas insertadas en Usuarios."); 
			
			int nFil3 = s.executeUpdate //Insertar a la BDD
					("INSERT INTO Bonos_Activos "
					+ "(ID_Bono, DNI_Usuario, ID_Linea, Caducidad) VALUES "
					+ "(2, '11222333A', 11, '22/02/22'),"
					+ "(5, '11222333A', 31, '15/03/22'),"
					+ "(1, '22333444B', 41, '16/02/22'),"
					+ "(4, '33444555C', 21, '16/02/22'),"
					+ "(6, '44555666D', 51, '15/03/22'),"
					+ "(3, '44555666D', 21, '01/03/22')");

			System.out.println(nFil3 + " filas insertadas en Bonos_Activos.");
			
			} catch(SQLException e) {
			System.err.println( e.getMessage() );
			}
			// Cierra la conexión con la BD
			conexion.close();
			} catch (Exception e){
			System.err.println( e.getMessage() );
			}
	}
	
	public static void seleccionarDatos() {
		try {
			// Establece la conexión con la BD
			Connection conexion = DriverManager.getConnection(url,user,pwd);
			try {
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery("SELECT Nombre FROM Conductores WHERE ID_conductor IN (SELECT ID_conductor FROM Lineas WHERE ID_linea IN (SELECT ID_linea FROM Bonos_Activos))");
			ResultSet rs2 = s.executeQuery("SELECT Nombre, F_Nacimiento FROM Usuarios WHERE DNI IN (SELECT DNI FROM Bonos_Activos WHERE Caducidad > ('18/02/22'))");
			ResultSet rs3 = s.executeQuery("SELECT DNI_Usuario FROM Bonos_Activos WHERE Caducidad > date_trunk");
			
			while(rs.next())
			{
			System.out.println( " Nombre: "+ rs.getString("Nombre"));
			}
			while(rs2.next())
			{
			System.out.println( "ID:" + rs2.getInt(1)
			+ " Nombre: "+ rs2.getString("Nombre"));
			}
			while(rs3.next())
			
			System.out.println( "ID:" + rs3.getInt(1)
			+ " Nombre: "+ rs3.getString("Nombre"));
			
			} catch(SQLException e) {
			System.err.println( e.getMessage());
			}
			
			// Cierra la conexión con la BD
			conexion.close();
			} catch (Exception e){
			System.err.println( e.getMessage());
			}

	}
}
