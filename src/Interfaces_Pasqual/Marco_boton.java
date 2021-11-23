package Interfaces_Pasqual;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marco_boton extends JFrame{

	public static void main(String[] args) {
		
		Marco marco = new Marco();
		JButton boto = new JButton("Ok");
		JPanel panel = new JPanel();
		
		boto.setLocation(275,150);
		boto.setVisible(true);
		boto.setSize(60,30);
		
		//Afegim panel al marc
		marco.add(panel);
		
		//Afegim boto al panel
		panel.add(boto);
		
		panel.setLayout(null);
	}
}
class Marco extends JFrame {

	public Marco() {
		
	setSize(600,400);
	setVisible(true);
	setTitle("Interfaces Pasqual - Sabater Ferré Joan");
	setLocation(600,400);
	}
}