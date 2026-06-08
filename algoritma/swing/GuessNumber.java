import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessNumber extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuessNumber frame = new GuessNumber();
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
	public GuessNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("OYUNA BAŞLA");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s;
				int tahmin = (int) (Math.random() * 5) + 1;

				for (int i = 1; i <= 3; i++) {
					s = JOptionPane.showInputDialog("Değeri Giriniz (1-5) " + i + ". Tahmininiz: ");
					if (tahmin == Integer.parseInt(s)) {
						JOptionPane.showMessageDialog(null, "Tebrikler buldunuz: " + tahmin);
						break;
					} else {
						JOptionPane.showMessageDialog(null, "Bulamadınız Tekrar Deneyin");
					}
				}
			}
		});

		btnNewButton.setBounds(151, 114, 121, 23);
		contentPane.add(btnNewButton);
	}
}
