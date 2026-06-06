# Swingders Java Examples

This document combines the contents of all Java files from `algoritma/swingders`.

---

## A1.java
```java
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;

public class A1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel c;

	/**
	 * Launch the application.
	 */

	// metot

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					A1 frame = new A1();

					// A1 f=new A1();
					// f.setResizable(false);

					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public A1() {
		setEnabled(false);
		setTitle("Otomasyon1");
		setResizable(true);
		setForeground(new Color(255, 255, 255));

		setBackground(new Color(228, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 636, 439);

		c = new JPanel();
		c.setToolTipText("Panel1");
		c.setBackground(new Color(255, 0, 128));
		c.setForeground(new Color(255, 0, 0));
		c.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(c);
		c.setLayout(null);

		JLabel l1 = new JLabel();
		l1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		l1.setForeground(new Color(255, 255, 255));
		l1.setText("Panel1");
		l1.setBounds(45, 47, 160, 19);
		c.add(l1);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(45, 70, 165, 232);
		c.add(panel);
		panel.setLayout(null);

		JLabel lblAdnz = new JLabel();
		lblAdnz.setToolTipText("Panel1");
		lblAdnz.setEnabled(false);
		lblAdnz.setBounds(0, 22, 53, 19);
		lblAdnz.setText("Adınız");
		lblAdnz.setForeground(Color.WHITE);
		lblAdnz.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblAdnz);

		JLabel lblSoyAdnz = new JLabel();
		lblSoyAdnz.setBounds(0, 53, 109, 19);
		lblSoyAdnz.setText("Soyadınız");
		lblSoyAdnz.setForeground(Color.WHITE);
		lblSoyAdnz.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblSoyAdnz);

		JLabel l1_2 = new JLabel();
		l1_2.setText("Panel2");
		l1_2.setForeground(Color.WHITE);
		l1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l1_2.setBounds(241, 47, 160, 19);
		c.add(l1_2);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 128));
		panel_1.setBounds(241, 70, 165, 232);
		c.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblBoy = new JLabel();
		lblBoy.setBounds(10, 21, 36, 19);
		lblBoy.setText("Boy");
		lblBoy.setForeground(Color.WHITE);
		lblBoy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblBoy);

		JLabel lblAdnz_1_1 = new JLabel();
		lblAdnz_1_1.setText("Kilo");
		lblAdnz_1_1.setForeground(Color.WHITE);
		lblAdnz_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAdnz_1_1.setBounds(10, 53, 36, 19);
		panel_1.add(lblAdnz_1_1);

	}
}
```

---

## A10.java
```java
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class A10 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A10 frame = new A10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public A10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		t1 = new JTextField();
		t1.setColumns(10);
		t1.setBounds(40, 21, 86, 20);
		contentPane.add(t1);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(40, 52, 86, 20);
		contentPane.add(t2);
		/* YES_OPTION=0, NO_OPTION=1, CANCEL__OPTION=2, CLOSED_OPTION=-1 */
		JButton btnIlemSe = new JButton("İşlem Seç");
		btnIlemSe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int sonuc = JOptionPane.showConfirmDialog(null, "Çarpma için Evet Bölme için Hayır Seçiniz");
				if (sonuc == JOptionPane.YES_OPTION) {
					int sn = a * b;
					JOptionPane.showMessageDialog(null, String.valueOf(sn));
				} else if (sonuc == 1) {
					int sn = a / b;
					JOptionPane.showMessageDialog(null, String.valueOf(sn));
				}

				else if (sonuc == 2) {
					JOptionPane.showMessageDialog(null, "İşlem İptal Edildi", "İptal", 2);
				} else {
					JOptionPane.showMessageDialog(null, "Pencere Kapatıldı", "Uyarı", 0);
				}
				String secenekler[] = { "Kırmızı", "Mavi", "Beyaz" };

				JOptionPane.showOptionDialog(null, "Ne yapmak istersiniz", "İşlem", JOptionPane.DEFAULT_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null,
						secenekler, secenekler[1]);

			}
		});
		btnIlemSe.setBounds(37, 100, 89, 23);
		contentPane.add(btnIlemSe);

	}

}
```

