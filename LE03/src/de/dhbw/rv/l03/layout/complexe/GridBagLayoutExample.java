package de.dhbw.rv.l03.layout.complexe;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutExample extends JFrame {
	
	public GridBagLayoutExample() {
		super("GridBagLayout Example");
		setSize(600, 600);
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		// 1.) GridBagLayout Objekt erstellen und in Variabel speichern
		GridBagLayout layout = new GridBagLayout();
		c.setLayout(layout);
		
		// ======= Element Button 0 =========
		// 2.) GUI Element & GridBagConstraings Objekt. Constraints parametrisieren:
		JButton button0 = new JButton("Button 0");
		GridBagConstraints constraints1 = new GridBagConstraints();
		constraints1.gridx = 0;
		constraints1.gridy = 0;
		
		constraints1.gridheight = 1;
		constraints1.gridwidth = 1;
		
		constraints1.weightx = 100;
		constraints1.weighty = 100;
		
		constraints1.fill = GridBagConstraints.NONE;
		constraints1.anchor = GridBagConstraints.NORTHWEST;
		
		// 3.) Übergabe GUI Element & Constriants an den LayoutManager
		layout.setConstraints(button0, constraints1);
		// 4.) Übegabe Element an den Container
		c.add(button0);
		
		
		// ======= Element Button 1 =========
		JButton button1 = new JButton("Button Eins");
		GridBagConstraints constraints2 = new GridBagConstraints();
		constraints2.gridx = 1;
		constraints2.gridy = 0;
		constraints2.gridheight = 1;
		constraints2.gridwidth = 1;
		constraints2.weightx = 100;
		constraints2.weighty = 100;
		constraints2.fill = GridBagConstraints.BOTH;
		
		layout.setConstraints(button1, constraints2);
		c.add(button1);
		
		// Element Button 2
		JButton button2 = new JButton("Button 2");
		GridBagConstraints constraints3 = new GridBagConstraints();
		constraints3.gridx = 0;
		constraints3.gridy = 1;
		
		constraints3.gridwidth = 1;
		constraints3.gridheight = 1;
		
		constraints3.weightx = 100;
		constraints3.weighty = 100;
		
		constraints3.fill = GridBagConstraints.HORIZONTAL;
		constraints3.anchor = GridBagConstraints.NORTH;
		
		layout.setConstraints(button2, constraints3);
		c.add(button2);
		
		// Element Button 3
		JButton button3 = new JButton("Button 3");
		GridBagConstraints constraints4 = new GridBagConstraints();
		constraints4.gridx = 1;
		constraints4.gridy = 1;
		
		constraints4.gridwidth = 1;
		constraints4.gridheight = 1;
		
		constraints4.weightx = 100;
		constraints4.weighty = 100;
		
		constraints4.fill = GridBagConstraints.HORIZONTAL;
		constraints4.anchor = GridBagConstraints.NORTH;
		
		layout.setConstraints(button3, constraints4);
		c.add(button3);
		
		// Element Button 4
		JButton button4 = new JButton("Button 4");
		GridBagConstraints constraints5 = new GridBagConstraints();
		constraints5.gridx = 2;
		constraints5.gridy = 0;
		constraints5.gridheight = 2;
		constraints5.gridwidth = 1;
		constraints5.weightx = 400;
		constraints5.weighty = 100;
		constraints5.fill = GridBagConstraints.BOTH;
		 
		layout.setConstraints(button4, constraints5);
		c.add(button4);
	}
	

	public static void main(String[] args) {
		GridBagLayoutExample gbl = new GridBagLayoutExample();
		gbl.setVisible(true);
	}

}
