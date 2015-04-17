package de.dhbw.rv.l01.ex;

public class MultiplyTable {

	public static void main(String[] args) {
		for (int y = 0; y <= 9; y++) {
			for (int x = 1; x <= 9; x++) {
				
				int erg = 0;
				if (y == 0) {
					erg = x * 1;
				}
				else {
					erg = x * y;
				}
				if (x == 1) {
					if (y == 0) {
						System.out.print("* |");
					}
					else {
						System.out.printf("%d |", erg);
					}
				}
				System.out.printf("%4d.", erg);
			}
			System.out.println();
			
			if (y == 0) {
				for (int i = 0; i <= 9; i++) {
					System.out.print("----");
				}
				System.out.println();
			}
		}
	}
}
