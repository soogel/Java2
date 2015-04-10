import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class DateformatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//simple Date format Object erzeugen
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY");
		String s = "23.22.1954";
		try {
			//Datum aus String parsen
			Date d =sdf.parse(s);
			Calendar c = Calendar.getInstance();}
		
		
catch (ParseExeption e) {
	// Fehlerbehandlung
	e.printStacktrace();
}
		
}
	}


