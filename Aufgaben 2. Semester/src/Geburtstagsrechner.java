import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;


public class Geburtstagsrechner {

	public static void main(String[] args) {
		int alter = 0;
		SimpleDateFormat sdf = new SimpleDateFormat ("dd.MM.yyyy");
		String eingabe = JOptionPane.showInputDialog(null, "Geben sie ihr Geburtsdatum ein:");
		try{
			Date d = sdf.parse(eingabe);
			Calendar bday = Calendar.getInstance();
			Calendar heute = Calendar.getInstance();
			bday.setTime(d);
			
			int byear = bday.get(Calendar.YEAR);
			int bmonth = bday.get(Calendar.MONTH)+1;
			int bmday = bday.get(Calendar.DAY_OF_MONTH);
			
			int ayear = heute.get(Calendar.YEAR);
			int amonth = heute.get(Calendar.MONTH)+1;
			int amday = heute.get(Calendar.DAY_OF_MONTH);
			
			
			if(ayear>byear){
				alter = ayear-byear;
				if(amonth>bmonth){
					
				}
				else if (amonth==bmonth){
					if(amday<bmday){
						alter--;
					}
				}
				else if(amonth<bmonth){
					alter--;
				}
			}
			
			String formatiertesDatum = sdf.format(bday.getTime());
			System.out.println("Geburtstag: " + formatiertesDatum);
			System.out.println("Alter: " + alter);
			
			for(int i = 1; i<=10; i++){
				System.out.println(i + "0. Geburtstag: " + bmday + "." + bmonth + "." + (byear+(i*10)));
			}
			
			
			
		}
		catch(ParseException e){
			e.printStackTrace();
		}
		
		
	}
}