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
