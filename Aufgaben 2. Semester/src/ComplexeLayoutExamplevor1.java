import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ComplexeLayoutExamplevor1 extends JFrame{
	
	
	public ComplexeLayoutExamplevor1(){
		super("Schachtele von Layout Managern");
		setSize(600,400);
		setLocation(100,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));

		JLabel summaryText = new JLabel("Summary");
		p1.add(summaryText);
		
		
		c.add(p1);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1,1));
		JTextField jzf = new JTextField();
		p2.add(jzf);
		
		p1.add(p2);
		p1.add(Box.createVerticalStrut(25));
		
		JLabel descriptionText = new JLabel("Text");
		p1.add(descriptionText);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexeLayoutExamplevor1 cle = new ComplexeLayoutExamplevor1();
		cle.setVisible(true);
		
		
		}

	}


