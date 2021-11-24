package CalculadoraModificada;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class CalculadoraGrafica2 extends JFrame {

	private double num1;
	private double num2;
	
	
	public CalculadoraGrafica2() {
		
		//Marc
		setSize(560,300);
		setTitle("Mini Calculadora II");
		setLocation(400,200);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		panel.setLayout(null);
		setContentPane(panel);
		
		//Etiquetes
		JLabel xifra1 = new JLabel();
		xifra1.setText("Xifra 1");
		xifra1.setBounds(40,50,100,30);
		JTextField num1 = new JTextField();
		num1.setBounds(40,80,100,30);
		
		JLabel xifra2 = new JLabel();
		xifra2.setText("Xifra 2");
		xifra2.setBounds(40,100,100,30);
		JTextField num2 = new JTextField();
		num2.setBounds(40,130,100,30);

		JLabel Lresultat = new JLabel();
		Lresultat.setBounds(250,100,200,30);
		Lresultat.setBorder(null);
		Lresultat.setText("El resultat es: ");
	
		JComboBox menu = new JComboBox();
		menu.setBounds(50,50,90,20);
		//Botons
		JButton calcula = new JButton();
		calcula.setText("Calcula!");
		calcula.setBounds(250,50,100,30);
		
		JRadioButton suma = new JRadioButton();
		suma.setText("Sumatorio");
		suma.setBounds(150,50,60,30);
		
		JRadioButton resta = new JRadioButton();
		resta.setText("Productorio");
		resta.setBounds(150,100,60,30);
		
		JRadioButton multi = new JRadioButton();
		multi.setText("Exponencial");
		multi.setBounds(150,150,60,30);
		
		
		
		
		
		//panel.setBounds(0,0,600,300);
		//Container contenidor = getContentPane();
		//Afegint els valors al panel
		panel.add(xifra1);
		panel.add(xifra2);
		panel.add(num1);
		panel.add(num2);
		panel.add(suma);
		panel.add(resta);
		panel.add(multi);
		panel.add(calcula);
		panel.add(Lresultat);
		
		
		
		//contenidor.add(panel);
		
		//Actio Listeners de les operacions
	/*	suma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double resultat = 0;
				
				//Forma directa
				int x = Integer.parseInt(num1.getText());
				int y = Integer.parseInt(num2.getText());
				
				resultat = x + y;
				//JOptionPane.showMessageDialog(getContentPane(), "El resultat es" + resultat);
				Lresultat.setText("El resultat del sumatori: " + resultat);
				
			}
		});
		
		resta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double resultat = 0;
				
				String a = num1.getText();
				String b = num2.getText();
				
				int x = Integer.parseInt(a);
				int y = Integer.parseInt(b);
				
				resultat = x * y;
				//JOptionPane.showMessageDialog(getContentPane(), "El resultat es" + resultat);
				Lresultat.setText("El resultat del Productori: " + resultat);
			}
		});
		
		multi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double resultat = 0;
				
				int x = Integer.parseInt(num1.getText());
				int y =  Integer.parseInt(num2.getText());
				
				for (int i = 0; i < x; i++) {
					y = x * x;
				}
				
				resultat = y * x;
				//JOptionPane.showMessageDialog(getContentPane(), "El resultat es" + resultat);
				Lresultat.setText("El resultat de l'exponencial es: " + resultat);
			}
		});*/
		
		calcula.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double resultat = 0;
				//Forma directa
				int x = Integer.parseInt(num1.getText());
				int y = Integer.parseInt(num2.getText());
				
				if(suma.isSelected()) {
					if(e.getSource() != suma) {
						
					}
					for (int i = 0; i < x; i++) {
					resultat = x + y;
					y++;
					}
					resultat = x + y;
					//JOptionPane.showMessageDialog(getContentPane(), "El resultat es" + resultat);
					Lresultat.setText("El resultat del sumatori: " + resultat);
				}
				else if(resta.isSelected()) {
					if(e.getSource() != resta) {
						resultat = x * y;
						y++;
					}
					//JOptionPane.showMessageDialog(getContentPane(), "El resultat es" + resultat);
					Lresultat.setText("El resultat del Productori: " + resultat);
				}
				else if(multi.isSelected()) {
					if (e.getSource() != multi) {
						
					}
					for (int i = 0; i < x; i++) {
						y = x * x;
						resultat = y * x;
					}
					
					//JOptionPane.showMessageDialog(getContentPane(), "El resultat es" + resultat);
					Lresultat.setText("El resultat de l'exponencial es: " + resultat);
				}
					
				
			}
		});
		
	}
	
	public void setnum1(int num1) {
		this.num1 = num1;
	}
	public void setnum2(int num2) {
		this.num2 = num2;
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new CalculadoraGrafica2();
			}
		});
	}
}
