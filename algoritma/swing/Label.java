import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;

public class Label {
   public static void main(String[] args) {

      JLabel label = new JLabel();
      label.setText("Bro, do you even code?"); // set text of label
      label.setForeground(Color.white);
      label.setBounds(5, 5, 135, 40);
      label.setBackground(Color.BLACK);
      label.setOpaque(true); // display background color of label
      label.setFocusable(true); // allow label to receive focus and key events

      label.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e ) {
            System.out.println("Key pressed");
         }
         @Override
         public void keyReleased(KeyEvent e) {
            System.out.println("Key released");
         }  
         @Override
         public void keyTyped(KeyEvent e) {
            System.out.println("Key typed");
         }
      });

      label.addMouseListener(new MouseListener() {
         @Override
         public void mouseClicked(java.awt.event.MouseEvent e) {
            System.out.println("Mouse clicked!");
         }

         @Override
         public void mousePressed(java.awt.event.MouseEvent e) {
            System.out.println("Mouse pressed!");
         }

         @Override
         public void mouseReleased(java.awt.event.MouseEvent e) {
            System.out.println("Mouse released!");
         }

         @Override
         public void mouseEntered(java.awt.event.MouseEvent e) {
            System.out.println("Mouse entered!");
         }

         @Override
         public void mouseExited(java.awt.event.MouseEvent e) {
            System.out.println("Mouse exited!");
         }
      });

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