package CasPracticSwign;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SwingUtilities;
import java.awt.image.BufferedImage;


public class CasPractic extends JFrame{

	//Imatge de fons (prova)
	BufferedImage imagen1 = null;
	
	
	private JPanel panel = new JPanel();
	private JPanel Phamburguesa = new JPanel();
	private JPanel Ppa = new JPanel();
	private JPanel Pbeguda = new JPanel();
	private JPanel Ppataques = new JPanel();
	private JPanel Pextra = new JPanel();
	private JPanel Psalsa = new JPanel();
	
	//Titols´
	private JLabel descripcio2 = new JLabel();
	private JLabel descripcio = new JLabel();
	private JLabel titol = new JLabel();
	private JLabel hamburguesa = new JLabel();
	private JLabel pa = new JLabel();
	private JLabel pataques = new JLabel();
	private JLabel beguda = new JLabel();
	private JLabel extra = new JLabel();
	private JLabel salsa = new JLabel();
	private JLabel precio = new JLabel();
	private JLabel IVA = new JLabel();
	private JLabel pvp = new JLabel();
	private JLabel Lketchup = new JLabel();
	private JLabel Lmostaza = new JLabel();
	private JLabel Lbarbacoa = new JLabel();
	private JLabel Lthai = new JLabel();
	//Botons
	
	private JButton total = new JButton("Calcula el total.");
	//Hamburguesa
	private JRadioButton pollo = new JRadioButton("Pollastre");
	private JRadioButton cerdo = new JRadioButton("Porc");
	private JRadioButton ternera = new JRadioButton("Vedella (+1€)");
	private JRadioButton vegetariano = new JRadioButton("Vegetarià (-1€)");
	private JRadioButton vegano = new JRadioButton("Vegà (-1€)");
	
	//Pa
	private JRadioButton paNormal = new JRadioButton("Normal");
	private JRadioButton paIntegral = new JRadioButton("Integral");
	private JRadioButton paCenteno = new JRadioButton("Centeno");
	
	//Pataques
	private JRadioButton fritas = new JRadioButton("Fritas");
	private JRadioButton gajo = new JRadioButton("Gajo");
	private JRadioButton caseras = new JRadioButton("Caseras (+1€)");
	private JRadioButton delux = new JRadioButton("Delux (+3€)");
	
	//Beguda
	private JRadioButton cola = new JRadioButton("CocaCola");
	private JRadioButton naranja = new JRadioButton("Fanta Taronja");
	private JRadioButton limon = new JRadioButton("Fanta Llima");
	private JRadioButton agua = new JRadioButton("Aigua");
	private JRadioButton cerveza = new JRadioButton("Cervessa");
	
	//Extra
	private JCheckBox edoble = new JCheckBox("Hamburguesa doble (+2€)");
	private JCheckBox equeso = new JCheckBox("Extra de queso (+0,50€)");
	private JCheckBox epatatas = new JCheckBox("Extra de patatas (+1€)");
	
	//Salses
	private JSpinner ketchup = new JSpinner();
	private JSpinner mostaza = new JSpinner();
	private JSpinner barbacoa = new JSpinner();
	private JSpinner thai = new JSpinner();
		
