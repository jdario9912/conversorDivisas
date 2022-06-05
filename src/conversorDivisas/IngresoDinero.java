package conversorDivisas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IngresoDinero extends JFrame implements ActionListener{
	JTextField inputCantidadDinero;
	JButton botonOk, botonCancel, botonSalir;
	JLabel texto;
	
	public IngresoDinero() {
		setLayout(null);
		
		texto = new JLabel("Ingresa la cantidad de dinero que deseas convertir");
		texto.setBounds(20, 20, 370, 30);
		add(texto);
		
		inputCantidadDinero = new JTextField();
		inputCantidadDinero.setBounds(20, 50, 360, 30);
		add(inputCantidadDinero);
		
		botonOk = new JButton("Ok");
		botonOk.setBounds(100, 100, 70, 30);
		add(botonOk);
		botonOk.addActionListener(this);
		
		botonCancel = new JButton("Cancel");
		botonCancel.setBounds(200, 100, 90, 30);
		add(botonCancel);
		botonCancel.addActionListener(this);
		
		botonSalir = new JButton("Salir");
		botonSalir.setBounds(320, 100, 70, 30);
		add(botonSalir);
		botonSalir.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonSalir) {
			System.exit(0);
		}
		
		if (e.getSource() == botonOk) {
//			int importe = Integer.parseInt(inputCantidadDinero.getText());
			
		}
		
	}
}
