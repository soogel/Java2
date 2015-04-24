package de.dhbw.rv.l03.container;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class JScrollPaneExample extends JFrame {

	public JScrollPaneExample() {
		super("JScrollPane Example");
		setSize(300, 200);	
		setLocation(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		JScrollPane jsp = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new BorderLayout());
		JTextArea jta = new JTextArea();
//		jta.setLineWrap(true);
		jp1.add(jta, BorderLayout.CENTER);
		
		// Setzen der GUI Komponente / JPanel über setViewportView!
		jsp.setViewportView(jp1);
		c.add(jsp);
		
	}
	
	public static void main(String[] args) {
		JScrollPaneExample jspe = new JScrollPaneExample();
		jspe.setVisible(true);
	}

}
