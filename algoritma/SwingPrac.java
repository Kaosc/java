package algoritma;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings({ "unchecked", "rawtypes" })

class Prac4 extends JFrame implements ActionListener {
   String[][] data = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

   JTextArea ta = new JTextArea();
   JCheckBox cb = new JCheckBox("Confirm");
   JButton btn = new JButton("Submit");

   public Prac4() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLayout(new FlowLayout());
      this.setPreferredSize(new Dimension(200, 250));

      ta.setPreferredSize(new Dimension(150, 150));
      btn.addActionListener(this);

      this.add(ta);
      this.add(cb);
      this.add(btn);

      this.pack();
      this.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == btn) {
         ta.setText(""); // Metin alanını temizle

         if (cb.isSelected()) {
            // Onay kutusu işaretli ise sadece köşegen elemanlarını yazdır
            for (int i = 0; i < data.length; i++) {
               for (int j = 0; j < data[i].length; j++) {
                  if (i == j) {
                     ta.append(data[i][j] + "  "); // Köşegen elemanını ekle
                  } else {
                     ta.append("  "); // Köşegen dışındaki elemanlar için tab ekle
                  }
               }
               ta.append("\n"); // Satır sonu
            }
         } else {
            // Onay kutusu işaretli değilse tüm matris elemanlarını yazdır
            for (String[] row : data) {
               for (String element : row) {
                  ta.append(element + "  "); // Elemanı ekle
               }
               ta.append("\n"); // Satır sonu
            }
         }
      }

      this.pack();
   }

   public static void main(String[] args) {
      new Prac4();
   }
}

@SuppressWarnings({ "unchecked", "rawtypes" })

class Prac3 extends JFrame implements ActionListener {
   private String[] cities = { "Ankara", "Istanbul", "Antalya", "Bursa", "Izmir", "Konya", "Adana" };

   JTextField tf = new JTextField();
   JButton btn = new JButton("Submit");

   DefaultListModel mod = new DefaultListModel();
   JList list = new JList(mod);

   public Prac3() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLayout(new FlowLayout());
      this.setPreferredSize(new Dimension(200, 400));

      tf.setPreferredSize(new Dimension(150, 40));
      list.setPreferredSize(new Dimension(150, 250));
      btn.addActionListener(this);

      this.add(tf);
      this.add(btn);
      this.add(list);

      this.pack();
      this.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == btn) {
         mod.clear();

         for (String c : cities) {
            if (c.toLowerCase().contains(tf.getText().trim().toLowerCase())) {
               mod.addElement(c);
            }
         }

         if (mod.isEmpty()) {
            mod.addElement("No city found");
         }

         this.pack();
      }
   }

   public static void main(String[] args) {
      new Prac3();
   }
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
