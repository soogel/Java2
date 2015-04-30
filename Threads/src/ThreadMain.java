
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Beispiel Starten einer von Thread abgeleiteten Klasse.
		ExtendsThreadsExample ete = new ExtendsThreadsExample();
		System.out.println("Starte Main...");
		ete.setName("Thread 01");
		ete.start();
		
		//Beispiel : Starten einer von Runnable angeleoiteten Klasse:
		ImplementsRunnableExample ire = new ImplementsRunnableExample();
		System.out.println("Starte Runnable...");
		Thread t1 = new Thread(ire,"Runnable 01");
		t1.start();
		
		ImplementsRunnableExample ire2 = new ImplementsRunnableExample();
		Thread t2 = new Thread(ire2, "Runnable 02");
		t2.start();
		
		ImplementsRunnableExample ire3 = new ImplementsRunnableExample();
		Thread t3 = new Thread(ire3, "Runnable 03");
		t3.start();
		
		
		
		
		System.out.println("Main Methode Beendet");
	}

}
