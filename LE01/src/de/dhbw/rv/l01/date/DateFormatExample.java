package de.dhbw.rv.l01.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class DateFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Simplde Date Format Objekt erzeugen
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		String s = "23.11.1954";
		try {
			// Datum aus String parsen
			Date d = sdf.parse(s);
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			
			//Formatierte Ausgabe
			String formatiertesDatum = sdf.format(c.getTime());
			System.out.println(formatiertesDatum);
			
		} catch (ParseException e) {
			// Fehlerbehandlung
			e.printStackTrace();
		}
	}
}