---

## A12.java
```java
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class A12 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A12 frame = new A12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public A12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel l1 = new JLabel("New label");
		l1.setBounds(119, 174, 207, 58);
		contentPane.add(l1);

		JToggleButton tglbtnNewToggleButton = new JToggleButton("MAVİ");
		tglbtnNewToggleButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Maviye tıklandı");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				l1.setText("Mavinin Üzerine Gelindi");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				l1.setText("Maviden ayrıldı");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				l1.setText("Maviye Basılı");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				l1.setText("Mavi bırakıldı");
			}
		});
		tglbtnNewToggleButton.setBackground(new Color(0, 0, 255));
		tglbtnNewToggleButton.setBounds(139, 41, 121, 97);
		contentPane.add(tglbtnNewToggleButton);

		JToggleButton tglbtnKrmz = new JToggleButton("KIRMIZI");
		tglbtnKrmz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				l1.setText("Kırmızıya tıklandı");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				l1.setText("Kırmızının Üzerine Gelindi");
			}

			@Override
			public void mouseExited(MouseEvent e) {

				l1.setText("Kırmızının Dışına Çıkıldı");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				l1.setText("Kırmızıya Basılı");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				l1.setText("Kırmızı bırakıldı");
			}
		});

		tglbtnKrmz.setBackground(new Color(255, 0, 0));
		tglbtnKrmz.setBounds(8, 41, 121, 97);
		contentPane.add(tglbtnKrmz);

		JToggleButton tglbtnNewToggleButton_1_1 = new JToggleButton("YEŞİL");
		tglbtnNewToggleButton_1_1.setBackground(new Color(0, 128, 64));
		tglbtnNewToggleButton_1_1.setBounds(270, 41, 121, 97);
		contentPane.add(tglbtnNewToggleButton_1_1);

	}
}
```

---

## A13.java
```java
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class A13 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A13 frame = new A13();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public A13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel l1 = new JLabel("Bir tuşa basın");
		l1.setBounds(76, 11, 321, 57);
		contentPane.add(l1);

		JLabel l2 = new JLabel("Bir tuşa basın");
		l2.setBounds(76, 67, 321, 57);
		contentPane.add(l2);

		JLabel l3 = new JLabel("Bir tuşa basın");
		l3.setBounds(76, 128, 321, 57);
		contentPane.add(l3);

		JLabel l4 = new JLabel("Bir tuşa basın");
		l4.setBounds(76, 193, 321, 57);
		contentPane.add(l4);

		setFocusable(true);
		requestFocus();

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				l1.setText(e.getKeyChar() + " Tuşuna Basıldı");
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {

					l3.setText("Escape Tuşuna Basıldı");
				}

				else if (e.getKeyCode() == KeyEvent.VK_ENTER)

				{
					l3.setText("ENTER Tuşuna Basıldı");
				}

				else if (e.getKeyCode() == KeyEvent.VK_SHIFT)

				{
					l3.setText("SHIFT Tuşuna Basıldı");
				} else {
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				l2.setText(e.getKeyChar() + " Tuş Bırakıldı");
			}

			public void keyTyped(KeyEvent e)

			{
				l4.setText(e.getKeyChar() + " Tuş Basıldı");
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {

					l4.setText("Escape Tuşuna Basıldı");
				}
			}

		});

		// getKeyChar() Hangi tuşa basıldıysa o karakteri döndürür
		// getKeyCode() Tuş kodunu döndürür.
		// isLetter() isDigit()

	}
}
```

---

