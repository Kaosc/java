import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
   MyFrame() {
      this.setVisible(true);
      this.setSize(400, 400);
      this.setLayout(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}

public class Button {
   public static void main(String[] args) {
      JFrame frame = new MyFrame();

      JButton button = new JButton("Click Me");
      button.setBounds(150, 150, 100, 50);
      button.addActionListener(e -> {
         System.out.println("Button clicked!");
      });

      frame.add(button);
   }
}
