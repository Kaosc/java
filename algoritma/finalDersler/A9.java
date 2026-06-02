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
				String	s;
				int tahmin=(int)(Math.random()*100)+1;
				l1.setText(String.valueOf(tahmin));
				for(int i=1;i<=3;i++) {
				
				s=JOptionPane.showInputDialog("Değeri Giriniz");
				if(tahmin==Integer.parseInt(s)) {
					JOptionPane.showMessageDialog(null, "Tebrikler buldunuz");
					break;
				}
				else {JOptionPane.showMessageDialog(null, "Bulamadınız Tekrar Deneyin");}}
				
				JOptionPane.showMessageDialog(null, String.valueOf(tahmin));
			}
		});;
		btnNewButton.setBounds(151, 114, 121, 23);
		contentPane.add(btnNewButton);
		
	
	}

}
