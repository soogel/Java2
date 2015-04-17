package de.dhbw.rv.l03.ex;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ExFrame extends JFrame {
	
	public ExFrame() {
		super("Mein erstes Windows-Fenster");
		setSize(400, 300);
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel jl = new JLabel("My First Label");
		c.add(jl);
		jl.addMouseListener(new ExMouseListener(this));
	}

	public static void main(String[] args) {
		
		ExFrame mfjf = new ExFrame();
		mfjf.setVisible(true);
	}

	
	
	
	
	
}
