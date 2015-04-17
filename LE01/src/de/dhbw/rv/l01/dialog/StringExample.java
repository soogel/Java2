package de.dhbw.rv.l01.dialog;

public class StringExample {

	public static void main(String[] args) {
		String s = "Hallo Welt";
		String s1 = "Hallo Welt";
		
		boolean b = s.equals(s1);
		boolean b2 = s.startsWith("Hallo");
		
		
		System.out.println(s.compareTo("Hallo Java"));

	}

}
