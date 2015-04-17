package de.dhbw.rv.l01.ex;

public class Aufgabe1_3 {

	private String makeXString(int x) {
		StringBuilder result = new StringBuilder("");
		for (int i = 0; i < x; i++) {
			result.append(i);
			result.append(": ");
			result.append("X");
		}
		
		return result.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Aufgabe1_3 a = new Aufgabe1_3();
		
		System.out.println("Start...");
		a.makeXString(10000000);
		System.out.println("Ende");
	}

}
