package CasFinal;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.color.*;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

/* https://www.youtube.com/watch?v=8xADywhIxks&ab_channel=DavidHackroDavidHackro */
public class MiniMegaman extends JFrame {

	private Timer timer;
	
	
	private Panel p; //Panel punto de vista
	private Panel g; //Panel geoStelar

	private JButton geoStelarB = new JButton("Click");
	private JButton soniaStrummB;
	private JButton train;
	private JButton telescope;
	private JButton sculture;
	private JLabel missatge;
	
	public MiniMegaman() {
		this.p = p;
		this.setBounds(0,0,900,700);
		this.setTitle("Megaman");
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	/*	EventoDeTeclado tecla = new EventoDeTeclado();
		addKeyListener(tecla);*/
		p = new Panel();
		
		Container contentpane = getContentPane();
		
		contentpane.add(p);
		//contentpane.add(geoStelarB);
		
		geoStelarB.setBounds(90,550,45,60);
		
		
		
	
		
		
		
		
		
		geoStelarB.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(geoStelarB.isSelected()) {
				missatge.setText("Protagonista i personatge que portes");
				}
			}
			
		});
	}
	
	public static void main(String[] args) {
		MiniMegaman puntoVista = new MiniMegaman();
		//MiniMegaman geoStelar = new MiniMegaman();
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/** El primer que farem serà ficar una imatge de fondo en un frame de java
	 * 
	 * @author Josafe
	 *
	 */
	/*public class FondoSwing implements Border {
		//Indiquem la imatge que volem que es redimensione
		private BufferedImage puntoVista = null;
		private JFrame fondoPunto = new JFrame();
		
		//Constructor
		public FondoSwing(BufferedImage read) {
			fondoPunto.setVisible(true);
			fondoPunto.setSize(600,500);
		}
		
		//Getter
		private JPanel getContentPane() {
			return null;
		}
		
		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			
		}
		
		@Override
		public Insets getBorderInsets(Component c) {
			return new Insets(0,0,0,0);
		}
		
		public boolean isBorderOpaque() {
			return true;
		}
		
		
	}

	public class fondoPunto extends JFrame {
		
		public fondoPunto() {
		
			try {
				FondoSwing fondo = new FondoSwing(ImageIO.read(new File("C:\\Users\\Josafe\\Desktop\\Vistapointmmkb.png")));
				JPanel panel = (JPanel) this.getContentPane();
				panel.setBorder(fondo);
				this.add(fondo, BorderLayout.CENTER);
				this.pack();
			}catch(Exception x) {
				
			}
		}

		private void add(FondoSwing fondo, String center) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
			
			public void run() {
				new MiniMegaman();
			}
		});
		
		
	}*/

