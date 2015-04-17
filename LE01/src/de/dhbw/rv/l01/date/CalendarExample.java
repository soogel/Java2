package de.dhbw.rv.l01.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarExample {

	public static void main(String[] args) {
		// Erzeugung Kalenderinstanz
		Calendar c = Calendar.getInstance();
		
		// Hinzufügen von 30 Tagen
		c.add(Calendar.DAY_OF_MONTH, 30);
		
		// Abfragen des eingestellten Tag
		System.out.println(c.get(Calendar.DAY_OF_MONTH));

		c.set(Calendar.HOUR, 12);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		
		int maxDaysInMay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(maxDaysInMay);
		
		// Date Objekt aus dem Kalender holen:
		Date d = c.getTime();
		
		// Date Objekt in den Kalender setzen:
		c.setTime(d);
		
		
		
		
		
		
	}

}
