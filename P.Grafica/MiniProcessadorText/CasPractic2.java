package MiniProcessadorText;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;


public class CasPractic2 extends JFrame {
	/**
	 * @author Josafe 
	 */
	private JPanel pPrincipal = new JPanel();
	private JTextPane pEscritura = new JTextPane();
	
	private JLabel titol = new JLabel();
	//Menu
	private JMenuBar menu = new JMenuBar();
	private JMenuBar menuF = new JMenuBar();
	
	private JMenu submenuG = new JMenu("Guardar");
	private JMenu submenuO = new JMenu("Obrir / Tancar");
	private JMenu submenuS = new JMenu("Sortir");
	private JMenu submenuI = new JMenu("Informacio");
	
	private JMenu negretaM = new JMenu();
	private JMenu cursivaM = new JMenu();
	private JMenu subrallatM = new JMenu();
	private JMenu colorM = new JMenu();
	
	private JMenuItem Guardar = new JMenuItem("Guardar");
	private JMenuItem Importar = new JMenuItem("Obrir");
	private JMenuItem Exportar = new JMenuItem("Tancar");
	private JMenuItem Info = new JMenuItem("Sobre mi: ");
	
	private JButton negreta = new JButton();
	private JButton cursiva = new JButton();
	private JButton color = new JButton();
	private JButton subrallat = new JButton();
	
	private JComboBox fonts;
	private Font fontsText[] = new Font[3];
	/*
	private Hashmap acciones = areaTexto.getActionMap();
	private Action Copiar = acciones.get(DefaultEditorKit.copyAction);
	private Action Pegar = acciones.get(DefaultEditorKit.pasteAction);
	private Action Cortar = acciones.get(DefaultEditorKit.cutAction);
	*/
	
	//Nuevo, guardar, abrir, cerrar, copiar, cortar, pegar, negreta, cursiva
	
