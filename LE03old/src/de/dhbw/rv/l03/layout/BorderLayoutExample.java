package de.dhbw.rv.l03.layout;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExample extends JFrame {
	
	public BorderLayoutExample() {
		super("Boder Layout Example");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JButton jb1 = new JButton("Button 1");
		JButton jb2 = new JButton("Button 2");
		JButton jb3 = new JButton("Button 3");
		JButton jb4 = new JButton("Button 4");
		JButton jb5 = new JButton("Button 5");
		
		c.add(jb1, BorderLayout.WEST);
		c.add(jb2, BorderLayout.EAST);
		c.add(jb3, BorderLayout.SOUTH);
		c.add(jb4, BorderLayout.NORTH);
		c.add(jb5, BorderLayout.CENTER);
		
	}

	public static void main(String[] args) {
		BorderLayoutExample ble = new BorderLayoutExample();
		ble.setVisible(true);
		
	}

}
