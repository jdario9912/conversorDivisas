package conversorDivisas;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu extends JFrame implements ItemListener{
	JComboBox eleccionConversion = new JComboBox();
	JLabel tituloEleccion = new JLabel("Seleccione una opción de conversión");
	
	public Menu() {
		setLayout(null);
		
		tituloEleccion.setBounds(20, 10, 300, 30);
		add(tituloEleccion);
		
		eleccionConversion.setBounds(20, 50, 300, 30);
		eleccionConversion.addItem("");
		eleccionConversion.addItem("Conversor de divisas");
		eleccionConversion.addItem("Conversor de temperatura");
		add(eleccionConversion);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
	}
}