	/**
	 */
	public CasPractic2() {
		
		
		
		//Fonts
		Font lletra = new Font("Font Titol", Font.ITALIC, 20);
		Font lletra1 = new Font("Verdana", Font.BOLD, 11);
		Font lletra2 = new Font("Times new Roman", Font.ROMAN_BASELINE, 11);
		Font lletra3 = new Font("Arial", Font.HANGING_BASELINE, 11);
		
		fontsText[0] = lletra;
		fontsText[1] = lletra1;
		fontsText[2] = lletra2;
		fontsText[3] = lletra3;
		
		fonts = new JComboBox(fontsText);
		
		
		Font negretaF = new Font("Verdana", Font.BOLD, 11);
		Font cursivaF = new Font("Verdana", Font.ITALIC, 11);
		Font subrallatF = new Font("Verdana", Font.PLAIN, 11);

		
		fonts.setMaximumSize(new Dimension(180,30));;
		
		negreta.setSize(20,20);
		negreta.setFont(negretaF);
		negreta.setText("N");
		
		cursiva.setSize(50,50);
		cursiva.setFont(cursivaF);
		cursiva.setText("C");
		
		color.setSize(50,50);
		color.setText("Color");

		subrallat.setSize(50,50);
		subrallat.setFont(subrallatF);
		subrallat.setText("S");
		
		setSize(900,600);
		setTitle("Processador text");
		setLocation(400,200);
		setVisible(true);
		
		pPrincipal.setBackground(new Color(255,255,255));
		pPrincipal.setLayout(null);
		setContentPane(pPrincipal);
		
		titol.setText("Microprocessador de text");
		titol.setBounds(50,200,200,200);
		
		/*Copiar pegar cortar
		Copiar.putValue(Action.NAME, "Copiar");
		Pegar.putValue(Action.NAME, "Pegar");
		Cortar.putValue(Action.NAME, "Cortar");
		*/
		
		//Menu
		
		setJMenuBar(menu);
		
		menu.add(submenuG);
		menu.add(submenuO);
		menu.add(submenuI);	
		menu.add(fonts);
		menu.add(menuF);
		
		menuF.add(negreta);
		menuF.add(cursiva);
		menuF.add(subrallat);
		menuF.add(color);
		
		submenuG.add(Guardar);
		submenuO.add(Importar);
		submenuO.add(Exportar);
		submenuI.add(Info);
		
		pEscritura.setSize(600,600);
		pEscritura.setLayout(null);
		
		pPrincipal.add(pEscritura);
		pPrincipal.add(titol);
		
		//Fonts de text
		//Guardar
		Guardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run() {
						javax.swing.JFileChooser ruta = new javax.swing.JFileChooser();
						
						String rutaG ="";
						
						try {
							if(ruta.showSaveDialog(null) == ruta.APPROVE_OPTION) {
								rutaG = ruta.getSelectedFile().getAbsolutePath();
							}
							
						}catch(Exception x) {
							
							x.printStackTrace();
						}
						
					}
					
				});
			} 
		});
		
		//Obrir
		Importar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable(){

					@Override
					public void run() {
						javax.swing.JFileChooser ruta = new javax.swing.JFileChooser();
						String rutaO = "";
						
						try {
						if(ruta.showOpenDialog(null) == ruta.APPROVE_OPTION) {
							rutaO = ruta.getSelectedFile().getAbsolutePath();
						}
						}
						catch(Exception x) {
							
						}
					}
					
				});
			}
		});
		
		//Tancar
		Exportar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable(){

					@Override
					public void run() {
				
					
					try {
						System.exit(EXIT_ON_CLOSE);
					}catch(Exception x) {
						
					}
						
					}
					
				});
			}
		});
		
		color.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
						if (e.getSource() == color) {					
						pEscritura.setBackground(getForeground());
							}
				}
		
		});
	
	
		Info.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == Info) {
					pEscritura.setText("Creador: Joan"
							+ "\nVersio del processador: 1.0");
				}
			}
		});
		
	//Tipus negrita++  //------------------------------------------------------------
		
		negreta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
					 if (e.getSource()== negreta) {
				    		pEscritura.setFont(negretaF);
				           }
						}
		});
		
		cursiva.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
					 if (e.getSource()== cursiva) {
				    		pEscritura.setFont(cursivaF);
				           }
						}
		});
		
		subrallat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
					 if (e.getSource()== subrallat) {
				    		pEscritura.setFont(subrallatF);
				           }
						}
		});
		
		fonts.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == fonts) {
					if(e.getSource() == lletra) {
						pEscritura.setFont(lletra);
					}
					if(e.getSource() == lletra1) {
						pEscritura.setFont(lletra1);
					}
					if(e.getSource() == lletra2) {
						pEscritura.setFont(lletra2);
					}
					if(e.getSource() == lletra3) {
						pEscritura.setFont(lletra3);
					}
				}
		}
		});
	}


	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new CasPractic2();
			}
		});
	}
	
	
	/*private void loadFont() {
	GraphicsEnvironment gEnv = getLocalGraphicsEnvironment();
	String[] fonts = gEnv.getAvailableFontFamilyNames();	
	
	ComboBoxModel model = new DefaultComboBoxModel(fonts);
	jcbFont.setModel(model);
}

private GraphicsEnvironment getLocalGraphicsEnvironment() {
	return null;
}
private void jcbFontActionPerformed(java.awt.event.ActionEvent evt) {
	//Canviar font de text
	JTextPane.setFont(new Font(jcbFont.getSelectedItem().toString(),
	Font.PLAIN, Integer.parseInt(jcbSelectSize.getSelectedItem().toString())));
}

private void SelectSizeAction(java.awt.event.ActionEvent evt) {
	//Triar tamany de text
	String getSize = jcbSelectSize.getSelectedItem().toString;
	Font f = JTextPane.getFont();
	//Nou tamany de text
	JTextPane.setFont(new Font(f.getFontName(),
	f.getStyle(), Integer.parseInt(getSize)));
}

private void btnSelectColorActionPerformed(java.awt.event.ActionEvent evt) {
	Color jColor = selectColor;
	//obrir dialeg de seleccio de color
	if ((jColor = JColorChooser.showDialog(this, "Selecciona un color", jColor)) != null) {
		selectColor = jColor;
		
		JTextPane.setForeground(selectColor);
	}
}*/
}
