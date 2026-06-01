import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;

public class Panel {
   public static void main(String[] args) {

      // Panel = a GUI component that can hold other components

      JPanel redPanel = new JPanel();
      redPanel.setBounds(0, 0, 100, 100);
      redPanel.setBackground(Color.RED);

      JPanel bluePanel = new JPanel();
      bluePanel.setBounds(100, 0, 100, 100);
      bluePanel.setBackground(Color.BLUE);

      JPanel greenPanel = new JPanel();
      greenPanel.setBounds(0, 100, 200, 100);
      greenPanel.setBackground(Color.GREEN);

      JLabel label = new JLabel();
      label.setText("ALO");
      label.setForeground(Color.WHITE);

      ///////////////////////////////////////////////////////////////////////////

      JFrame frame = new JFrame();
      frame.setVisible(true);
      frame.setSize(400, 400);
      frame.setLayout(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setBackground(Color.BLACK);

      frame.add(redPanel);
      frame.add(bluePanel);
      frame.add(greenPanel);

      redPanel.add(label);
      // bluePanel.add(label);
      // greenPanel.add(label);
   }
}