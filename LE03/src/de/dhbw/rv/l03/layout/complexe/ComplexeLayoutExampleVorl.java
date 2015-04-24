package de.dhbw.rv.l03.layout.complexe;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ComplexeLayoutExampleVorl extends JFrame{

	public ComplexeLayoutExampleVorl() {
		super("Schachteln von Layout Managern");
		setSize(600, 400);
		setLocation(100, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		JLabel summaryText = new JLabel("Summary: ");
		summaryText.setAlignmentX(LEFT_ALIGNMENT);
		p1.add(summaryText);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1,1));
		JTextField jtf = new JTextField();
		p2.setAlignmentX(LEFT_ALIGNMENT);
		p2.add(jtf);
		
		p1.add(p2);
		p1.add(Box.createVerticalStrut(25));
		
		JLabel descriptionText = new JLabel("Text: ");
		descriptionText.setAlignmentX(LEFT_ALIGNMENT);
		p1.add(descriptionText);
		
		JPanel p3 = new JPanel();
		JScrollPane jsp = new JScrollPane();
		p3.setLayout(new BorderLayout());
		JTextArea textArea = new JTextArea();
//		p3.add(textArea);
		jsp.setViewportView(textArea);
		p3.add(jsp);
		p3.setAlignmentX(LEFT_ALIGNMENT);
		p1.add(p3, BorderLayout.CENTER);
		
		JPanel p4 = new JPanel();
		p4.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton send = new JButton("Send!");
		JButton cancel = new JButton("Cancel");
		
		p4.add(send);
		p4.add(cancel);
		p4.setAlignmentX(LEFT_ALIGNMENT);
		
		p1.add(p4);
		c.add(p1, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		ComplexeLayoutExampleVorl cle = new ComplexeLayoutExampleVorl();
		cle.setVisible(true);
	}

	
	
	
	
	
}
