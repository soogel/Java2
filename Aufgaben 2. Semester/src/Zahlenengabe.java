import javax.swing.JOptionPane;

public class Zahlenengabe {

	public static void main(String[] args) {

		while (true){
			String eingabe = JOptionPane.showInputDialog(null, "Bitte geben sie eine Zahl ein:");
			try{
				int zahl = Integer.parseInt(eingabe);
			}
			catch(java.lang.NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Die Eingabe war nicht korrekt, bitte Ganzzahl eingeben!", "Falscheingabe", JOptionPane.ERROR_MESSAGE);
				continue;
			}
			JOptionPane.showMessageDialog(null, "Eingabe Korrekt: " + eingabe);
			break;
		}
	}
}