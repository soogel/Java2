package de.dhbw.rv.l01.numbers;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		
		double d = 2000.0*3.789;
		System.out.println(d);
		
		DecimalFormat df = new DecimalFormat("#,##0.###");
		System.out.println(df.format(d));

	}

}
