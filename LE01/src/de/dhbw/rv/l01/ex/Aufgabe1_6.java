package de.dhbw.rv.l01.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Aufgabe1_6 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		boolean incorrect = true;
		Date gebDat = null;
		do {
			String eingabe = JOptionPane.showInputDialog("Bitte geben Sie Ihr Geburtsdatum in der Form dd.MM.yyyy an:");
			try {
				gebDat = sdf.parse(eingabe);
				incorrect = false;
			} catch (ParseException e) {
				JOptionPane.showMessageDialog(null, "Die Eingabe war Fehlerhaft. Bitte Datum erneut eingeben.", "Falscheingabe", JOptionPane.ERROR_MESSAGE);
				
			}
		}
		while(incorrect);

		Calendar heute = Calendar.getInstance();
		Calendar geburtstag = Calendar.getInstance();
		geburtstag.setTime(gebDat);
		
		// Alter ermitteln durch Subtraktion der Jahre
		int alter = heute.get(Calendar.YEAR) - geburtstag.get(Calendar.YEAR);
		
		// Sonderbedingung 1 prüfen: Dieses Jahr noch kein Geburtstaggehabt
		if (heute.get(Calendar.MONTH) < geburtstag.get(Calendar.MONTH)) {
			alter--;
		}
		// Sonderbedingung 2: Noch kein Geburtstag, aber wir sind im Geburstmonat. Tag prüfen:
		else if (heute.get(Calendar.MONTH) == geburtstag.get(Calendar.MONTH) && 
				heute.get(Calendar.DAY_OF_MONTH) < geburtstag.get(Calendar.DAY_OF_MONTH)) {
			alter--;
		}
		
		JOptionPane.showMessageDialog(null, "Sie sind: " + alter + " Jahre alt");
	
		
		// String Builder für das Zusasmmenfassen aller Texte zur Ausgabe auf einem(!) Dialog
		StringBuilder text = new StringBuilder();
		// Ausgabe aller Jubiläen:
		for (int i = 10; i <= 100; i+=10) {
			geburtstag.add(Calendar.YEAR, 10);
			text.append(i);
			text.append(" Jahre: ");
			text.append(sdf.format(geburtstag.getTime()));
			// Neue Zeile
			text.append("\n");
		}
		
		JOptionPane.showMessageDialog(null, text.toString());
	}

}
