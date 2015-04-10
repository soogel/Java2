public class StringBufferEinfuehrung {
	public static void main(String[] args) {
		System.out.println("Start... ");
		System.out.println(makeXString(10000000));
		System.out.println("Ende");
	}
	public static String makeXString(int anzahl){
		StringBuffer ausgabe = new StringBuffer("");
		for (int i=0; i<anzahl; i++) ausgabe.append("X");
		return ausgabe.toString();
	}
}