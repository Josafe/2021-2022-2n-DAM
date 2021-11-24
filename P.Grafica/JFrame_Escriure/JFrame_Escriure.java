package JFrame_Escriure;
import javax.swing.*;
import java.awt.*;

public class JFrame_Escriure {

	
	public static void main(String[] args) {
		
		MarcoConTexto marco = new MarcoConTexto();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConTexto extends JFrame {
	
	public MarcoConTexto() {
		setSize(600,450);
		setVisible(true);
		setTitle("Hola");
		setLocation(400,200);
		
	}
}
