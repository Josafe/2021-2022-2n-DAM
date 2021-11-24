package Calculadora3;
import java.awt.event.*;
import Calculadora1.CalculadoraGrafica;
import CalculadoraModificada.CalculadoraGrafica2;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
public class ExerciciComplexes extends JFrame{

		private double numcomplejoReal;
		private double numcomplejoImaginari;
		private double numcomplejo;
		
		public ExerciciComplexes() {
			
			//Marc
			setSize(420,300);
			setTitle("Mini Calculadora");
			setLocation(400,200);
			setVisible(true);
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.cyan);
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
			xifra2.setBounds(230,50,100,30);
			JTextField num2 = new JTextField();
			num2.setBounds(230,80,100,30);

			JLabel calcula = new JLabel();
			calcula.setText("CalculaReal!");
			calcula.setBounds(150,200,400,30);
			
			JLabel calcula2 = new JLabel();
			calcula.setText("CalculaImaginari!");
			calcula.setBounds(150,230,400,30);
		
			//Botons
			JButton suma = new JButton();
			suma.setText("SumaC");
			suma.setBounds(20,150,60,30);
			
			JButton resta = new JButton();
			resta.setText("RestaC");
			resta.setBounds(120,150,60,30);
			
			JButton multi = new JButton();
			multi.setText("MultiC");
			multi.setBounds(220,150,60,30);
			
			JButton div = new JButton();
			div.setText("DivC");
			div.setBounds(320,150,60,30);
			
			//Menu calculadores
			
			JMenuBar menu = new JMenuBar();
			setJMenuBar(menu);
			JMenu submenu = new JMenu("Calculadores");
			menu.add(submenu);
			
			JMenuItem tipo1 = new JMenuItem("Calculadora 1");
			JMenuItem tipo2 = new JMenuItem("Calculadora 2");
			JMenuItem tipo3 = new JMenuItem("Calculadora 3");
			
			submenu.add(tipo1);
			submenu.add(tipo2);
			submenu.add(tipo3);
			
			menu.add(submenu);
			
			tipo1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					SwingUtilities.invokeLater(new Runnable() {
						
						@Override
						public void run() {
							new CalculadoraGrafica();
						}
					});
				}
			});
			
			tipo2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					SwingUtilities.invokeLater(new Runnable() {
						
						@Override
						public void run() {
							new CalculadoraGrafica();
						}
					});
				}
			});
			tipo3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			
			
			
			
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
			panel.add(div);
			panel.add(calcula);
			panel.add(calcula2);
			
			
			
			
			//contenidor.add(panel);
			
			//Actio Listeners de les operacions
			suma.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					double numreal = Integer.parseInt(num1.getText());
					double numreal2 = Integer.parseInt(num1.getText());
					double numimaginari = Integer.parseInt(num2.getText());
					double numimaginari2 = Integer.parseInt(num2.getText());
					
					//Forma directa
					numcomplejoReal = numreal + numreal2;
					numcomplejoImaginari = numimaginari + numimaginari2;
					numcomplejo = numcomplejoReal + numcomplejoImaginari;
					
					for (int i = 0; i < numcomplejoReal; i++) {
						
					}
					
					
					//JOptionPane.showMessageDialog(getContentPane(), "El resultat es" + resultat);
					calcula.setText("El resultat de la suma del real e imaginari: " + numcomplejo);
					
					
				}
			});
			
			resta.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					double numreal = Integer.parseInt(num1.getText());
					double numreal2 = Integer.parseInt(num1.getText());
					double numimaginari = Integer.parseInt(num2.getText());
					double numimaginari2 = Integer.parseInt(num2.getText());
					
					//Forma directa
					numcomplejoReal = numreal + numreal2;
					numcomplejoImaginari = numimaginari + numimaginari2;
					numcomplejo = numcomplejoReal - numcomplejoImaginari;
					
					//JOptionPane.showMessageDialog(getContentPane(), "El resultat es" + resultat);
					calcula.setText("El resultat de la resta del real e imaginari: " + numcomplejo);
					
				}
			});
			
			multi.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					double numreal = Integer.parseInt(num1.getText());
					double numreal2 = Integer.parseInt(num1.getText());
					double numimaginari = Integer.parseInt(num2.getText());
					double numimaginari2 = Integer.parseInt(num2.getText());
					
					//Forma directa
					numcomplejoReal = numreal + numreal2;
					numcomplejoImaginari = numimaginari + numimaginari2;
					numcomplejo = numcomplejoReal * numcomplejoImaginari;
					//JOptionPane.showMessageDialog(getContentPane(), "El resultat es" + resultat);
					calcula.setText("El resultat de la multi de complexes: " + numcomplejo);
				}
			});
			
			div.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					double resultat = 0;
					
					double numreal = Integer.parseInt(num1.getText());
					double numreal2 = Integer.parseInt(num1.getText());
					double numimaginari = Integer.parseInt(num2.getText());
					double numimaginari2 = Integer.parseInt(num2.getText());
					
					//Forma directa
					numcomplejoReal = numreal + numreal2;
					numcomplejoImaginari = numimaginari + numimaginari2;
					numcomplejo = numcomplejoReal / numcomplejoImaginari;
					
					calcula.setText("El resultat de la divisio: " + numcomplejo);
				}
			});
		}
		
		public void setnum1(int num1) {
			numcomplejoReal = num1;
		}
		public void setnum2(int num2) {
			numcomplejoImaginari = num2;
		}
		
		public static void main(String[] args) {
			
			SwingUtilities.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					new ExerciciComplexes();
				}
			});
		}
		
	}



