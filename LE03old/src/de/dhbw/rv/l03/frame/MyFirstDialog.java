package de.dhbw.rv.l03.frame;

import java.awt.Point;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class MyFirstDialog extends JDialog {
	
	public MyFirstDialog(JFrame parent) {
		super(parent);
		setSize(200, 100);
		setTitle("My First Dialog");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setModal(true);
		
		Point p = parent.getLocation();
		setLocation(p);
	}
}
