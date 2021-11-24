package JFrame_JDialog_JButton_JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private Container contenedor; //declarem contenedor
	JButton botonCambiar; //declarem objecte boto
	JLabel labelTitulo; //declarem objecte Label
	private VentanaPrincipal miVentanaPrincipal; 
	
	public VentanaJava() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Dimension pantalla = mipantalla.getScreenSize();
		int alturaPantalla = pantalla.height; //S'almacena l'altura de la pantalla dintre d'aquesta variable
		int ampladaPantalla = pantalla.width; //Aqui almacenem l'amplada
		
		setSize(ampladaPantalla/2,alturaPantalla/2); //Aixi definirem una pantalla amb la mitat de la resolucio de la pantalla actual
		
		iniciarComponentes();
		setTitle("JFrame Finestra");
		setSize(300,200);
		setLocation(ampladaPantalla/4,alturaPantalla/4);
	}
	public void setVentanaPrincipal(VentanaPrincipal miVentana) {
		miVentanaPrincipal=miVentana;
	}
	
	public void iniciarComponentes() {
		contenedor = getContentPane(); //instancie el contenidor
		contenedor.setLayout(null); //tamany de posicio dels components

		//Propietats del boto, instanciar, posicionar i activar events
		botonCambiar = new JButton(); 
		botonCambiar.setText("Iniciar");
		botonCambiar.setBounds(100,80,80,20); //100 80 pantalla / 80 20 tamany
		botonCambiar.addActionListener(this);
		
		//Propietats label, instanciar, posicionar, activar events
		labelTitulo = new JLabel();
		labelTitulo.setText("FINESTRA PRINCIPAL");
		labelTitulo.setBounds(80,20,180,23);
		
		contenedor.add(labelTitulo);
		contenedor.add(botonCambiar);
	}	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == botonCambiar) {
			//enviem la instancia de la finestra principal per a que sigue la pare de la finestra de dialeg
		VentanaConfirmacion miVentanaConfirmacion = new VentanaConfirmacion(VentanaPrincipal, true);
		miVentanaConfirmacion.setVisible(true);
		}
	}
	
	public VentanaConfirmacion(VentanaPrincipal LaVentanaPrincipal, boolean modal)
	{
		super(LaVentanaPrincipal, modal);
		
		contenedor=getContentPane();
		contenedor.setLayout(null);
		//Assignar un titol a la barra
		setTitle("JDIALOG finestra confirmacio");
		
		labelTitulo= new JLabel();
		labelTitulo.setText("VENTANA DE CONFIRMACION");
		labelTitulo.setBounds(20,20,180,23);
		
		contenedor.add(labelTitulo);
		setSize(350,150);
		setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args) {
		VentanaPrincipal miVentanaPrincipal;
		miVentanaPrincipal=new VentanaPrincipal();
		miVentanaPrincipal.setVentanaPrincipal(miVentanaPrincipal);
		miVentanaPrincipal.setVisible(true);
	}
}
