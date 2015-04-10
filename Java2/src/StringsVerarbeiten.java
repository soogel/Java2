import javax.swing.JOptionPane;

public class StringsVerarbeiten {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String s=
		// JOptionPane.showInputDialog("Bitte geben Sie Ihren Namen ein :");
		// System.out.println(s.length());
		// int g = s.length();
		// System.out.println(s.charAt(2));
		// System.out.println(s.substring(0));
		// System.out.println("Vorname: " + s.substring(0, s.indexOf(" ")));
		// System.out.println("Nachname: "+s.substring(s.indexOf(" "),
		// s.length()));
		//

		String eingabe = "Java;ist;eine;schoene;Sprache";
		System.out.println(eingabe);
int j = 0;
		while (eingabe.indexOf(";") > 1) {
			
			System.out.println(j+": "+eingabe.substring(0, eingabe.indexOf(";")));
			eingabe = eingabe.substring(eingabe.indexOf(";") + 1);
			//System.out.println(eingabe);
			j++;
		}
		System.out.println(j+": "+eingabe);
	}
}
