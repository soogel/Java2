package de.dhbw.rv.l03.event;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventExampleFrame extends JFrame{
	
	public EventExampleFrame() {
		super("Event Example");
		setSize(500, 350);
		setLocation(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		
		// Erstellung der GUI Komponente
		JButton button = new JButton("My Button");
		c.add(button);
		c.setLayout(new FlowLayout());
		
		// Registrierung des Action Listners "MyActionListener"
		MyActionListener mAl = new MyActionListener();
		button.addActionListener(mAl);
		button.addMouseListener(mAl);
	}

	public static void main(String[] args) {
		
		EventExampleFrame eef = new EventExampleFrame();
		eef.setVisible(true);

	}

}
