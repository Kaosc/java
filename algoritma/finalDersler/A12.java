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
				l1.setText("Maviye Basılı");}
			@Override
			public void mouseReleased(MouseEvent e) {
				l1.setText("Mavi bırakıldı");}
		});
		tglbtnNewToggleButton.setBackground(new Color(0, 0, 255));
		tglbtnNewToggleButton.setBounds(139, 41, 121, 97);
		contentPane.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnKrmz = new JToggleButton("KIRMIZI");
		tglbtnKrmz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				l1.setText("Kırmızıya tıklandı");}
			@Override
			public void mouseEntered(MouseEvent e) {
				l1.setText("Kırmızının Üzerine Gelindi");	}
			@Override
			public void mouseExited(MouseEvent e) {
				
				l1.setText("Kırmızının Dışına Çıkıldı");}
			@Override
			public void mousePressed(MouseEvent e) {
				l1.setText("Kırmızıya Basılı");}
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
