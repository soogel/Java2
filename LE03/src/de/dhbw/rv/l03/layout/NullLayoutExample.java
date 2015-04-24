package de.dhbw.rv.l03.layout;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class NullLayoutExample extends JFrame {
	
	public NullLayoutExample() {
		super("Null Layout Example");
		setSize(600, 500);
		setLocation(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		// NULL als LayoutManager setzen --> Explizite Angabe, dass es
		// keinen LayoutManager gibt.
		c.setLayout(null);
		
		JButton einButton = new JButton("Ein Knopf dagjfd gsjdafdafds");
		einButton.setSize(100, 50);
		einButton.setLocation(50, 100);
		
		JTextField myTextfield = new JTextField(20);
		myTextfield.setSize(400, 100);
		myTextfield.setLocation(100 , 250);
		
		c.add(einButton);
		c.add(myTextfield);
	}

	public static void main(String[] args) {
		NullLayoutExample nle = new NullLayoutExample();
		nle.setVisible(true);
	}

}