## A14.java
```java
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class A14 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A14 frame = new A14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public A14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel l1 = new JLabel("Kullanıcı Adı");
		l1.setBounds(10, 59, 80, 14);
		contentPane.add(l1);

		t1 = new JTextField();
		t1.setBounds(100, 56, 86, 20);
		contentPane.add(t1);
		t1.setColumns(10);

		p1 = new JPasswordField();
		p1.setBounds(100, 101, 86, 20);
		contentPane.add(p1);

		JLabel lblifre = new JLabel("Şifre");
		lblifre.setBounds(10, 104, 80, 14);
		contentPane.add(lblifre);
		JButton b1 = new JButton("Devam Et");
		b1.setBounds(97, 189, 89, 23);
		contentPane.add(b1);

		b1.setEnabled(false);

		JCheckBox c = new JCheckBox("Okudum, anladım, onaylıyorum.");
		c.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				boolean sevval;
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					sevval = false;

				}

				else {
					sevval = true;
				}

				b1.setEnabled(sevval);
			}
		});
		c.setBounds(20, 152, 204, 23);
		contentPane.add(c);

	}
}
```

---

## A2.java
```java
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class A2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JTextField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A2 frame = new A2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public A2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		t1 = new JTextField();
		t1.setBounds(103, 34, 127, 20);
		contentPane.add(t1);
		t1.setColumns(10);

		JLabel lblNewLabel = new JLabel("Kullanıcı Adı");
		lblNewLabel.setBounds(19, 37, 71, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Şifre");
		lblNewLabel_1.setBounds(19, 79, 46, 14);
		contentPane.add(lblNewLabel_1);
		JLabel l1 = new JLabel("");
		l1.setBounds(86, 101, 180, 23);
		l1.setForeground(new Color(255, 0, 0));
		contentPane.add(l1);

		JButton b1 = new JButton("Oturum Aç");
		b1.setBounds(96, 137, 89, 23);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				A3 fj = new A3();

				if (t1.getText().equals("Seda") && (p1.getText().equals("s33")))

				{
					fj.setVisible(true);

				} else {
					l1.setText("Yanlış Şifre ya da Kullanıcı Adı");
				}

			}
		});
		contentPane.add(b1);

		p1 = new JTextField();
		p1.setBounds(103, 76, 127, 20);
		contentPane.add(p1);
		p1.setColumns(10);

	}
}
```

---

## A3.java
```java
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class A3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			try {
				A3 frame = new A3();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public A3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OTURUM BAŞARIYLA AÇILDI");
		lblNewLabel.setBounds(152, 68, 158, 100);
		contentPane.add(lblNewLabel);
	}

}
```

---

