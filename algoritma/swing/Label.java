import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

public class Label {
   public static void main(String[] args) {

      JLabel label = new JLabel();
      label.setText("Bro, do you even code?"); // set text of label
      label.setForeground(Color.white);
      label.setBounds(5, 5, 135, 40);
      label.setBackground(Color.BLACK);
      label.setOpaque(true); // display background color of label

      ///////////////////////////////////////////////////////////////////////////

      JFrame frame = new JFrame();
      frame.setVisible(true);
      frame.setSize(400, 300);
      frame.setLayout(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setBackground(Color.BLACK);

      frame.add(label);
   }
}