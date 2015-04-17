package de.dhbw.rv.l01.dialog;

import javax.swing.JOptionPane;

public class JOptionPaneExample {

	public static void main(String[] args) {
		
	
		String s = JOptionPane.showInputDialog("Bitte geben Sie Ihren Namen ein:");
		
		
		int erg = JOptionPane.showConfirmDialog(null, "Woll Sie das?","Abfrage", JOptionPane.YES_NO_OPTION);
		
		if (erg == JOptionPane.YES_OPTION) {
		// wenn Aswahl ja:
			JOptionPane.showMessageDialog(null, "Hallo " + s, "Hello Message", JOptionPane.ERROR_MESSAGE);
		}

	}

}
