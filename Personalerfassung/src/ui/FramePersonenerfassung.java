package ui;



import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FramePersonenerfassung extends JFrame {
	
	JTextField nachnamefield = new JTextField(10);
	JTextField vornamefield = new JTextField();
	
	public JTextField getNachnamefield() {
		return nachnamefield;
	}


	public void setNachnamefield(JTextField nachnamefield) {
		this.nachnamefield = nachnamefield;
	}


	public JTextField getVornamefield() {
		return vornamefield;
	}


	public void setVornamefield(JTextField vornamefield) {
		this.vornamefield = vornamefield;
	}


	public FramePersonenerfassung(){
		super("Personalverwaltungsprogramm");
		setSize(600,400);
		setLocation(100,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		//alt
		//c.setLayout(new BorderLayout());
		
		
		
		// Umbau auf GridLayOut
		GridBagLayout gbl=new GridBagLayout();
		setLayout(gbl);
		GridBagConstraints gbc=new GridBagConstraints();
		c.setLayout(gbl);
		
		// Festlegen, dass die GUI-Elemente die Gitterfelder in 
        // waagerechter Richtung ausfüllen:
		gbc.fill=GridBagConstraints.HORIZONTAL;
		
		gbc.gridx = 0;  // x-Position im gedachten Gitter
		gbc.gridy = 0;  // y-Position im gedachten Gitter
		gbc.gridheight = 2;  // zwei Gitter-Felder hoch
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1; 
		gbc.weighty = 1;
		gbc.anchor = GridBagConstraints.WEST;
			
		//weiter mit grid  grid
				JLabel vornameText = new JLabel("Vorname");
				gbl.setConstraints(vornameText, gbc);
				c.add(vornameText);
		
				GridBagConstraints gbc2=new GridBagConstraints();
				c.setLayout(gbl);
				
				
				// Festlegen, dass die GUI-Elemente die Gitterfelder in 
		        // waagerechter Richtung ausfüllen:
				gbc2.fill=GridBagConstraints.HORIZONTAL;
				gbc2.gridx = 0;  // x-Position im gedachten Gitter
				gbc2.gridy = 1;  // y-Position im gedachten Gitter
				gbc2.gridheight = 2;  // zwei Gitter-Felder hoch
				gbc2.gridwidth = 1;
				gbc2.gridheight = 1;
				gbc2.weightx = 1; 
				gbc2.weighty = 1;
				gbc2.anchor = GridBagConstraints.WEST;
				
				JLabel nachnameText = new JLabel("Nachname");
				gbl.setConstraints(nachnameText, gbc2);
				c.add(nachnameText);
				
			
		
				GridBagConstraints gbc3=new GridBagConstraints();
				c.setLayout(gbl);
				
				
				// Festlegen, dass die GUI-Elemente die Gitterfelder in 
		        // waagerechter Richtung ausfüllen:
				gbc3.fill=GridBagConstraints.HORIZONTAL;
				gbc3.gridx = 1;  // x-Position im gedachten Gitter
				gbc3.gridy = 0;  // y-Position im gedachten Gitter
				gbc3.gridheight = 2;  // zwei Gitter-Felder hoch
				gbc3.gridwidth = 1;
				gbc3.gridheight = 1;
				gbc3.weightx = 1; 
				gbc3.weighty = 1;
				gbc3.anchor = GridBagConstraints.WEST;
				
				gbl.setConstraints(nachnamefield, gbc3);
				c.add(nachnamefield);
				
				
				
		
				
				c.setLayout(gbl);
				
				
				// Festlegen, dass die GUI-Elemente die Gitterfelder in 
		        // waagerechter Richtung ausfüllen:
				GridBagConstraints gbc4=new GridBagConstraints();
				gbc4.fill=GridBagConstraints.HORIZONTAL;
				gbc4.gridx = 1;  // x-Position im gedachten Gitter
				gbc4.gridy = 1;  // y-Position im gedachten Gitter
				gbc4.gridheight = 2;  // zwei Gitter-Felder hoch
				gbc4.gridwidth = 1;
				gbc4.gridheight = 1;
				gbc4.weightx = 1; 
				gbc4.weighty = 1;
				gbc4.anchor = GridBagConstraints.WEST;
				
				gbl.setConstraints(vornamefield, gbc4);
				c.add(vornamefield);
				
				GridBagConstraints gbc5=new GridBagConstraints();
				gbc5.fill=GridBagConstraints.HORIZONTAL;
				gbc5.gridx = 0;  // x-Position im gedachten Gitter
				gbc5.gridy = 2;  // y-Position im gedachten Gitter
				gbc5.gridheight = 2;  // zwei Gitter-Felder hoch
				gbc5.gridwidth = 1;
				gbc5.gridheight = 1;
				gbc5.weightx = 1; 
				gbc5.weighty = 1;
				gbc5.anchor = GridBagConstraints.WEST;
				JPanel buttonp = new JPanel();
				buttonp.setLayout(new FlowLayout());
				JButton ok = new JButton("OK!");
				JButton abbruch = new JButton("Abbruch");
				buttonp.add(ok);
				buttonp.add(abbruch);
				gbl.setConstraints(buttonp, gbc5);
				c.add(buttonp);
				
				
				MyListenerer ml = new MyListenerer(this);
				abbruch.addActionListener(ml);
				ok.addActionListener(ml);
				
//				
//				GridBagConstraints gbc4=new GridBagConstraints();
//				gbc4.fill=GridBagConstraints.HORIZONTAL;
//				gbc4.gridx = 1;  // x-Position im gedachten Gitter
//				gbc4.gridy = 1;  // y-Position im gedachten Gitter
//				gbc4.gridheight = 2;  // zwei Gitter-Felder hoch
//				gbc4.gridwidth = 1;
//				gbc4.gridheight = 1;
//				gbc4.weightx = 1; 
//				gbc4.weighty = 1;
//				gbc4.anchor = GridBagConstraints.WEST;
//				
//				gbl.setConstraints(vornamefield, gbc4);
//				c.add(vornamefield);
				
		
				
				
//		
//		JPanel p1 = new JPanel();
//		p1.setLayout(new FlowLayout());
//		p1.setAlignmentX(LEFT_ALIGNMENT);
//		
//	
//		JPanel p2 = new JPanel();
//		p2.setLayout(new GridLayout(3,2));
//		JLabel vornameText = new JLabel("Vorname");
//		p2.add(vornameText);
//		
//		p2.add(vornamefield);
//		JLabel nachnameText = new JLabel("Nachname");
//		p2.add(nachnameText);
//		
//		
//		p2.add(nachnamefield);
//		
//		
//		p1.add(Box.createHorizontalStrut(25));
//		JButton ok = new JButton("OK!");
//		JButton abbruch = new JButton("Abbruch");
//		MyListenerer ml = new MyListenerer(this);
//		abbruch.addActionListener(ml);
//		ok.addActionListener(ml);
//		
//		p2.add(ok);
//		p2.add(abbruch);
//		p2.setAlignmentX(LEFT_ALIGNMENT);
//		p1.add(p2);
		

		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FramePersonenerfassung cle = new FramePersonenerfassung();
		cle.setVisible(true);
		
		

	}

}
