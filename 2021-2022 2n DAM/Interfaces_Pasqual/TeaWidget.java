package Interfaces_Pasqual;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Graphics;

public class TeaWidget extends JFrame {

	Scanner llegir = new Scanner(System.in);
	private JPanel Panel;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeaWidget frame = new TeaWidget();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public TeaWidget() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
		
	
	
			
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 1000);
		
		JPanel panell = new JPanel();
		panell.setBorder(new EmptyBorder(5, 5, 5, 5));
		panell.setLayout(null); //Aixi agafa el tamany que vulgues
		setContentPane(panell);
		
		//Creem JLabel amb la ruta de la imatge
		JLabel TeaPic = new JLabel(new ImageIcon("C:\\Users\\Josafe\\Desktop\\PGrafica\\Tea.jpg"));
		JLabel TeaPic2 = new JLabel(new ImageIcon("C:\\Users\\Josafe\\Desktop\\PGrafica\\GreenTea.jpg"));
		JLabel TeaPic3 = new JLabel(new ImageIcon("C:\\Users\\Josafe\\Desktop\\PGrafica\\whitetea.jpg"));
		JLabel TeaPic4 = new JLabel(new ImageIcon("C:\\Users\\Josafe\\Desktop\\PGrafica\\YellowTea.jpg"));
		JLabel TeaGif1 = new JLabel(new ImageIcon("C:\\Users\\Josafe\\Desktop\\PGrafica\\giph.gif"));
		JLabel TeaGif2 = new JLabel(new ImageIcon("C:\\Users\\Josafe\\Desktop\\PGrafica\\giphy.gif"));
		//displayPic.setIcon(TeaPic);
		JLabel image = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Interfaces_Pasqual/Tea.jpg")));
		JLabel image2 = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Interfaces_Pasqual/GreenTea.jpg")));
		JLabel image3 = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Interfaces_Pasqual/whitetea.jpg")));
		JLabel image4 = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Interfaces_Pasqual/YellowTea.jpg")));
		JLabel Gif1 = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Interfaces_Pasqual/giph.gif")));
		JLabel Gif2 = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Interfaces_Pasqual/giphy.gif")));
		Graphics2D g2d;
		JLabel TeaPrepare = new JLabel(" | V 0.2 |");
		
		TeaPrepare.setLocation(20,600);
		TeaPrepare.setSize(50,50);
		TeaPrepare.setVisible(true);
		panell.add(TeaPrepare);
		
		panell.add(TeaGif1);
		panell.add(TeaGif2);
		
		panell.add(Gif1);
		panell.add(Gif2);
		
		
		
		TeaGif1.setLocation(200,510);
		TeaGif1.setVisible(true);
		TeaGif1.setSize(400,400);
		
		TeaGif2.setLocation(200,510);
		TeaGif2.setVisible(false);
		TeaGif2.setSize(400,400);
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton botoTe1 = new JRadioButton();
		JRadioButton botoTe2 = new JRadioButton();
		JRadioButton botoTe3 = new JRadioButton();
		JRadioButton botoTe4 = new JRadioButton();
		JRadioButton botoTe5 = new JRadioButton();
		
		group.add(botoTe4);
		group.add(botoTe1);
		group.add(botoTe2);
		group.add(botoTe3);
		group.add(botoTe5);
		
		panell.add(botoTe5);
		botoTe5.setVisible(true);
		botoTe5.setLocation(600,610);
		botoTe5.setText("Personalized Tea");
		botoTe5.setSize(150,20);
		panell.add(botoTe1);
		botoTe1.setLocation(150,20);
		botoTe1.setVisible(true);
		botoTe1.setSize(100,30);
		botoTe1.setText("Red Tea");
		
		panell.add(botoTe2);
		botoTe2.setLocation(550,20);
		botoTe2.setVisible(true);
		botoTe2.setSize(100,30);
		botoTe2.setText("White Tea");
		
		
		panell.add(botoTe3);
		botoTe3.setLocation(150,270);
		botoTe3.setVisible(true);
		botoTe3.setSize(100,30);
		botoTe3.setText("Green Tea");
		
		panell.add(botoTe4);
		botoTe4.setLocation(550,270);
		botoTe4.setVisible(true);
		botoTe4.setSize(100,30);
		botoTe4.setText("Yellow Tea");
		
		
		JButton botoComptador1 = new JButton();
		JButton botoComptador2 = new JButton();
		JButton botoComptador3 = new JButton();
		JButton botoComptador4 = new JButton();
	
		
		botoComptador1.setSize(375,200);
		botoComptador1.setLocation(10,50);
		botoComptador1.setVisible(true);
		botoComptador1.setText("Preparar té roig");
		//Afegim imatge al boto creat anteriorment
	
		//botoComptador1.add(TeaPic);	
		botoComptador1.add(image);
		panell.add(botoComptador1);
		
		botoComptador2.setSize(375,200);
		botoComptador2.setLocation(10,300);
		botoComptador2.setVisible(true);
		botoComptador2.setText("Preparar té blanc");
		
		//botoComptador2.add(TeaPic2);
		botoComptador2.add(image2);
		panell.add(botoComptador2);

		botoComptador3.setSize(350,200);
		botoComptador3.setLocation(425,50);
		botoComptador3.setVisible(true);
		botoComptador3.setText("Preparar té verd");
		
		//botoComptador3.add(TeaPic3);
		botoComptador3.add(image3);
		panell.add(botoComptador3);
		
		botoComptador4.setSize(350,200);
		botoComptador4.setLocation(425,300);
		botoComptador4.setVisible(true);
		botoComptador4.setText("Preparar té groc");
		
		//botoComptador4.add(TeaPic4);
		botoComptador4.add(image4);
		panell.add(botoComptador4);
		
		JButton botoCrono = new JButton();
		panell.add(botoCrono);
		botoCrono.setText("Start");
		botoCrono.setLocation(300,5);
		botoCrono.setVisible(true);
		botoCrono.setSize(200,30);
		
		JLabel crono = new JLabel();
		panell.add(crono);
		crono.setLocation(10,5);
		crono.setSize(140,40);
		crono.setVisible(true);
	
		/*JProgressBar barra = new JProgressBar(180,0);
		Panel.add(barra);
		barra.setVisible(true);
		barra.setLocation(0,600);
		barra.setSize(60,200);*/
		
		FuncioCrono(botoTe1, botoTe2, botoTe3, botoTe4, botoTe5, crono, botoCrono, TeaGif1, TeaGif2);

		/*botoComptador.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						String seg = "60";
						String min = "2";
						
						Timer crono = new Timer();
						crono = Integer.parseInt(seg);
					}
				});
			}

		});
	}*/
	
	/*public void paint (Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		if(TeaImage != null) {
			g.drawImage(TeaImage, 90, 200, 100, 80, this);
		}
	}*/

}
	
	/*public void paint (Graphics g) {
		Rectangle p = g.getClipBounds();
		g.setColor(this.getBackground());
		Object r;
		g.fillRect(r.x, r.y, r.width, r.height);
		g.drawImage();
	}*/

