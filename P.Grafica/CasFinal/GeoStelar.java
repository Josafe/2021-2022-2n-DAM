package CasFinal;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

/* https://www.youtube.com/watch?v=8xADywhIxks&ab_channel=DavidHackroDavidHackro */
public class GeoStelar extends JPanel{
	
	
	private Image geoStelar;
	
	private Panel g; //Panel geoStelar
	private final int DELAY = 10;
	
	//KeyEvent
	private int dx;
	private int dy;
	private int x = 40;
	private int y = 60;
	private int w;
	private int h;
	
	
	public GeoStelar() 
	{
		geoStelar();
		initComponents();
	}

	private void initComponents() {
		
	}
	
	public void geoStelar() {
		geoStelar = new ImageIcon("C:\\Users\\Josafe\\Desktop\\CasFinal\\GeoStelarSprites1x1.png").getImage();
		
	}


	public void move() {
		
		x += dx;
		y += dy;
		
	}
	
	/*
	public int getX(){
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getWidth() {
		return w;
	}
	
	public int getHeight() {
		return h;
	}
	*/
	public Image getImage() {
		return geoStelar;
	}
	
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT) {
			dx = -2;
		}
		if(key == KeyEvent.VK_RIGHT) {
			dx = 2;
		}
		if(key == KeyEvent.VK_DOWN) {
			dy = 2;
		}
		if(key == KeyEvent.VK_UP) {
			dy = -2;
		}
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		//g2d.drawImage(geoStelar, geoStelar.getX(), geoStelar.getY(), this);
		
		if (geoStelar != null) {
			g.drawImage(geoStelar, 90, 550, 45, 60	, this);
		}
	
	}
	
	
	
	
}
