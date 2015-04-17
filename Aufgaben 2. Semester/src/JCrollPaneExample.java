import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class JCrollPaneExample extends JFrame{
	
	public JCrollPaneExample(){
		
		super("JScrollpane ex");
		setSize(300,200);
		setLocation(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JScrollPane jsp = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		JPanel jp1= new JPanel();
		jp1.setLayout(new BorderLayout());
		JTextArea jza = new JTextArea();
		jza.setLineWrap(true);
		jp1.add(jta, BorderLayout.CENTER);
		//SETZEN der GIU
		jsp.setViewport(jp1);
		c.add(jp1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
