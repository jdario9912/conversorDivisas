package conversorDivisas;

import javax.swing.JOptionPane;

public class IngresoDinero {
	public IngresoDinero() {
		float importe = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir"));
		
		System.out.println(importe);
	}
}