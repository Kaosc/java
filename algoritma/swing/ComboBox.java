import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox extends JFrame implements ActionListener {
   JComboBox<String> comboBox = new JComboBox<>();

   ComboBox() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLayout(new FlowLayout());

      comboBox.addItem("Dog");
      comboBox.addItem("Cat");
      comboBox.addItem("Bird");

      comboBox.addActionListener(this);
      comboBox.setSelectedIndex(1);

      // comboBox.removeItem("Bird");
      comboBox.removeItemAt(2);
      comboBox.insertItemAt("Bear", 2);

      this.add(comboBox);
      this.pack();
      this.setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {
      System.out.println(comboBox.getSelectedItem());
   }

   public static void main(String[] args) {
      new ComboBox();
   }
}