## A4.java
```java
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class A4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A4 frame = new A4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	static boolean kontrol(JCheckBox c2) {
		return c2.isSelected();
	}

	public A4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox<String> co1 = new JComboBox<>();
		co1.setModel(new DefaultComboBoxModel<>(new String[] { "Zonguldak", "Adıyaman", "Balıkesir", "Çorum",
				"Diyarbakır", "Elazığ", "Giresun", "Hatay", "Iğdır" }));
		co1.setMaximumRowCount(3);

		co1.setBounds(136, 11, 166, 22);
		contentPane.add(co1);

		JCheckBox c1 = new JCheckBox("Okudum, Anladım.");
		c1.setBounds(132, 50, 206, 23);
		contentPane.add(c1);

		JRadioButton r1 = new JRadioButton("Kadın");
		r1.setBounds(132, 125, 109, 23);
		contentPane.add(r1);

		JRadioButton r2 = new JRadioButton("Erkek");
		r2.setBounds(250, 125, 109, 23);
		contentPane.add(r2);

		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		JRadioButton r3 = new JRadioButton("Evli");
		r3.setBounds(132, 160, 109, 23);
		contentPane.add(r3);

		JRadioButton r4 = new JRadioButton("Bekar");
		r4.setBounds(250, 160, 109, 23);
		contentPane.add(r4);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(r3);
		bg1.add(r4);

		JTextArea t5 = new JTextArea();
		t5.setLineWrap(true);
		t5.setBounds(136, 190, 176, 51);
		contentPane.add(t5);

		JCheckBox c2 = new JCheckBox("Kabul ediyorum.");
		c2.setHorizontalAlignment(SwingConstants.LEFT);
		c2.setBounds(132, 82, 109, 23);
		contentPane.add(c2);

		/*
		 * if(kontrol(c2)) {btnNewButton.setEnabled(true);} 
		 * else {btnNewButton.setEnabled(false);} 
		 */

		JLabel l1 = new JLabel("New label");
		l1.setBounds(398, 50, 147, 139);
		contentPane.add(l1);
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// l1.setText(co1.getSelectedIndex());
				String s = String.valueOf(co1.getSelectedItem())
						+ " " + String.valueOf(co1.getSelectedIndex());
				l1.setText(s);

				if (c1.isSelected()) {
					l1.setText("Sözleşme okundu");
				} else {
					l1.setText("Sözleşme okunmadı");
				}

				if (c2.isSelected()) {
					l1.setText("Sözleşme Kabul edildi");
				} else {
					l1.setText("Sözleşme Kabul edilmedi");
				}
				if (r3.isSelected()) {
					l1.setText("Evli seçildi");
				}
				;

			}
		});
		btnNewButton.setBounds(168, 252, 89, 23);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("CheckBox");
		lblNewLabel_1.setBounds(32, 54, 94, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("CheckBox");
		lblNewLabel_1_1.setBounds(32, 86, 94, 14);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("RadioButton");
		lblNewLabel_1_2.setBounds(32, 129, 94, 14);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("TextArea");
		lblNewLabel_1_3.setBounds(32, 203, 94, 14);
		contentPane.add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("ComboBox");
		lblNewLabel_1_4.setBounds(32, 15, 94, 14);
		contentPane.add(lblNewLabel_1_4);

	}
}
```

---

## A5.java
```java
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class A5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A5 frame = new A5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public A5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
```

---

## A6.java
```java
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class A6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A6 frame = new A6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public A6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JToggleButton tg = new JToggleButton("Aç/Kapa");
		tg.setBounds(10, 11, 121, 23);
		contentPane.add(tg);

		JFormattedTextField ft = new JFormattedTextField(NumberFormat.getIntegerInstance());
		// ft.setText("100");
		ft.setValue(3000);
		ft.setBounds(10, 88, 121, 20);
		contentPane.add(ft);

		JTextPane tp = new JTextPane();
		tp.setBounds(156, 11, 98, 55);
		contentPane.add(tp);

		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(270, 122, 121, 58);
		contentPane.add(editorPane);

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(10, -12, 12, 1));
		spinner.getValue();
		spinner.setValue(30);
		spinner.setBounds(10, 143, 58, 37);
		contentPane.add(spinner);

		JList<String> list = new JList<>();
		list.setBounds(156, 122, 79, 58);
		contentPane.add(list);

		table = new JTable();
		table.setBounds(300, 50, 49, 29);
		contentPane.add(table);

		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(257, 190, 146, 14);
		contentPane.add(progressBar);

		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(396, 60, 17, 48);
		contentPane.add(scrollBar);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 191, 101, 37);
		contentPane.add(separator);

		JSlider slider = new JSlider();
		slider.setBounds(20, 215, 200, 26);
		contentPane.add(slider);
		JLabel l1 = new JLabel("Durum");
		l1.setBounds(156, 8, 116, 29);
		contentPane.add(l1);
		JButton btnNewButton = new JButton("Durum");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (tg.isSelected()) {
					l1.setText("Buton Aktif");
				} else {
					l1.setText("Buton Seçilmedi");
				}
			
			}
		});
		btnNewButton.setBounds(22, 45, 89, 23);
		contentPane.add(btnNewButton);

	}
}
```

---

