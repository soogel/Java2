import javax.swing.JOptionPane;


public class StringTeilen {

	public static void main(String[] args) {
		String nutzerEingabe = JOptionPane.showInputDialog(null, "Name");
		int i = 0;
		String [] worte = new String [nutzerEingabe.length()];
		nutzerEingabe = nutzerEingabe.replace(" ", ";");
		
		while(true){
			if(nutzerEingabe.indexOf(";")<1){
				worte[i] = nutzerEingabe;
				System.out.println(i + ": " + nutzerEingabe);
				return;
			}
			else{
				String ausgabe = nutzerEingabe.substring(0, nutzerEingabe.indexOf(";"));
				nutzerEingabe = nutzerEingabe.substring(nutzerEingabe.indexOf(";") + 1);
				worte[i] = ausgabe;
				System.out.println(i + ": " + ausgabe);
				i++;
			}
		}
		
	}

}
