//package de.dhbw.rv.personenerfassung.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FramePersonenerfassung extends JFrame {

	JTextField jtf = new JTextField();
	JTextField jtf2 = new JTextField();
	
	
	public FramePersonenerfassung(){		
		super("Personenerfassung");
		setSize(600,130);
		setLocation(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(2,2));
		JLabel vorname = new JLabel("Vorname:");
		vorname.setAlignmentX(LEFT_ALIGNMENT);
		JLabel nachname = new JLabel("Nachname:");
		nachname.setAlignmentX(LEFT_ALIGNMENT);
		p2.setAlignmentX(LEFT_ALIGNMENT);
		p2.add(vorname, 0);
		p2.add(jtf, 1);
		p2.add(nachname, 2);
		p2.add(jtf2, 3);		
		
		p1.add(p2);		
		
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton ok = new JButton("OK!");
		JButton abbruch = new JButton("Abbruch");
		p3.add(ok);
		p3.add(abbruch);
		p3.setAlignmentX(LEFT_ALIGNMENT);
		
		p1.add(p3);
				
		c.add(p1, BorderLayout.CENTER);		
				
		BoxActionListener bAl = new BoxActionListener(this);
		ok.addActionListener(bAl);
		abbruch.addActionListener(bAl);
		
	}

	public static void main(String[] args) {
		try {
			PersonDao daoq= new PersonDao();
			FramePersonenerfassung fp = new FramePersonenerfassung();
			fp.setVisible(true);

			List<Person> testt=daoq.readAllPerson();
			for (Person test:testt){
				System.out.println(test.getVorname()+" "+test.getNachname());
				
				
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public String getVorname(){
		return jtf.getText();
	}
	
	public String getNachname(){
		return jtf2.getText();
	}
}