import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerr extends JFrame implements KeyListener {
   JLabel label = new JLabel();

   KeyListenerr() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(500, 500);
      this.setLayout(null);
      this.addKeyListener(this);

      label.setBounds(0, 0, 100, 100);
      label.setBackground(Color.RED);
      label.setOpaque(true);

      this.add(label);
      this.setVisible(true);
   }

   // Move with WASD
   @Override
   public void keyTyped(KeyEvent e) {
      switch (e.getKeyChar()) {
         case 'a':
            label.setLocation(label.getX() - 10, label.getY());
            break;
         case 'w':
            label.setLocation(label.getX(), label.getY() - 10);
            break;
         case 's':
            label.setLocation(label.getX(), label.getY() + 10);
            break;
         case 'd':
            label.setLocation(label.getX() + 10, label.getY());
            break;
      }
   }

   // Move with arrow keys
   @Override
   public void keyPressed(KeyEvent e) {
      switch (e.getKeyCode()) {
         case 37:
            label.setLocation(label.getX() - 10, label.getY());
            break;
         case 38:
            label.setLocation(label.getX(), label.getY() - 10);
            break;
         case 40:
            label.setLocation(label.getX(), label.getY() + 10);
            break;
         case 39:
            label.setLocation(label.getX() + 10, label.getY());
            break;
      }
   }

   @Override
   public void keyReleased(KeyEvent e) {
   }

   public static void main(String[] args) {
      new KeyListenerr();
   }
}
