package de.dhbw.rv.l01.ex;

public class Aufgabe1_5 {
	
	public static Number add(Number n1, Number n2) {
		double d1 = n1.doubleValue();
		double d2 = n2.doubleValue();
		return d1 + d2;
	}


	public static double addD(double n1, double n2) {
		return n1 + n2;
	}
	
	public static void main (String[] argv) {
		System.out.println(add(2, 3.4));
		System.out.println(add(1, 10));
		System.out.println(add(4.56788596858585858585, 0.1));
	}
}
