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
				sonuc = y - 1;
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
				sonuc = y + 1;
				L2.setText(String.valueOf(sonuc));

			}
		});
		b1.setBounds(30, 80, 80, 80);
		contentPane.add(b1);
	}
}
