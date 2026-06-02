import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
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
				
			A3 fj=new A3();
				
			if(t1.getText().equals("Seda") && (p1.getText().equals("s33")))
				
				{			
					fj.setVisible(true);
	
					}
				else {l1.setText("Yanlış Şifre ya da Kullanıcı Adı");}
				
				
				
			}
		});
		contentPane.add(b1);
		
		p1 = new JTextField();
		p1.setBounds(103, 76, 127, 20);
		contentPane.add(p1);
		p1.setColumns(10);
		
	
	}
}
