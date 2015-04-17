import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;


public class SplitPaneExample extends JFrame {
public SplitPaneExample(){
	super("SplitPaneExample");
	setSize(500,300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	jsp.setLeftComponent(new JLabel("Links"));;
	jsp.setRightComponent(new JLabel("Rechts"));
	
	
	Container c = getContentPane();
	c.add(jsp);
	
	
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SplitPaneExample jspe = new SplitPaneExample();
		jspe.setVisible(true);
	}

}
