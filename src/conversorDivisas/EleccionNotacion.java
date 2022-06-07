package conversorDivisas;

import javax.swing.JOptionPane;

public class EleccionNotacion {
	public EleccionNotacion() {
		Object notacion = JOptionPane.showInputDialog(null,"Elija el sistema al que desea convertir el acorde",
				   "Sistema", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { 
						  		 "De Tradicional a Americano",
						         "De Americano a Tradicional",
						       },"");
		System.out.println(notacion);
	}
}
