import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TextField extends JFrame implements ActionListener, KeyListener {
   JTextField textField = new JTextField();
   JButton button = new JButton();

   public TextField() {
      this.setTitle("Text Field Example");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLayout(new FlowLayout());
      this.setResizable(false);

      textField.setPreferredSize(new Dimension(250, 30));
      textField.setEditable(true);
      textField.addKeyListener(this);
      textField.setText(null);

      button.setPreferredSize(new Dimension(100, 30));
      button.setText("Click");
      button.setFocusable(false);
      button.addActionListener(this);
      button.setEnabled(false);

      this.add(textField);
      this.add(button);
      this.pack();
      this.setVisible(true);
   }

   @Override
   public void keyTyped(KeyEvent e) {
      if (e.getSource() == textField) {
         if (textField.getText().isBlank()) {
            button.setEnabled(false);
         } else {
            button.setEnabled(true);
         }
      }
   }

   @Override
   public void keyPressed(KeyEvent e) {
   }

   @Override
   public void keyReleased(KeyEvent e) {
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == button) {
         JOptionPane.showMessageDialog(null, textField.getText(), "Title", JOptionPane.INFORMATION_MESSAGE);
         this.dispose();
      }
   }

   public static void main(String[] args) {
      new TextField();
   }

}