void FuncioCrono (JRadioButton botoTe1, JRadioButton botoTe2, JRadioButton botoTe3, JRadioButton botoTe4, JRadioButton botoTe5, JLabel crono, JButton botoCrono, JLabel TeaGif1, JLabel TeaGif2){

	botoCrono.addActionListener(new ActionListener(){
		
		int sec = 0;
		int min = 0;
		int temps = 1;
	
		Timer crono1 = new Timer(1000, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				
				//HE intentat afegir un audio al final de l'alarma pero hem dona error a l'hora de iniciar aquesta part del programa.
				//AudioInputStream archiuMP3 = new AudioInputStream((TargetDataLine) new File("C:\\Users\\Josafe\\Desktop\\PGrafica\\alarma.mp3").getAbsoluteFile());
				
				String ruta3 = "C:\\Users\\Josafe\\Desktop\\PGrafica\\waterDRIP.wav";
				String ruta2 = "C:\\Users\\Josafe\\Desktop\\PGrafica\\scuba.wav";
				String ruta = "C:\\Users\\Josafe\\Desktop\\PGrafica\\alarma.wav";
				audioAlarma(ruta2);
				sec = sec - temps;
				crono.setText(min + " Minuts " + sec + " Seconds");
				
				if(sec == 0) {
					sec = 5;
					min = min -1; 
				}
				if (min < 0 | sec == 0) {
					try {
						crono.setText("Hi, your tea is already done!");
						TeaGif2.setVisible(true);
						TeaGif1.setVisible(false);
						audioAlarma2(ruta);
						//audioAlarma2(ruta3);
						crono1.wait();
				
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		//TIMERS REDUITS AMB LA NOVA VERSIO
		/*Timer crono2 = new Timer(1000, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				sec = sec - temps;
				crono.setText(min + " Minuts " + sec + " Seconds");
				String ruta2 = "C:\\Users\\Josafe\\Desktop\\PGrafica\\espresso.wav";
				audioAlarma(ruta2);
				
				if(sec == 0) {
					sec = 5;
					min = min -1; 
				}
				if (min < 0) {
					crono1.stop();
					crono.setText("Hi, your tea is already done!");
					TeaGif2.setVisible(true);
					TeaGif1.setVisible(false);
					String ruta = "C:\\Users\\Josafe\\Desktop\\PGrafica\\alarma.wav";
					audioAlarma(ruta);
				}
				
				}
			
		});
		
		Timer crono3 = new Timer(1000, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				
				sec	= sec - temps;
				crono.setText(min + " Minuts " + sec + " Seconds");
				
				String ruta2 = "C:\\Users\\Josafe\\Desktop\\PGrafica\\espresso.wav";
				audioAlarma(ruta2);
				if(sec == 0) {
					sec = 5;
					min = min -1; 
				}
				if (min < 0) {
					crono1.stop();
					crono.setText("Hi, your tea is already done!");
					TeaGif2.setVisible(true);
					TeaGif1.setVisible(false);
					String ruta = "C:\\Users\\Josafe\\Desktop\\PGrafica\\alarma.wav";
					audioAlarma(ruta);
				}
			}
		});
		
		Timer crono4 = new Timer(1000, new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				sec = sec - temps;
				crono.setText(min + " Minuts " + sec + " Seconds");
				String ruta2 = "C:\\Users\\Josafe\\Desktop\\PGrafica\\espresso.wav";
				audioAlarma(ruta2);
				
				if(sec == 0) {
					sec = 5;
					min = min -1; 
				}
				if (min < 0) {
					crono1.stop();
					crono.setText("Hi, your tea is already done!");
					TeaGif2.setVisible(true);
					TeaGif1.setVisible(false);
					String ruta = "C:\\Users\\Josafe\\Desktop\\PGrafica\\alarma.wav";
					audioAlarma(ruta);
				}
			}
		});
		Timer crono5 = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sec = sec - temps;
				crono.setText(min + " Minuts " + sec + " Seconds");
				String ruta2 = "C:\\Users\\Josafe\\Desktop\\PGrafica\\espresso.wav";
				audioAlarma(ruta2);
				
				if(sec == 0) {
					sec = 5;
					min = min -1; 
				}
				if (min < 0) {
					crono1.stop();
					crono.setText("Hi, your tea is already done!");
					TeaGif2.setVisible(true);
					TeaGif1.setVisible(false);
					String ruta = "C:\\Users\\Josafe\\Desktop\\PGrafica\\alarma.wav";
					audioAlarma(ruta);
				}
				
			}
		});*/
		@Override
		public void actionPerformed(ActionEvent e) {
			Scanner llegir = new Scanner(System.in);
			
			//Crono1
			if (botoTe1.isSelected()) {
				sec = 10;
				min = 1;
				crono1.start();
			}
			
			//Crono2
			if (botoTe2.isSelected()) {
				sec = 60;
				min = 2;
				crono1.start();
				crono.setText(crono1 + "Sec");
			}
			
			//Crono3
			if (botoTe3.isSelected()) {
				sec = 60;
				min = 3;
				crono1.start();
				crono.setText(crono1 + "Sec");
			}
			
			//Crono4
			if (botoTe4.isSelected()) {
				sec = 60;
				min = 5;
				crono1.start();
				crono.setText(crono1 + "Sec");}
			
			if (botoTe5.isSelected()){
				String perso;
				perso = JOptionPane.showInputDialog("Which time you want to personalize in seconds?");
				sec = Integer.parseInt(perso);
				
				
				if(sec > 60) {
					sec = sec - 60;
					min = min + 1;
				}
				else if(min > 1) {
					min = 0;
				}
				crono1.start();
			}
		}
	});
	}
	

public void audioAlarma(String ruta) {

	
	try {
		AudioInputStream audio = AudioSystem.getAudioInputStream(new File(ruta));
		
		Clip clip = AudioSystem.getClip();
		
		//Te ready
		
		clip.open(audio);
		
		clip.start();
		
		//Prepare tea
	 } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
		// TODO Auto-generated catch block
		System.out.println("Error en el audio");
	}finally {
		
	}
}

public void audioAlarma2(String ruta2) {
	try {
		AudioInputStream audio2;
		audio2 = AudioSystem.getAudioInputStream(new File(ruta2));
		Clip clip2 = AudioSystem.getClip();
		clip2.open(audio2);
		 clip2.loop(Clip.LOOP_CONTINUOUSLY);
	} catch (UnsupportedAudioFileException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (LineUnavailableException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}


