package ProvesSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class ProvaDibuix {

	public static void main(String[] args) {
		
		marcAmbDibuix marco = new marcAmbDibuix();
		
		marco.setVisible(true);
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	}
	
	class marcAmbDibuix extends JFrame {
		public marcAmbDibuix() {
			setTitle("Prova dibuix");
			setSize(600,600);
			
			laminaAmbFigura lamina = new laminaAmbFigura(); //Crearem una lamina del metodo de laminaAmbFigura
			add(lamina); // i l'afegirem
		}
	}
	
	class laminaAmbFigura extends JPanel {
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawRect(50,50,400,400); //Aixi dibuixem una figura
			g.draw3DRect(50, 50, 200, 200, getFocusTraversalKeysEnabled());
			
			Rectangle2D cuadrat = new Rectangle.Double(100,100,200,200);
		}
	}
