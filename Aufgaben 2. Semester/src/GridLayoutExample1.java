import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GridLayoutExample1 extends JFrame {
	public GridLayoutExample1() {
		
		super("GridlayoutExample");
		setSize(600,400);
		setLocation(100,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		JButton jbt = new JButton();
		
		GridBagLayout gbl=new GridBagLayout();
		setLayout(gbl);
		GridBagConstraints gbc=new GridBagConstraints();
		
		
		// Festlegen, dass die GUI-Elemente die Gitterfelder in 
        // waagerechter Richtung ausfüllen:
		gbc.fill=GridBagConstraints.HORIZONTAL;

		// Die Abständer der einzelnen GUI-Elemente zu den gedachten 
        // Gitterlinien festgelegen:
		gbc.insets = new Insets(2,2,2,2);  

		gbc.gridx = 0;  // x-Position im gedachten Gitter
		gbc.gridy = 0;  // y-Position im gedachten Gitter
		gbc.gridheight = 2;  // zwei Gitter-Felder hoch
		

		gbc.gridx=1; 
		gbc.gridy=0;
		gbc.gridheight = 1;
		JLabel label = new JLabel("Nur eine Demo");
		gbl.setConstraints(label, gbc);
		add(label);
		
		gbc.gridx=1; 
		gbc.gridy=1;
		gbc.gridheight = 1;
		JButton btClose = new JButton("Schließen");
		
		gbl.setConstraints(btClose, gbc);
		add(btClose);
		
		pack();
				
			}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
