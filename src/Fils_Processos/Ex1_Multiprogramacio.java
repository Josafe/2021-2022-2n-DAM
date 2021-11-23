package Fils_Processos;
import java.util.concurrent.Semaphore;

public class Ex1_Multiprogramacio {

	Semaphore semafor;
	int moneda = 0;
	int sf = 1;
	
	//El primer ordre d'execuci� ser�a enviar la moneda
	//El segon ordre d'execuci� ser�a recollir les monedes i posar el comptador a 0
	//El tercer ordre d'execuci� el qual ser�a erroni ser� introduir una moneda a la vegada que es fa el conteig d'aquestes
	//El quart ordre d'execuci� ser�a introduir una moneda a la vegada que es reinicia el contador per el qual comptaria com a comptador +1 sent aquesta sobreescrita
	void enviaNumeroMonedes() {
		while(true) {
			enviarOficinaCentral(moneda);
			moneda = 0;
		}
	}
	
	void comptadorMonedes() {
		while (entradaMoneda==true) {
			moneda = moneda + 1;
		}
	}
	
	void enviarOficinaCentral(int moneda) {
		enviaNumeroMonedes();
		moneda = this.moneda;
	}
}
