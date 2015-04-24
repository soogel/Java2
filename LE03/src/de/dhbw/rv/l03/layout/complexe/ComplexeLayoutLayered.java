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

public class ComplexeLayoutLayered extends JFrame {
	private static final long serialVersionUID = -3838892871785352093L;

	public ComplexeLayoutLayered() {
		super("Complexe Layout with layered Layout Managers");
		setSize(600, 400);
		setLocation(100, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Content Pane immer als unterster Continer / Ebene
		Container c = getContentPane();
		
		// Border Layout. Die Unterste Ebene p1 soll im Center plaziert werden, 
		// damit sich sich in alle Himmelsrichtungen ausdehen kann.
		c.setLayout(new BorderLayout());
		
		// Ebene die als Grundlage dient. Diese Ordnet die Elemente von oben nach unten per BoxLayout an.
		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		JLabel summaryLabel = new JLabel("Summary: ");
		summaryLabel.setAlignmentX(LEFT_ALIGNMENT);
		// Summary Label als eigene Zeile direkt ins BoxLayout auf P1
		p1.add(summaryLabel);
		
		// Panel P2 für das das TextField, welches sich horizontal ausdehen soll. 
		// Deswegen ein einzelliges Grid Layout. 
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(1,1));
		JTextField summaryText = new JTextField();
		p2.add(summaryText);
		p2.setAlignmentX(LEFT_ALIGNMENT);
		
		// Ebene P2 auf Ebene P1 setzen.
		p1.add(p2);
		
		// Zwischen Ebene P2 mit dem Textfeld und dem dann kommenden Label und 
		// TextArea sollen immer 25 Pixel Platz bleiben.
		p1.add(Box.createVerticalStrut(25));
		//p1.add(Box.createVerticalGlue());
		
		// P3 - Ebene mit dem Textfeld. Dieses muss sich in alle Himmelsrichtungen ausdehnen.
		JPanel p3 = new JPanel();
		p3.setLayout(new BorderLayout());
		JTextArea textArea = new JTextArea();
		
		// Textfeld auf Ebene ScrollPane setzen. Damit bei Bedarf Scroll Bars erscheinen
		JScrollPane jp = new JScrollPane();
		jp.setViewportView(textArea);
		p3.add(jp, BorderLayout.CENTER);
		p3.setAlignmentX(LEFT_ALIGNMENT);
		
		JLabel textLabel = new JLabel("Description: ");
		textLabel.setAlignmentX(LEFT_ALIGNMENT);
		p1.add(textLabel);
		p1.add(p3);
		
		// Ebene 4 mit Flow Layout. 2 Buttons nebeneinander. Diese dürfen sich auf keinen 
		// Fall vergrößern. Deswegen Flow Layout.
		JPanel p4 = new JPanel();
		p4.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton send = new JButton("Send!");
		JButton cancel = new JButton("Cancel");
		p4.add(send);
		p4.add(cancel);
		p4.setAlignmentX(LEFT_ALIGNMENT);
		
		p1.add(p4);
		
		// Ebene P1 auf den untersten Container, das Contentn Pane mit 
		// Border Layout setzen.
		c.add(p1, BorderLayout.CENTER);
	}
	
	public static void main(String[] args){
		ComplexeLayoutLayered cll = new ComplexeLayoutLayered();
		cll.setVisible(true);
	}
}