## A7.java
```java
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class A7 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A7 frame = new A7();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public A7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel L1 = new JLabel("SAYI");
		L1.setBounds(30, 41, 46, 14);
		contentPane.add(L1);

		JLabel L2 = new JLabel("0");
		L2.setBounds(86, 35, 76, 26);
		contentPane.add(L2);

		JButton b2 = new JButton("Azalt");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int sonuc = 0, y;
				String s = L2.getText();
				y = Integer.parseInt(s);
				onuc = y - 1;
				L2.setText(String.valueOf(sonuc));
			}
		});
		b2.setBounds(156, 80, 80, 80);
		contentPane.add(b2);

		JButton b1 = new JButton("Arttır");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sonuc = 0, y;
				String s = L2.getText();
				y = Integer.parseInt(s);
				onuc = y + 1;
				L2.setText(String.valueOf(sonuc));

			}
		});
		b1.setBounds(30, 80, 80, 80);
		contentPane.add(b1);
	}
}
```

---

## A8.java
```java
import java.awt.EventQueue;
// import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class A8 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A8 frame = new A8();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public A8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		t1 = new JTextField();
		t1.setBounds(60, 11, 86, 20);
		contentPane.add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setBounds(60, 42, 86, 20);
		contentPane.add(t2);
		t2.setColumns(10);

		JComboBox<String> c1 = new JComboBox<>();
		c1.setModel(new DefaultComboBoxModel<>(new String[] { "Toplama", "Çıkarma" }));
		c1.setBounds(60, 73, 86, 22);
		contentPane.add(c1);
		JLabel l1 = new JLabel("");
		l1.setBounds(60, 106, 86, 27);
		contentPane.add(l1);

		JButton btnNewButton = new JButton("İşlem Yap");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				if ((String.valueOf(c1.getSelectedItem())).equals("Toplama")) {
					int sonuc = 0;
					sonuc = a + b;
					l1.setText(String.valueOf(sonuc));
					JOptionPane.showMessageDialog(null, String.valueOf(sonuc));
				}

				else if (c1.getSelectedIndex() == 1) {
					int sonuc = a - b;
					l1.setText(String.valueOf(sonuc));
					JOptionPane.showMessageDialog(null, String.valueOf(sonuc));

				}

				else {
					l1.setText("Uygun işlem seçilmedi");
				}
			}
		});
		btnNewButton.setBounds(57, 151, 89, 23);
		contentPane.add(btnNewButton);

	}
}
```

---

## A9.java
```java
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class A9 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A9 frame = new A9();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public A9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel l1 = new JLabel("");
		l1.setBounds(299, 118, 46, 14);
		contentPane.add(l1);

		JButton btnNewButton = new JButton("OYUNA BAŞLA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s;
				int tahmin = (int) (Math.random() * 100) + 1;
				l1.setText(String.valueOf(tahmin));
				for (int i = 1; i <= 3; i++) {

					s = JOptionPane.showInputDialog("Değeri Giriniz");
					if (tahmin == Integer.parseInt(s)) {
						JOptionPane.showMessageDialog(null, "Tebrikler buldunuz");
						break;
					} else {
						JOptionPane.showMessageDialog(null, "Bulamadınız Tekrar Deneyin");
					}
				}

				JOptionPane.showMessageDialog(null, String.valueOf(tahmin));
			}
		});
		;
		btnNewButton.setBounds(151, 114, 121, 23);
		contentPane.add(btnNewButton);

	}

}
```

---

## Sayac.java
```java
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sayac extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sayac frame = new Sayac();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sayac() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel l1 = new JLabel("5");
		l1.setBounds(159, 69, 119, 109);
		contentPane.add(l1);

		JButton btnNewButton = new JButton("Başlat");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (int i = 5; i >= 0; i--) {
					l1.setText(String.valueOf(i));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}

			}
		});
		btnNewButton.setBounds(139, 169, 89, 23);
		contentPane.add(btnNewButton);
	}
}
```

---

## Missing files
- `A11.java` was not found in `algoritma/swingders` at the time of reading.


---

End of document.
