package de.dhbw.rv.l03.event;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class EventExample2 extends JFrame {
	
	public EventExample2() {
		super("Beispiel für Listener");
		setSize(400, 300);
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton myButton = new JButton("Mein Knopf");
		
		myButton.addActionListener(new EventExample2Listener(this));
		
		c.add(myButton);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		EventExample2 ee2 = new EventExample2();
		
	}
	

}
