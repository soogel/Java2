import java.text.DecimalFormat;


public class Addition {

	public static void main(String[] args) {
		int a = 2;
		double b = 3.4;
		int c = 1;
		int d = 10;
		double e = 4.56788596858585858585;
		double f = 0.1;
		
		DecimalFormat df = new DecimalFormat("#,###.###################################################################");
		
		System.out.println(df.format(addiere(a, b)));
		System.out.println(df.format(addiere(c, d)));
		System.out.println(df.format(addiere(e, f)));
	}
	
	public static double addiere(Number zahl1, Number zahl2){
				return zahl1.doubleValue() + zahl2.doubleValue();
	}
	
}