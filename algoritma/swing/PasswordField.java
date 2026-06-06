import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordField {

    public static void main(String[] args) {
        // 1. Setup the Frame (similar to Frame.java reference)
        JFrame frame = new JFrame("JPasswordField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new BorderLayout()); // Using BorderLayout for simplicity

        // 2. Setup the Panel (similar to Panel.java reference)
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // Using FlowLayout inside the panel

        // Components
        JLabel label = new JLabel("Enter Password:");
        JPasswordField passwordField = new JPasswordField(15); // Create the JPasswordField
        JButton submitButton = new JButton("Submit");

        // Add components to the panel
        panel.add(label);
        panel.add(passwordField);
        panel.add(submitButton);

        // 3. Implement Action Listener (similar to Button.java reference)
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve the password from JPasswordField
                String password = new String(passwordField.getPassword());

                // Display the retrieved password in a message dialog
                JOptionPane.showMessageDialog(frame, "Password entered: " + password);
            }
        });

        // Add panel to frame and make visible
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}