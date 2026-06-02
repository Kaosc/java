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

		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] { "Toplama", "Çıkarma" }));
		c1.setBounds(60, 73, 86, 22);
		contentPane.add(c1);
		JLabel l1 = new JLabel("");
		l1.setBounds(60, 106, 86, 27);
		contentPane.add(l1);

		JButton btnNewButton = new JButton("İşlem Yap");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane p = new JOptionPane();
				// JOptionPane.showMessageDialog(null,"Hoşgeldiniz");
				// p.showMessageDialog(null, "Yeniden merhaba", "Karşılama", -1);
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				if ((String.valueOf(c1.getSelectedItem())).equals("Toplama")) {
					int sonuc = 0;
					sonuc = a + b;
					l1.setText(String.valueOf(sonuc));
					p.showMessageDialog(null, String.valueOf(sonuc));
				}

				else if (c1.getSelectedIndex() == 1) {
					int sonuc = a - b;
					l1.setText(String.valueOf(sonuc));
					p.showMessageDialog(null, String.valueOf(sonuc));

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
