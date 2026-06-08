import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class LogedInPage extends JFrame {
   JLabel label = new JLabel("You are logged in!");

   public LogedInPage() {
      this.setLayout(new BorderLayout());
      this.setSize(400, 400);
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      label.setHorizontalAlignment(JLabel.CENTER);
      label.setFont(label.getFont().deriveFont(23f));
      label.setForeground(Color.WHITE);
      label.setBackground(Color.BLACK);
      label.setOpaque(true);
      this.add(label);
      this.setVisible(true);
   }
}

public class Login extends JFrame {
   JTextField usernameField = new JTextField();
   JPasswordField passwordField = new JPasswordField();

   public Login() {
      this.setSize(400, 200);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLayout(null);

      JLabel usernameLabel = new JLabel("Username:");
      usernameLabel.setBounds(50, 30, 80, 25);
      this.add(usernameLabel);

      usernameField.setBounds(150, 30, 200, 25);
      this.add(usernameField);

      JLabel passwordLabel = new JLabel("Password:");
      passwordLabel.setBounds(50, 70, 80, 25);
      this.add(passwordLabel);

      passwordField.setBounds(150, 70, 200, 25);
      this.add(passwordField);

      JButton loginButton = new JButton("Login");
      loginButton.setBounds(150, 110, 100, 25);
      loginButton.addActionListener(e -> {
         String username = usernameField.getText();
         String password = new String(passwordField.getPassword());

         if (username.equals("1") && password.equals("1")) {
            new LogedInPage();
            this.dispose();
         } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials!", "Error", JOptionPane.ERROR_MESSAGE);
         }
      });
      this.add(loginButton);

      this.setVisible(true);
   }

   public static void main(String[] args) {
      new Login();
   }
}
