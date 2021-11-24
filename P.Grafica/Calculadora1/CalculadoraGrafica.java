package Calculadora1;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class CalculadoraGrafica extends JFrame {

	private double num1;
	private double num2;
	
	
	public CalculadoraGrafica() {
		
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
		calcula.setText("Calcula!");
		calcula.setBounds(150,200,400,30);
	
		//Botons
		JButton suma = new JButton();
		suma.setText("+");
		suma.setBounds(20,150,60,30);
		
		JButton resta = new JButton();
		resta.setText("-");
		resta.setBounds(120,150,60,30);
		
		JButton multi = new JButton();
		multi.setText("*");
		multi.setBounds(220,150,60,30);
		
		JButton div = new JButton();
		div.setText("/");
		div.setBounds(320,150,60,30);
		
		
		
		
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
		
		
		
		//contenidor.add(panel);
		
		//Actio Listeners de les operacions
		suma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double resultat = 0;
				
				//Forma directa
				int x = Integer.parseInt(num1.getText());
				int y = Integer.parseInt(num2.getText());
				
				resultat = x + y;
				//JOptionPane.showMessageDialog(getContentPane(), "El resultat es" + resultat);
				calcula.setText("El resultat de la suma: " + resultat);
				
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
				
				resultat = x - y;
				//JOptionPane.showMessageDialog(getContentPane(), "El resultat es" + resultat);
				calcula.setText("El resultat de la resta: " + resultat);
			}
		});
		
		multi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double resultat = 0;
				
				int x = Integer.parseInt(num1.getText());
				int y = Integer.parseInt(num2.getText());
				
				resultat = x * y;
				//JOptionPane.showMessageDialog(getContentPane(), "El resultat es" + resultat);
				calcula.setText("El resultat de la multi: " + resultat);
			}
		});
		
		div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double resultat = 0;
				
				int x = Integer.parseInt(num1.getText());
				int y = Integer.parseInt(num2.getText());
				
				resultat = x / y;
				//JOptionPane.showMessageDialog(getContentPane(), "El resultat es" + resultat);
				calcula.setText("El resultat de la divisio: " + resultat);
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
				new CalculadoraGrafica();
			}
		});
	}
}
