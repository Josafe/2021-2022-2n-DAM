package IntroduccioSwing;
import javax.swing.JFrame;

public class Finestra {

	public static void main(String[] args) {
		Frame finestreta = new Frame();
	}
}



class Frame extends JFrame{
	
	public Frame() {
		setSize(600,600);
		setVisible(true);
		setTitle("La meva Finestra");
		//setBounds(1500,300,250,250); Els 2 primers parametres indiquen la localitzacio i els atres el tamany 
		setLocation(400,400);
	}
	
}

