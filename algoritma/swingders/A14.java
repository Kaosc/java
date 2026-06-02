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
