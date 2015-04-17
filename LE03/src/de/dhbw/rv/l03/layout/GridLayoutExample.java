package de.dhbw.rv.l03.layout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExample extends JFrame {

	public GridLayoutExample() {
		super("Grid Layout Example");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container content = getContentPane();
		content.setLayout(new GridLayout(2,3, 10, 10));
		
		JButton jb1 = new JButton("Button 1");
		JButton jb2 = new JButton("Button 2");
		JButton jb3 = new JButton("Button 3");
		JButton jb4 = new JButton("Button 4");
		JButton jb5 = new JButton("Button 5");
		JButton jb6 = new JButton("Button 6");
		
		content.add(jb1);
		content.add(jb2);
		content.add(jb3);
		content.add(jb4);
		content.add(jb5);
		content.add(jb6);
	}
	
	public static void main(String[] args) {
		GridLayoutExample gle = new GridLayoutExample();
		gle.setVisible(true);
	}

}
