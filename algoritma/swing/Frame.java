import javax.swing.JFrame;

import java.awt.Color;

public class Frame {
   public static void main(String[] args) {

      // JFrame = a GUI window to add components to
      JFrame frame = new JFrame(); // create a frame

      frame.setVisible(true);
      frame.setSize(400, 300); // set x and y dimension
      frame.setLayout(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
      frame.getContentPane().setBackground(Color.BLACK); // change background color black

      frame.setTitle("My First GUI"); // set title of frame
      frame.setResizable(false); // prevent frame from being resized
      frame.getContentPane().setBackground(new Color(0, 0, 0)); // change background color using hex code
   }
}