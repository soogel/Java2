import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 import javax.swing.event.*;
 
 public class TestJCheckbox
 extends JFrame
 implements ItemListener
 {
   public TestJCheckbox()
   {
     super("JCheckBox");
     addWindowListener(new WindowClosingAdapter(true));
     JPanel panel = new JPanel();
     panel.setLayout(new GridLayout(3, 1));
     for (int i = 1; i <= 3; ++i) {
       JCheckBox cb = new JCheckBox("Checkbox" + i, i == 2);
       cb.addItemListener(this);
       panel.add(cb);
     }
     getContentPane().add(panel, BorderLayout.CENTER);
   }
 
   public void itemStateChanged(ItemEvent e)
   {
     JCheckBox cb = (JCheckBox)e.getSource();
     int change = e.getStateChange();
     if (change == ItemEvent.SELECTED) {
       System.out.println(cb.getText() + ": SELECTED");
     } else if (change == ItemEvent.DESELECTED) {
       System.out.println(cb.getText() + ": DESELECTED");
     }
   }
 
   public static void main(String[] args)
   {
     TestJCheckbox frame = new TestJCheckbox();
     frame.setLocation(100, 100);
     frame.setSize(300, 100);
     frame.setVisible(true);
   }
 }