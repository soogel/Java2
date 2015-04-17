package ui;



import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
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
		c.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.setAlignmentX(LEFT_ALIGNMENT);
		
//		JLabel vornameText = new JLabel("Vorname");
//		vornameText.setAlignmentX(LEFT_ALIGNMENT);
//		p1.add(vornameText);
//		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(3,2));
		JLabel vornameText = new JLabel("Vorname");
		p2.add(vornameText);
		
		p2.add(vornamefield);
		JLabel nachnameText = new JLabel("Nachname");
		p2.add(nachnameText);
		
		
		p2.add(nachnamefield);
		
		
		p1.add(Box.createHorizontalStrut(25));
		JButton ok = new JButton("OK!");
		JButton abbruch = new JButton("Abbruch");
		MyListenerer ml = new MyListenerer(this);
		abbruch.addActionListener(ml);
		ok.addActionListener(ml);
		
		p2.add(ok);
		p2.add(abbruch);
		p2.setAlignmentX(LEFT_ALIGNMENT);
		p1.add(p2);
		
//		JLabel nachnameText = new JLabel("Nachname");
//		nachnameText.setAlignmentX(LEFT_ALIGNMENT);
//		p1.add(nachnameText);
		
		
		//c.add(p2,BorderLayout.WEST);
		c.add(p2);
		
//		JPanel p4 = new JPanel();
//		p4.setLayout(new FlowLayout(FlowLayout.RIGHT));
//		JButton ok = new JButton("OK!");
//		JButton abbruch = new JButton("Abbruch");
//		
//		p4.add(ok);
//		p4.add(abbruch);
//		p4.setAlignmentX(LEFT_ALIGNMENT);
//		
//		p1.add(p4);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FramePersonenerfassung cle = new FramePersonenerfassung();
		cle.setVisible(true);
		
		

	}

}
