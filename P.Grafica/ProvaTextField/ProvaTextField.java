package ProvaTextField;
import java.awt.EventQueue;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class ProvaTextField extends JFrame {

	
	private Component boto1;


	public ProvaTextField() {
		
		
		//Marco
		setSize(600,450);
		setTitle("Enquesta");
		setLocation(400,200);
				
				
		//Etiquetes de text
		JLabel etiqueta = new JLabel();
		etiqueta.setText("Nom");
		JTextField txtNom = new JTextField(10);
		
		JLabel etiqueta2 = new JLabel();
		etiqueta2.setText("Cognoms");
		JTextField txtCognom = new JTextField(20);
		
		//Boton
		JButton boto1 = new JButton("Prem");
		boto1.setBounds(40, 70, 90, 20);
		boto1.setText("Ets major de 18 anys?");
		JTextField MajorMenor = new JTextField(20);
	
		//Caselles amb 1 o mes opcions
		JCheckBox caselles = new JCheckBox();
		caselles.setText("Futbol");
		caselles.setText("Basquet");
		caselles.setText("Natacion");
		caselles.setText("Hockey");
		
		//Caselles unica opcio
		JRadioButton casellesUniques = new JRadioButton();
		casellesUniques.setText("Si");
		casellesUniques.setText("No");
		
		//Llista d'elements
		
		JComboBox llista = new JComboBox();
		llista.addItem("Si");
		llista.addItem("No");
		llista.addItem("Hola");
		llista.addItem("Adeu");
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		
		//Container on almacenem els components atomics
		Container contenidor = getContentPane();
		
		panel.add(etiqueta);
		panel.add(txtNom);
		panel.add(etiqueta2);
		panel.add(txtCognom);
		panel.add(boto1);
		panel.add(casellesUniques);
		panel.add(caselles);
		panel.add(llista);
		
		contenidor.add(panel);
		
		setVisible(true);
		
		boto1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			//Declarem els events que permet el actionPerformed
				JButton boto = new JButton();
				JList llista = new JList();
				JMenuItem menu = new JMenuItem();
				JTextField foco = new JTextField();
				JOptionPane.showMessageDialog(boto1, "Has premut el boto!");
			}});
		
		//Quan prenem una tecla amb el KeyListener pot realitzar els seguents events:
		/*ComboBoxEditor.addKeyListener(new KeyListener() {
		public void keyTyped(KeyEvent e) {
			if (Character.isDigit(e.getKeyChar())) {
				e.consume();
			}
			
		}
		public void keyPressed(KeyEvent e) {
			
		}
		public void keyReleased(KeyEvent e) {
			
		}});*/
		
		
	}
	
	//Els events que permet el FocusListener es quan un component perd o guanya el foco
	public void focusGained(FocusEvent e) {
		
	}
	public void focusLost(FocusEvent e) {
		
	}
	
	//Els events que permet el MouseListener
	public void mouseClicked(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	}
	public void mousePressed(MouseEvent e) {
	
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new ProvaTextField();
				
			}
		});
	}
}
