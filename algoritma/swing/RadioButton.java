import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;

//*
// Another way to handle Jframe and component without creating a class that implements ActionListener
// like using addActionListener in the main method with a single lambda expression 
// */

public class RadioButton {
   public static void main(String[] args) {
      JRadioButton pizzaButton = new JRadioButton();
      JRadioButton hamburgerButton = new JRadioButton();
      JRadioButton hotdogButton = new JRadioButton();

      JFrame frame = new JFrame();
      frame.setLayout(new FlowLayout());

      pizzaButton.setText("Pizza");
      pizzaButton.addActionListener(e -> {
         JOptionPane.showMessageDialog(null, "Pizza Selected");
      });

      hamburgerButton.setText("Hamburger");
      hamburgerButton.addActionListener(e -> {
         JOptionPane.showMessageDialog(null, "Hamburger Selected");
      });

      hotdogButton.setText("Hotdog");
      hotdogButton.addActionListener(e -> {
         JOptionPane.showMessageDialog(null, "Hotdog Selected");
      });

      ButtonGroup group = new ButtonGroup();
      group.add(pizzaButton);
      group.add(hamburgerButton);
      group.add(hotdogButton);

      frame.add(pizzaButton);
      frame.add(hamburgerButton);
      frame.add(hotdogButton);
      frame.pack();
      frame.setVisible(true);
   }
}
