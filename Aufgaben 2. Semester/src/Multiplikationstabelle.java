public class Multiplikationstabelle {

	public static void main(String[] args) {
		
		int a = 9;
		
		System.out.printf("%4s","* |");
		//Spaltenbezeichner
		for(int l = 1; l <= a; l++){
			System.out.printf("%4d", l);
		}
		System.out.println();
		for (int k = 1; k < (4 * a)+6; k++) {
			System.out.print("-");
		}
		System.out.println();
		
		//Innere Tabelle
		
		for (int i = 1; i <= a; i++) {
			//Zeilenbezeichner
			System.out.printf("%4s", i + " |");
			for(int j = 1; j <= a; j++){
				System.out.printf("%4d", i*j);
			}
			System.out.println();
		}
	}
}
