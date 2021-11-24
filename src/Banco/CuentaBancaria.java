package Banco;
import java.util.Scanner;
import java.util.ArrayList;

public abstract class CuentaBancaria {
Scanner llegir = new Scanner(System.in);
	
	protected String IBAN;
	protected double Saldo;
	protected double cantidad;
	protected final double InteresAnual;

public CuentaBancaria(String IBAN,double Saldo, int InteresAnual) {
	this.IBAN = IBAN;
	this.Saldo = Saldo;
	this.InteresAnual = InteresAnual = 2;
}

public String getIBAN() {
	return IBAN;
}

public double getSaldo() {
	return Saldo;
}

public void setIBAN(String IBAN) {
	this.IBAN = IBAN;
}
public void setSaldo(double Saldo) {
	this.Saldo = Saldo;
}


public abstract void calcularInteres();


public void Consulta() {
	
	System.out.println(IBAN);
	System.out.println(Saldo);
	
}
private void añadir(double Saldo) {
	
	this.Saldo = this.Saldo + cantidad;
}

public void Ingressar() {

	System.out.println("Introdueix la quantitat a ingressar");
	cantidad = llegir.nextDouble();
	
	if (cantidad < 0) {
		System.err.println("Error, no pots ingresar una xifra negativa");
	}
	else {
	Saldo = Saldo + cantidad;
	System.out.println("El teu saldo actual amb l'ingres es: " + Saldo);
	}
}

public void Retirar() {

	System.out.println("Introdueix la quantitat a retirar");
	cantidad = llegir.nextDouble();
	
	if (cantidad < 0) {
		System.err.println("Error, no pots retirar una xifra negativa");
	}
	else 
	{
		Saldo = Saldo - cantidad;
		System.out.println("El teu saldo actual amb la retirada es: " + Saldo);
	}
}
public void Traspas(double cantidad, CuentaBancaria c1) {
	
	System.out.println("Introdueix la xifra a transferir");
	cantidad = llegir.nextDouble();
	
	if (this.cantidad < 0) {
		System.err.println("Error, no pots transferir una xifra negativa");
	}
	else {
		this.cantidad = Saldo - this.cantidad;
		c1.cantidad = Saldo + c1.cantidad;
		System.out.println("El teu saldo actual amb el traspas es: " + c1.Saldo);
	}
}
public String toString() { //Datos cuenta
	return "IBAN" + IBAN + " \n Saldo" + Saldo;
}

}