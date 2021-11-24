package Banco;

public class CuentaCorriente extends 
CuentaBancaria {
	
	public CuentaCorriente(String IBAN, double Saldo, int InteresAnual){
	super(IBAN, Saldo, InteresAnual);
	}
	
	public void calcularInteres(){
		double interes;
		
		interes = InteresAnual * (Saldo/100);
		System.out.println("Interes compte corrent: " + interes);
	}
	
}
