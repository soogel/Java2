import java.text.SimpleDateFormat;
import java.util.Date;


public class ImplementsRunnableExample implements Runnable  { // Schritt 1: Implements Runnable
	@Override
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:m.ss.SSS");
		for (int i = 0; i< 1000; i++){
			Date d = new Date();
			String threadName = Thread.currentThread().getName();
			System.out.println("["+ threadName+ "] "+sdf.format(d));
		}
	}

}
