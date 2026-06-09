import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Listeners {
   public static void main(String[] args) {

      JLabel label = new JLabel();
      label.setText("Bro, do you even code?"); // set text of label
      label.setForeground(Color.white);
      label.setPreferredSize(new Dimension(400, 300));
      label.setBackground(Color.BLACK);
      label.setOpaque(true); // display background color of label
      // center label text
      label.setHorizontalAlignment(JLabel.CENTER);

      label.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
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
         public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse clicked!");
         }

         @Override
         public void mousePressed(MouseEvent e) {
            System.out.println("Mouse pressed!");
         }

         @Override
         public void mouseReleased(MouseEvent e) {
            System.out.println("Mouse released!");
         }

         @Override
         public void mouseEntered(MouseEvent e) {
            System.out.println("Mouse entered!");
         }

         @Override
         public void mouseExited(MouseEvent e) {
            System.out.println("Mouse exited!");
         }
      });

      ///////////////////////////////////////////////////////////////////////////

      JFrame frame = new JFrame();
      frame.setVisible(true);
      frame.setSize(400, 300);
      frame.setLayout(new BorderLayout());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setBackground(Color.BLACK);

      frame.addWindowListener(new WindowListener() {
         @Override
         public void windowOpened(WindowEvent e) {
            System.out.println("Window opened!");
         }

         @Override
         public void windowClosing(WindowEvent e) {
            System.out.println("Window closing!");
         }

         @Override
         public void windowClosed(WindowEvent e) {
            System.out.println("Window closed!");
         }

         @Override

         public void windowIconified(WindowEvent e) {
            System.out.println("Window minimized!");
         }

         @Override
         public void windowDeiconified(WindowEvent e) {
            System.out.println("Window restored!");
         }

         @Override
         public void windowActivated(WindowEvent e) {
            System.out.println("Window activated!");
         }

         @Override
         public void windowDeactivated(WindowEvent e) {
            System.out.println("Window deactivated!");
         }
      });

      frame.add(label);
   }
}