import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Font;


public class A1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel c;
	

	/**
	 * Launch the application.	 */
	
	//metot
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		
			public void run() {
				try {
					A1 frame = new A1();
					
					//A1 f=new A1();
					//f.setResizable(false);
					
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

		setBackground(new Color(228,0, 0));
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
		l1.setBounds(45,47, 160, 19);
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
