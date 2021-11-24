package JPanel_JDialog;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ShowMessageDialog_ShowInputDialog extends JFrame {

	public static void main(String[] args) {
	
		boolean correcte = false;
		String user = JOptionPane.showInputDialog(null, "Usuari");
		String password = JOptionPane.showInputDialog(null, "Contrasenya");
		String pregunta1 = JOptionPane.showInputDialog(null, "Quants planetes te el sistema solar");
		String pregunta2 = JOptionPane.showInputDialog(null, "Quin personatge de Star Wars va ser el mestre de Darth Vader?");
		
		while(correcte = false) {
		if (user.equals("Joan") && password.equals("1234")) {
			JOptionPane.showMessageDialog(null, "T'has logueat correctament");
			correcte = true;
			
			if (pregunta1.equals("8")) {
				JOptionPane.showMessageDialog(null, "Correcte! Seguent pregunta.");
				correcte = true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Llastima, has fallat!");
				correcte = false;
			}
			if(pregunta2.equals("Obi Wan Kenobi")) {
				JOptionPane.showMessageDialog(null, "Correcte! Ets un autèntic fan de Star Wars!");
				correcte = true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Llastima, casi ho tenies!");
				correcte = false;
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "Error, has introduit les credencials de manera incorrecta");
			correcte = false;
		}
		}
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ShowMessageDialog_ShowInputDialog();
			}
		});
	}
	
	public ShowMessageDialog_ShowInputDialog() { //Prova JPanel
		setTitle("Hola");
		setSize(300, 200);
		
		//Creacio de un contenidor
		Container contentpane = getContentPane();
		
		//Creacio d'un objecte tipus JPanel
		JPanel panel = new JPanel();
		
		//Afegir el panel en l'objecte contenidor del frame
		contentpane.add(panel);
		
		//Li fiquem un color de fons
		panel.setBackground(Color.BLUE);
		
		//Afegim un boto
		panel.add(new JButton("Fes click"));
		setVisible(true);		
	}
}
