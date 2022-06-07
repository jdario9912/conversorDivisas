package conversorDivisas;

import javax.swing.JOptionPane;

public class Menu {
	public Menu() {
		Object conversor = JOptionPane.showInputDialog(null,"Elija el tipo de conversor",
				   "COLORES", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Conversor de divisas","Conversor de notas de guitarra"},"");
		System.out.println(conversor);
	}
}
