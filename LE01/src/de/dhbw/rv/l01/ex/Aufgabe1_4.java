package de.dhbw.rv.l01.ex;

import javax.swing.JOptionPane;

public class Aufgabe1_4 {

	public static void main(String[] args) {
		
		boolean incorrect = true;
		do {
			String s = JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein:");
			
			try {
				int eingabe = Integer.parseInt(s);
				JOptionPane.showMessageDialog(null, "Korrekte Eingabe: " + eingabe);
				incorrect = false;
			}
			catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Die Eingabe war nicht Korrekt, bitte Ganzzahl eingeben.", "Falscheingabe", JOptionPane.ERROR_MESSAGE);
			}
		} while (incorrect);
		

	}

}
