import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerr extends JFrame implements MouseListener {
   JLabel label = new JLabel("IDLE");

   MouseListenerr() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(500, 400);
      this.setLayout(new BorderLayout(10, 10));
      this.setBackground(Color.RED);
      this.addMouseListener(this);

      label.setBackground(Color.BLACK);
      label.setForeground(Color.WHITE);
      label.setOpaque(true);
      label.setHorizontalAlignment(JLabel.CENTER);
      label.setFont(new Font("Arial", Font.BOLD, 30));

      this.add(label, BorderLayout.CENTER);
      this.setVisible(true);
   }

   @Override
   public void mouseClicked(MouseEvent e) {
      label.setText("CLIKED");
   }

   @Override
   public void mousePressed(MouseEvent e) {
      label.setText("PRESSED");
   }

   @Override
   public void mouseReleased(MouseEvent e) {
      label.setText("RELEASED");
   }

   @Override
   public void mouseEntered(MouseEvent e) {
      label.setText("ENTERED");
   }

   @Override
   public void mouseExited(MouseEvent e) {
      label.setText("EXITED");
   }

   public static void main(String[] args) {
      new MouseListenerr();
   }
}
