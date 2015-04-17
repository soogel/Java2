package de.dhbw.rv.l03.frame;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFirstJFrame extends JFrame {
	
	public MyFirstJFrame() {
		super("Mein erstes Windows-Fenster");
		setSize(400, 300);
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("My First Label"));
	}

	public static void main(String[] args) {
		
		MyFirstJFrame mfjf = new MyFirstJFrame();
		mfjf.setVisible(true);
		
		
		
		
		
		
		
		MyFirstDialog mfd = new MyFirstDialog(new JFrame());
		mfd.setVisible(true);
		

	}

	
	
	
	
	
}
