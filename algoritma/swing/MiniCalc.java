import java.awt.EventQueue;
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

public class MiniCalc extends JFrame {

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
					MiniCalc frame = new MiniCalc();
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
	
	public MiniCalc() {
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
				int a = 0, b = 0;

				try {
					a = Integer.parseInt(t1.getText());
					b = Integer.parseInt(t2.getText());
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Lütfen sayı giriniz.");
					return;
				}

				if ((String.valueOf(c1.getSelectedItem())).equals("Toplama")) {
					int sonuc = a + b;
					l1.setText(String.valueOf(sonuc));
					JOptionPane.showMessageDialog(null, String.valueOf(sonuc));
				} else {
					int sonuc = a - b;
					l1.setText(String.valueOf(sonuc));
					JOptionPane.showMessageDialog(null, String.valueOf(sonuc));
				}

			}
		});

		btnNewButton.setBounds(57, 151, 89, 23);
		contentPane.add(btnNewButton);
	}
}
