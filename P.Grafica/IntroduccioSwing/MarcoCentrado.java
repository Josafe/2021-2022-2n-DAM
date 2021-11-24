package IntroduccioSwing;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.*;

public class MarcoCentrado {
	
	public static void main(String[] args) {
		
		Marco marcCentrat = new Marco();
		
		marcCentrat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //S'aplica la funcio JFrame.EXIT_ON_CLOSE per a que es tanque
		marcCentrat.setVisible(true); //El farem visible
	}
}
class Marco extends JFrame{
	
	public Marco() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Dimension pantalla = mipantalla.getScreenSize(); //Almacenem les dades de resolucio de la meva pantalla dintre d'aquesta variable
		
		int alturaPantalla = pantalla.height; //S'almacena l'altura de la pantalla dintre d'aquesta variable
		int ampladaPantalla = pantalla.width; //Aqui almacenem l'amplada
		
		setSize(ampladaPantalla/2,alturaPantalla/2); //Aixi definirem una pantalla amb la mitat de la resolucio de la pantalla actual
		
		setLocation(ampladaPantalla/4,alturaPantalla/4); //Aixi es centrara
		
		setTitle("Marc centrat");

		Image nouIcono=mipantalla.getImage("vovovox.gif"); //Aixi es cambia l'icona que te el marc
		setIconImage(nouIcono); //Aplicarem el canvi d'icono per a que mostre la nova imatge vinculada
	}
}
