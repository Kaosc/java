package algoritma;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings({ "unchecked", "rawtypes" })

class Prac6 extends JFrame implements ActionListener {
   JTextField tf = new JTextField("Kredi miktarı giriniz.");
   JComboBox cbTur = new JComboBox();
   JButton btn = new JButton("Hesapla");
   JTextArea txtArea = new JTextArea();

   public Prac6() {
      this.setLayout(new FlowLayout());
      this.setPreferredSize(new Dimension(250, 450));

      tf.setPreferredSize(new Dimension(200, 30));

      cbTur.addItem("Konut");
      cbTur.addItem("İhtiyaç");
      cbTur.addItem("Taşıt");

      btn.addActionListener(this);
      txtArea.setPreferredSize(new Dimension(200, 150));

      this.add(tf);
      this.add(cbTur);
      this.add(btn);
      this.add(txtArea);

      this.pack();
      this.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == btn) {
         int faiz = 0;
         int miktar = 0;

         try {
            miktar = Integer.parseInt(tf.getText());
         } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Geçersiz kredi miktarı", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
         }

         if (cbTur.getSelectedItem().equals("Konut")) {
            faiz = 15;
         }
         if (cbTur.getSelectedItem().equals("İhtiyaç")) {
            faiz = 25;
         }
         if (cbTur.getSelectedItem().equals("Taşıt")) {
            faiz = 20;
         }

         int totalPayBack = miktar + (miktar * faiz / 100);
         int taksit = totalPayBack / 12;

         txtArea.setText("Toplam Geri Ödeme Tutarı: " + totalPayBack);
         txtArea.append(("\nTaksit tutarı: " + taksit));
      }
   }

   public static void main(String[] args) {
      new Prac6();
   }
}

class Prac5 extends JFrame implements ActionListener {
   JRadioButton rbOfis = new JRadioButton("OFİS PC - 10000 TL");
   JRadioButton rbOyun = new JRadioButton("OYUN PC - 20000 TL");
   ButtonGroup rbGroup = new ButtonGroup();

   JCheckBox cbMonitor = new JCheckBox("Monitör + 3000 TL");
   JCheckBox cbKlavye = new JCheckBox("Klavye + 500 TL");
   JCheckBox cbHeadset = new JCheckBox("Kulaklık + 800 TL");

   JButton btn = new JButton("Hesapla");
   JTextArea txtArea = new JTextArea("Özet");

   public Prac5() {
      this.setLayout(new FlowLayout());
      this.setPreferredSize(new Dimension(300, 350));

      rbOfis.setSelected(true);
      rbGroup.add(rbOfis);
      rbGroup.add(rbOyun);
      txtArea.setPreferredSize(new Dimension(250, 200));
      btn.addActionListener(this);

      this.add(rbOfis);
      this.add(rbOyun);

      this.add(cbMonitor);
      this.add(cbKlavye);
      this.add(cbHeadset);

      this.add(btn);
      this.add(txtArea);

      this.pack();
      this.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == btn) {
         int total = 0;
         String pc = "";

         if (rbOfis.isSelected()) {
            total = 10000;
            pc = rbOfis.getText();
         } else {
            total = 20000;
            pc = rbOyun.getText();
         }

         txtArea.setText("Seçilen kasa: " + pc);

         if (cbMonitor.isSelected() || cbKlavye.isSelected() || cbHeadset.isSelected()) {
            txtArea.append("\nEk donanımlar:");
         }

         if (cbMonitor.isSelected()) {
            total += 3000;
            txtArea.append("\n- " + cbMonitor.getText());
         }

         if (cbKlavye.isSelected()) {
            total += 500;
            txtArea.append("\n- " + cbKlavye.getText());
         }

         if (cbHeadset.isSelected()) {
            total += 800;
            txtArea.append("\n- " + cbHeadset.getText());
         }

         txtArea.append("\n------------------\n");
         txtArea.append("TOPLAM TUTAR: " + total + " TL");

         this.pack();
      }
   }

   public static void main(String[] args) {
      new Prac5();
   }
}

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
