import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class NewWindow {
   // Create a new window (JFrame) and a label to display the message
   JFrame frame = new JFrame();
   JLabel label = new JLabel();

   public NewWindow(String title, String message) {
      // Configure the new window
      frame.setTitle(title);
      frame.setSize(400, 400);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.setVisible(true);

      // Create and configure the label
      label.setText(message);
      label.setBounds(50, 50, 300, 30);
      label.setHorizontalAlignment(JLabel.CENTER);
      label.setFont(label.getFont().deriveFont(23f));

      frame.add(label);
   }
}

class MainWindow implements ActionListener {
   // Create the main window and two buttons to open new windows
   JFrame frame = new JFrame();
   JButton myButton = new JButton("Open New Window 1");
   JButton myButton2 = new JButton("Open New Window 2");

   MainWindow() {
      // Configure the main window
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(400, 400);
      frame.setLayout(null);
      frame.setVisible(true);

      // Configure the buttons and add action listeners
      myButton.setSize(200, 50);
      myButton.setBounds(100, 125, 200, 50);
      myButton.addActionListener(this);

      // Configure the second button
      myButton2.setSize(200, 50);
      myButton2.setBounds(100, 200, 200, 50);
      myButton2.addActionListener(this);

      // Add the buttons to the main window
      frame.add(myButton);
      frame.add(myButton2);
   }

   // Handle button clicks to open new windows
   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == myButton) {
         frame.dispose(); // Close the main window
         new NewWindow("New Window 1", "This is the first new window.");
      } else if (e.getSource() == myButton2) {
         frame.dispose(); // Close the main window
         new NewWindow("New Window 2", "This is the second new window.");
      }
   }
}

public class OpenNewWindow {
   public static void main(String[] args) {
      new MainWindow();
   }
}