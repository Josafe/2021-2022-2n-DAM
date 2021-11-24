package JPanel_JDialog;
import javax.swing.*;

public class ex_JDialog extends JDialog{

	public ex_JDialog() {
	
	setSize(300,200);
	setVisible(true);
	
	JDialog cuadroDialogo = new JDialog(this, false); //Amb true es crea un dialog modal (no pots fer click a la finestra principal de darrere)
	cuadroDialogo.setTitle("_-[StarWars]-_");
	cuadroDialogo.setSize(100,100);
	cuadroDialogo.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
		@Override
		public void run() {
			new ex_JDialog();
		}
		});
	}
}
