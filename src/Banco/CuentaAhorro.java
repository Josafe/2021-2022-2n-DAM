package Banco;

public class CuentaAhorro extends
CuentaBancaria {
private final int SaldoMinimo;

	public CuentaAhorro (String IBAN, int Saldo, int InteresAnual, int SaldoMinimo) {
		super(IBAN, Saldo, InteresAnual);
		this.SaldoMinimo = SaldoMinimo = 50;
	}
	public void calcularInteres() {
		double interes;
		if (SaldoMinimo >= 50)
			interes = InteresAnual * (Saldo/200);
		else {
			interes = InteresAnual * (Saldo/50);
		}
		System.out.println("Interes compte ahorro: " + interes);
	}
}
