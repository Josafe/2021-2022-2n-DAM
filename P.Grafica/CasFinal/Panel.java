package CasFinal;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JComponent;

/* https://www.youtube.com/watch?v=8xADywhIxks&ab_channel=DavidHackroDavidHackro */
/* Imatges retallades mitjançant el traçat manual per pixels, retallant les imatges i exportant-les per separat.
 *  inclouria animacio si no hagues de retallar 8 imatges per a cada direcció */
/*Sprites emprats:
 * http://sprites-inc.co.uk/sprite.php?local=Starforce/Geo/SF3/
 * http://sprites-inc.co.uk/sprite.php?local=Starforce/Omega/SF2/
 * http://sprites-inc.co.uk/sprite.php?local=/Starforce/Solo/
 * http://sprites-inc.co.uk/sprite.php?local=/Starforce/SF3/People/Major/
 * http://sprites-inc.co.uk/sprite.php?local=Starforce/Sonia/SF3/
 */
public class Panel extends JPanel implements KeyListener{
	//Imatges
	private Image puntoVista;
	private Image geoStelar;
	private Image soniaStrumm;
	private Image omegaXis;
	private Image solo;
	private Image laPace;
	private Image Leo;
	private Image Draco;
	private Image Pegaso;

	//Moviment
	private String direccion = "RIGHT";
	
	private int widthPoint = 10;
	private int heightPoint = 10;
	private long frequency = 50;
	private long last = 0;
	//Tipus d'imatge i delay de l'animació
	private int currentImage = 0;
	private int animationDelay = 0;
	
	//Animation timer
	private Timer animationTimer;
	
	//Direccions de moviment
	private int velX;
	private int velY;
	private int velD;
	private int velB;
	
	
	/*
	static int columna = 3;
	static int fila = 195;
	static int numero = 1;
	*/

	
	public Panel() 
	{
		addKeyListener(this);
		vistaPoint();
		initComponents();
		geoStelar();
		soniaStrumm();
		omegaXis();
		laPace();
		Leo();
		Draco();
		Pegaso();
		
	}
	public void dreta () {
		velX = 8;
	}
	
	public void esquerra() {
		velY = -8;
	}

	public void dalt() {
		velD = 8;
	}
	
	public void baix() {
		velB = -8;
	}
	
	
	
	
	@Override
		public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());

				
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					

				if(direccion != "LEFT") {
					direccion = "RIGHT";
						//geoStelar.x = geoStelar.x + widthPoint;
				}
				
				
				else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					
				if(direccion != "RIGHT") {
					direccion = "LEFT";
				}
				
				}
				else if(e.getKeyCode() == KeyEvent.VK_UP) {
				
					if(direccion != "DOWN") {
						direccion = "UP";
					}
				
				}
				else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					if(direccion != "UP") {
						direccion = "DOWN";
				}
				}
				
				}
			}
	
	/*public void actualizar() {
		geoStelar.repaint;
	}*/
	
	

	private void initComponents() {
		
	}

	private void vistaPoint() {
		puntoVista = new ImageIcon("C:\\Users\\Josafe\\Desktop\\CasFinal\\Vistapointmmkb.png").getImage();
	}
	
	public void geoStelar() {
		
		geoStelar = new ImageIcon("GeoStelarSprites1x1.png").getImage();
		
	}
	public void soniaStrumm() {
		soniaStrumm = new ImageIcon("C:\\Users\\Josafe\\Desktop\\CasFinal\\SoniaStrummSprite1x1.png").getImage();
	}
	
	private void omegaXis() {
		omegaXis = new ImageIcon("C:\\Users\\Josafe\\Desktop\\CasFinal\\OmegaXisSprite1x1.png").getImage();
	}
	
	private void laPace() {
		laPace = new ImageIcon("C:\\Users\\Josafe\\Desktop\\CasFinal\\laplaceSprite1x1.png").getImage();
	}
	
	private void Leo() {
		Leo = new ImageIcon("C:\\Users\\Josafe\\Desktop\\CasFinal\\LeoSprite1x1.png").getImage();
	}
	
	private void Draco() {
		Draco = new ImageIcon("C:\\Users\\Josafe\\Desktop\\CasFinal\\DracoSprite1x1.png").getImage();
	}
	
	private void Pegaso() {
		Pegaso = new ImageIcon("C:\\Users\\Josafe\\Desktop\\CasFinal\\PegasoSprite1x1.png").getImage();
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		//g2d.drawImage(geoStelar, geoStelar.getX(), geoStelar.getY(), this);
		
		if (puntoVista != null) {
			g.drawImage(puntoVista, 0, 0, getWidth(), getHeight(), null);
		}
		
		if (geoStelar != null) {
			g.drawImage(geoStelar, 90, 550, 45, 60, null);
		}
		
		if (soniaStrumm != null) {
			g.drawImage(soniaStrumm, 600, 200, 30, 45, this);
		}
		
		if (omegaXis != null) {
			g.drawImage(omegaXis, 730, 350, 40, 45, this);
		}
		
		if (laPace != null) {
			g.drawImage(laPace, 700, 280, 40, 45, this);
		}
		
		if (Leo != null) {
			g.drawImage(Leo, 270, 10, 140, 135, this);
		}
		
		if (Draco != null ) {
			g.drawImage(Draco, 180, 25, 140, 135, this);
		}
		
		if (Pegaso != null) {
			g.drawImage(Pegaso, 140, 50, 110, 135, this);
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}




