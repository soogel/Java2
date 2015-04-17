package de.dhbw.rv.l03.layout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExample extends JFrame {
	
	public FlowLayoutExample() {
		super("Flow Layout Example");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container content = getContentPane();
		content.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20));
		
		JButton jb1 = new JButton("Button 1");
		JButton jb2 = new JButton("Button 2");
		JButton jb3 = new JButton("Button 3");
		JButton jb4 = new JButton("Button 4");
		JButton jb5 = new JButton("Button 5");
		
		content.add(jb1);
		content.add(jb2);
		content.add(jb3);
		content.add(jb4);
		content.add(jb5);
	}

	public static void main(String[] args) {
		FlowLayoutExample fle = new FlowLayoutExample();
		fle.setVisible(true);
		
	}

}
