import javax.swing.JOptionPane;


public class ZahlenEingabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
while (true){
		String s= JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein: ");
		System.out.println(s);
		
		
		try {int zahl1= Integer.parseInt(s);}
		catch (java.lang.NumberFormatException e){
	
	JOptionPane.showMessageDialog(null, "Die Eingabe war nicht richtig", s, JOptionPane.ERROR_MESSAGE);
	continue;}
		
		JOptionPane.showMessageDialog(null, "Die Eingabe war richtig");
		break;
		}}
		
	}


