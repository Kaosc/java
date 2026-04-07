package algoritma.swing;

import javax.swing.*;

public class Swing {
   private JFrame frame;
   private JButton button;


   // Simple form that takes user age via textfield and displays birth year
   public Swing() {
      frame = new JFrame("Swing Example");
      button = new JButton("Calculate Birth Year");

      JTextField ageField = new JTextField(10);
      JLabel resultLabel = new JLabel("");

      button.addActionListener(e -> {
         try {
            int age = Integer.parseInt(ageField.getText());
            int birthYear = java.time.Year.now().getValue() - age;
            resultLabel.setText("Your birth year is: " + birthYear);
         } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter a valid number.");
         }
      });

      JPanel panel = new JPanel();
      panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 300, 400));
      panel.add(new JLabel("Enter your age:"));
      panel.add(ageField);
      panel.add(button);
      panel.add(resultLabel);

      frame.setContentPane(panel);
      frame.pack();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }


   public static void main(String[] args) {
      new Swing();
   }
}