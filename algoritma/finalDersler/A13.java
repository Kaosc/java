import java.awt.EventQueue;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class A13 extends JFrame  {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A13 frame = new A13();
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
	public A13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Bir tuşa basın");
		l1.setBounds(76, 11, 321, 57);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Bir tuşa basın");
		l2.setBounds(76, 67, 321, 57);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("Bir tuşa basın");
		l3.setBounds(76, 128, 321, 57);
		contentPane.add(l3);
		
		JLabel l4 = new JLabel("Bir tuşa basın");
		l4.setBounds(76, 193, 321, 57);
		contentPane.add(l4);
		
		setFocusable(true);
		requestFocus();
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				l1.setText(e.getKeyChar()+" Tuşuna Basıldı");
				if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
					
					l3.setText("Escape Tuşuna Basıldı");
				}
				
				else if(e.getKeyCode()==KeyEvent.VK_ENTER)
				
				{		l3.setText("ENTER Tuşuna Basıldı");
				}
			
				else if(e.getKeyCode()==KeyEvent.VK_SHIFT)
					
				{		l3.setText("SHIFT Tuşuna Basıldı");
				}
				else {}
			
			}
			@Override
			public void keyReleased(KeyEvent e) {	
				l2.setText(e.getKeyChar()+" Tuş Bırakıldı");
			}
			
			public void keyTyped(KeyEvent e)
			
			 {	
				l4.setText(e.getKeyChar()+" Tuş Basıldı");
				if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
					
					l4.setText("Escape Tuşuna Basıldı");
				}
			}
			
		});

			
	//getKeyChar() Hangi tuşa basıldıysa o karakteri döndürür
	//getKeyCode() Tuş kodunu döndürür.
	//isLetter()	isDigit()
		
	

		
	
		
		
		
	}
}
