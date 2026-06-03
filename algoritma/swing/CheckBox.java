import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

class CheckBoxFrame extends JFrame implements ActionListener {
   JCheckBox checkBox = new JCheckBox();
   JButton button = new JButton();

   CheckBoxFrame() {
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setLayout(new FlowLayout());

      checkBox.setText("I'm not a robot");
      checkBox.setFont(checkBox.getFont().deriveFont(24f));
      checkBox.addActionListener(this);

      button.setText("Submit");
      button.addActionListener(this);

      this.add(checkBox);
      this.add(button);
      this.pack();
      this.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == button) {
         if (checkBox.isSelected()) {
            System.out.println("Not a robot!");
         } else {
            System.out.println("You are a robot!");
         }
      }
   }
}

public class CheckBox {
   public static void main(String[] args) {
      new CheckBoxFrame();
   }
}