	//Buttongroups dels botons
	private ButtonGroup Bhamburguesa = new ButtonGroup();
	private ButtonGroup Bpa = new ButtonGroup();
	private ButtonGroup Bpataques = new ButtonGroup();
	private ButtonGroup Bbeguda = new ButtonGroup();
	
	
	public CasPractic() {
		
		
		//Fonts
		Font titol1 = new Font("Font Titol", Font.ITALIC, 20);
		Font lletra1 = new Font("Verdana", Font.BOLD, 11);
		Font lletra2 = new Font("Times new Roman", Font.ROMAN_BASELINE, 11);
		Font lletra3 = new Font("Arial", Font.HANGING_BASELINE, 11);
		
		//Marc
		setSize(900,600);
		setTitle("Menu Burguer");
		setLocation(400,200);
		setVisible(true);
		
		panel.setBackground(new Color(179,107,0));
		panel.setLayout(null);
		setContentPane(panel);
		
		//Etiquetes "Label"
		
		titol.setText("Burguer El Sicario");
		titol.setFont(titol1);
		titol.setBounds(50,200,200,200);
		
		descripcio.setText("Una selecció dels millors ingredients propers a la nostra terra, d'un origen ben cuidat i poc industrialitzat ");
		descripcio.setFont(lletra2);
		descripcio.setBounds(50,230,500,200);
		
		descripcio2.setText("per a garantir el millor gust al paladar.");
		descripcio2.setFont(lletra2);
		descripcio2.setBounds(50,240,500,200);
		
		hamburguesa.setText("Tipus hamburguesa");
		hamburguesa.setFont(lletra1);
		hamburguesa.setBounds(215,50,120,50);
		hamburguesa.setBorder(BorderFactory.createLineBorder(new Color(255,255,255)));
		hamburguesa.setBackground(new Color(255,255,191));
		
		pa.setText("Tipus pa burguer");
		pa.setFont(lletra1);
		pa.setBounds(65,50,100,50);
		pa.setBorder(BorderFactory.createLineBorder(new Color(255,255,255)));
		pa.setBackground(Color.orange);
		
		pataques.setText("Tipus pataques");
		pataques.setFont(lletra1);
		pataques.setBounds(370,50,100,50);
		pataques.setBorder(BorderFactory.createLineBorder(new Color(255,255,255)));
		pataques.setBackground(Color.yellow);
		
		beguda.setText("Tria una beguda");
		beguda.setFont(lletra1);
		beguda.setBounds(525,50,100,50);
		beguda.setBorder(BorderFactory.createLineBorder(new Color(255,255,255)));
		beguda.setBackground(Color.blue);
		
		salsa.setText("Tria les salses");
		salsa.setFont(lletra1);
		salsa.setBounds(680,50,100,50);
		salsa.setBorder(BorderFactory.createLineBorder(new Color(255,255,255)));
		salsa.setBackground(Color.red);
		
		Lketchup.setText("Ketchup: ");
		Lketchup.setFont(lletra2);
		
		Lmostaza.setText("Mostaza: ");
		Lmostaza.setFont(lletra2);
		
		Lbarbacoa.setText("Barbacoa: ");
		Lbarbacoa.setFont(lletra2);
		
		Lthai.setText("Thai: ");
		Lthai.setFont(lletra2);
		
		extra.setText("Complements extra");
		extra.setFont(lletra1);
		extra.setBounds(650,300,175,50);
		extra.setBorder(BorderFactory.createLineBorder(new Color(255,255,255)));
		extra.setBackground(Color.blue);
		
		precio.setText("Preu sense IVA");
		precio.setFont(lletra1);
		precio.setBounds(150,500,200,20);
		precio.setBorder(BorderFactory.createLineBorder(new Color(255,255,255)));
		precio.setBackground(Color.blue);
		
		IVA.setText("IVA (21%)");
		IVA.setFont(lletra1);
		IVA.setBounds(375,500,200,20);
		IVA.setBorder(BorderFactory.createLineBorder(new Color(255,255,255)));
		IVA.setBackground(Color.blue);
		
		pvp.setText("P.V.P");
		pvp.setFont(lletra1);
		pvp.setBounds(625,500,200,20);
		pvp.setBorder(BorderFactory.createLineBorder(new Color(255,255,255)));
		pvp.setBackground(Color.blue);
		
		total.setBounds(375,450,150,20);
		
		//Opac per a ficar color de fons
		
		hamburguesa.setOpaque(false);
		pa.setOpaque(false);
		pataques.setOpaque(false);
		beguda.setOpaque(false);
		extra.setOpaque(false);
		salsa.setOpaque(false);
		precio.setOpaque(false);
		IVA.setOpaque(false);
		pvp.setOpaque(false);
		
		pollo.setOpaque(false); //Per a donar-li color
		cerdo.setOpaque(false);
		ternera.setOpaque(false);
		vegetariano.setOpaque(false);
		vegano.setOpaque(false);
		
		paNormal.setOpaque(false);
		paIntegral.setOpaque(false);
		paCenteno.setOpaque(false);
		
		fritas.setOpaque(false);
		gajo.setOpaque(false);
		caseras.setOpaque(false);
		delux.setOpaque(false);
		
		cola.setOpaque(false);
		naranja.setOpaque(false);
		limon.setOpaque(false);
		agua.setOpaque(false);
		cerveza.setOpaque(false);
		
		edoble.setOpaque(false);
		equeso.setOpaque(false);
		epatatas.setOpaque(false);
		
		ketchup.setOpaque(false);
		mostaza.setOpaque(false);
		barbacoa.setOpaque(false);
		thai.setOpaque(false);
		
		//Spinners
		
		
	
		//Mesures panel
		Phamburguesa.setBounds(215,100,120,150);
		Phamburguesa.setBackground(new Color(230,138,0));
		Phamburguesa.setBorder(BorderFactory.createLineBorder(new Color(05,05,255)));
		
		Ppa.setBounds(65,100,100,150);
		Ppa.setBackground(new Color(255,204,0));
		Ppa.setBorder(BorderFactory.createLineBorder(new Color(05,05,255)));
		
		Pbeguda.setBounds(525,100,100,150);
		Pbeguda.setBackground(new Color(137, 128, 242));
		Pbeguda.setBorder(BorderFactory.createLineBorder(new Color(05,05,255)));
		
		
		Ppataques.setBounds(370,100,100,150);
		Ppataques.setBackground(new Color(177, 255, 7));
		Ppataques.setBorder(BorderFactory.createLineBorder(new Color(05,05,255)));
		
		Psalsa.setBounds(680,100,100,150);
		Psalsa.setBackground(new Color(255, 63, 7));
		Psalsa.setBorder(BorderFactory.createLineBorder(new Color(05,05,255)));
		
		Pextra.setBounds(650,350,175,120);
		Pextra.setBackground(new Color(255, 56, 57));
		Pextra.setBorder(BorderFactory.createLineBorder(new Color(05,05,255)));
		//Panel
		panel.add(hamburguesa);
		panel.add(pa);
		panel.add(pataques);
		panel.add(beguda);
		panel.add(salsa);
		panel.add(extra);
		panel.add(precio);
		panel.add(IVA);
		panel.add(pvp);
		panel.add(total);
		panel.add(titol);
		panel.add(descripcio);
		panel.add(descripcio2);
		
		//Botons al panell
		Phamburguesa.add(pollo);
		Phamburguesa.add(cerdo);
		Phamburguesa.add(ternera);
		Phamburguesa.add(vegetariano);
		Phamburguesa.add(vegano);
		
		Ppa.add(paNormal);
		Ppa.add(paIntegral);
		Ppa.add(paCenteno);
		
		Ppataques.add(fritas);
		Ppataques.add(gajo);
		Ppataques.add(caseras);
		Ppataques.add(delux);
		
		Pbeguda.add(cola);
		Pbeguda.add(naranja);
		Pbeguda.add(limon);
		Pbeguda.add(agua);
		Pbeguda.add(cerveza);
		
		Pextra.add(edoble);
		Pextra.add(equeso);
		Pextra.add(epatatas);
		
		//Amb el Layout podrem possar els spinners on vulguem ja que si no es possen pre-definits
		Psalsa.setLayout(null);
		
		Psalsa.add(ketchup);
		ketchup.setBounds(60,5,30,20);
		
		Psalsa.add(mostaza);
		mostaza.setBounds(60,46,30,20);
		
		Psalsa.add(barbacoa);
		barbacoa.setBounds(60,88,30,20);
		
		Psalsa.add(thai);
		thai.setBounds(60,125,30,20);
		
		Psalsa.add(Lketchup);
		Lketchup.setBounds(10,5,50,20);
		
		Psalsa.add(Lmostaza);
		Lmostaza.setBounds(10,46,50,20);
		
		Psalsa.add(Lbarbacoa);
		Lbarbacoa.setBounds(10,88,50,20);
		
		Psalsa.add(Lthai);
		Lthai.setBounds(10,125,50,20);
		
		
		panel.add(Phamburguesa);
		panel.add(Pbeguda);
		panel.add(Ppa);
		panel.add(Ppataques);
		panel.add(Pextra);
		panel.add(Psalsa);
		
		
		//GroupButton
		
		Bhamburguesa.add(pollo);
		Bhamburguesa.add(cerdo);
		Bhamburguesa.add(ternera);
		Bhamburguesa.add(vegetariano);
		Bhamburguesa.add(vegano);
		
		Bpa.add(paNormal);
		Bpa.add(paIntegral);
		Bpa.add(paCenteno);
		
		Bbeguda.add(cola);
		Bbeguda.add(naranja);
		Bbeguda.add(limon);
		Bbeguda.add(agua);
		Bbeguda.add(cerveza);
		
		Bpataques.add(fritas);
		Bpataques.add(gajo);
		Bpataques.add(caseras);
		Bpataques.add(delux);
		
	
	
	
		
		
		
		
		
	
		

		total.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double valorTotal = 8;
				double valorAfegit = 0;
				double sumaKetchup = 0;
				double sumaMostaza = 0;
				double sumaThai = 0;
				double sumaBarbacoa = 0;
				double valorIVA = 0;
				double valorPVP = 0;
				
				if(ternera.isSelected()) {
					valorAfegit++;
				}
				else if(vegano.isSelected()) {
					valorAfegit--;
				}
				else if(vegetariano.isSelected()) {
					valorAfegit--;
				}
				
				if(caseras.isSelected()) {
					valorAfegit++;
				}
				else if(delux.isSelected()) {
					valorAfegit = valorAfegit+3;
				}
				
				if(edoble.isSelected()) {
					valorAfegit = valorAfegit+2;
				}
				if(equeso.isSelected()) {
					valorAfegit = valorAfegit+0.5;
				}
				if(epatatas.isSelected()) {
					valorAfegit = valorAfegit+1;
				}
				
			
					sumaKetchup = (int) ketchup.getValue() * 0.5;
					sumaMostaza = (int) mostaza.getValue() * 0.5;
					sumaBarbacoa = (int) barbacoa.getValue() * 0.5;
					sumaThai = (int) thai.getValue() * 0.5;
				
					
					valorTotal = valorTotal + valorAfegit + sumaBarbacoa + sumaKetchup + sumaMostaza + sumaThai;
					
					valorIVA = valorTotal * 0.21;
					valorPVP = valorIVA + valorTotal;
					
					precio.setText("El preu sense IVA: " + valorTotal);
					IVA.setText("El valor de l'IVA es: " + valorIVA);
					pvp.setText("El preu total es: " + valorPVP);
				
			}
		});
	}

	/*public fondoSwing(BufferedImage pImagen) {
		imagen1 = pImagen;
	}*/
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
		@Override
			public void run() {
				new CasPractic();
			}
		});
	}
}
