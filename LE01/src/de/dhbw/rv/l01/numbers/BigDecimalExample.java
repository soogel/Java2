package de.dhbw.rv.l01.numbers;

import java.math.BigDecimal;

public class BigDecimalExample {

	public static void main(String[] args) {

		BigDecimal bd1 = new BigDecimal("1");
		BigDecimal bd2 = new BigDecimal("3");
		BigDecimal bd3 = bd1.add(bd2);
		System.out.println(bd3);
		
		bd3 = bd1.divide(bd2,1000, BigDecimal.ROUND_HALF_UP);
		System.out.println(bd3);
		
		

	}

}
