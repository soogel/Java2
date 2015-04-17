package de.dhbw.rv.l01.wrapper;

public class WrapperExample {

	public static void main(String[] args) {
	
		String sZahl = "A";
		String sZahl2 = "10";
		try {
				int zahl1 = Integer.parseInt(sZahl);
				int zahl2 = Integer.parseInt(sZahl2);
				
				int erg = zahl1 * zahl2;
		}
		catch (java.lang.NumberFormatException e) {
			//Fehlermeldung
			System.out.println("Fehler!");
		}

		
		

	}

}
