package algoritma;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


class Prac3 {
   
}

@SuppressWarnings({ "unchecked", "rawtypes" })

class Prac2 {
   public static void main(String[] args) {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new FlowLayout());

      JComboBox gun = new JComboBox();
      gun.setModel(new DefaultComboBoxModel(new String[] { "5", "6", "7" }));
      JComboBox ay = new JComboBox();
      ay.setModel(new DefaultComboBoxModel(new String[] { "5", "6", "7" }));
      JComboBox yil = new JComboBox();
      yil.setModel(new DefaultComboBoxModel(new String[] { "1999", "2000", "2001", "2027" }));

      JButton btn = new JButton("Submit");
      btn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            int g = Integer.parseInt(gun.getSelectedItem().toString());
            int a = Integer.parseInt(ay.getSelectedItem().toString());
            int y = Integer.parseInt(yil.getSelectedItem().toString());

            LocalDate bd = LocalDate.of(y, a, g);

            if (bd.isAfter(LocalDate.now())) {
               JOptionPane.showMessageDialog(null, "You cannot choose an future date", "Hata",
                     JOptionPane.ERROR_MESSAGE);
            } else {
               long diff = ChronoUnit.DAYS.between(bd, LocalDate.now());
               JOptionPane.showMessageDialog(null, "Days between your birth and today: " + diff);
            }
         }
      });

      frame.add(gun);
      frame.add(ay);
      frame.add(yil);
      frame.add(btn);

      frame.pack();
      frame.setVisible(true);
   }
}

class Prac1 {
   public static void main(String[] args) {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new FlowLayout());

      JTextField tf = new JTextField();
      tf.setPreferredSize(new Dimension(200, 30));

      JLabel lbl = new JLabel();
      lbl.setText("");

      JButton btn = new JButton();
      btn.setText("Submit");
      btn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String[] nums = tf.getText().split("\\/");
            int count = 0, avg = 0, total = 0;

            for (String num : nums) {
               total += Integer.parseInt(num);
               count++;
            }

            avg = total / count;
            count = 0;

            for (String num : nums) {
               if (Integer.parseInt(num) > avg) {
                  count++;
               }
            }

            lbl.setText("Avg: " + String.valueOf(avg) + ", Larger than avg count: " + String.valueOf(count));
            frame.pack();
         }
      });

      frame.add(tf);
      frame.add(btn);
      frame.add(lbl);
      frame.pack();
      frame.setVisible(true);
   }
}

public class SwingPrac {
   public static void main(String[] args) {

   }
}
