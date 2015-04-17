package de.dhbw.rv.l01.ex;

public class Aufgabe1_2 {

	public static void main(String[] args) {
		String eingabe = "Java;ist;eine;schöne;Sprache";
		
		boolean next = true;
		int i = 1;
		do {
			int pos = eingabe.indexOf(";");
			if (pos > 0) {
				String ausgabe = eingabe.substring(0, pos);
				System.out.println(i + " --> " + ausgabe);
				eingabe = eingabe.substring(pos + 1, eingabe.length());
			}
			else {
				System.out.println(i + " --> " + eingabe);
				next = false;
			}
			
			i++;
		} while(next);
		

	}

}
