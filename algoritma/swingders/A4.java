import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class A4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A4 frame = new A4();
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
	
	static boolean kontrol(JCheckBox c2) {return c2.isSelected();}
	
	public A4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox co1 = new JComboBox();
		co1.setModel(new DefaultComboBoxModel(new String[] {"Zonguldak", "Adıyaman", "Balıkesir", "Çorum", "Diyarbakır", "Elazığ", "Giresun", "Hatay", "Iğdır"}));
		co1.setMaximumRowCount(3);
		
		co1.setBounds(136, 11, 166, 22);
		contentPane.add(co1);
		
		JCheckBox c1 = new JCheckBox("Okudum, Anladım.");
		c1.setBounds(132, 50, 206, 23);
		contentPane.add(c1);
		
	
		
		JRadioButton r1 = new JRadioButton("Kadın");
		r1.setBounds(132, 125, 109, 23);
		contentPane.add(r1);
		
		JRadioButton r2 = new JRadioButton("Erkek");
		r2.setBounds(250, 125, 109, 23);
		contentPane.add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		JRadioButton r3 = new JRadioButton("Evli");
		r3.setBounds(132, 160, 109, 23);
		contentPane.add(r3);
		
		JRadioButton r4 = new JRadioButton("Bekar");
		r4.setBounds(250, 160, 109, 23);
		contentPane.add(r4);
		
		ButtonGroup bg1=new ButtonGroup();
		bg1.add(r3);
		bg1.add(r4);
	
		
		JTextArea t5 = new JTextArea();
		t5.setLineWrap(true);
		t5.setBounds(136, 190, 176, 51);
		contentPane.add(t5);
		
		JCheckBox c2 = new JCheckBox("Kabul ediyorum.");
		c2.setHorizontalAlignment(SwingConstants.LEFT);
		c2.setBounds(132, 82, 109, 23);
		contentPane.add(c2);
	    
	/*	if(kontrol(c2)) {btnNewButton.setEnabled(true);}
	    else   {btnNewButton.setEnabled(false);}*/
		
		JLabel l1 = new JLabel("New label");
		l1.setBounds(398, 50, 147, 139);
		contentPane.add(l1);
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//l1.setText(co1.getSelectedIndex());
				String s=String.valueOf(co1.getSelectedItem())
						+" "+String.valueOf(co1.getSelectedIndex());
				l1.setText(s);
				
				
				if(c1.isSelected()) {l1.setText("Sözleşme okundu");}
				else  {l1.setText("Sözleşme okunmadı");}
				
				if(c2.isSelected()) {l1.setText("Sözleşme Kabul edildi");}
				else  {l1.setText("Sözleşme Kabul edilmedi");}
				if (r3.isSelected()) {l1.setText("Evli seçildi");};
				
			}
		});
		btnNewButton.setBounds(168, 252, 89, 23);
		contentPane.add(btnNewButton);

	
	    
		JLabel lblNewLabel_1 = new JLabel("CheckBox");
		lblNewLabel_1.setBounds(32, 54, 94, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CheckBox");
		lblNewLabel_1_1.setBounds(32, 86, 94, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("RadioButton");
		lblNewLabel_1_2.setBounds(32, 129, 94, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("TextArea");
		lblNewLabel_1_3.setBounds(32, 203, 94, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("ComboBox");
		lblNewLabel_1_4.setBounds(32, 15, 94, 14);
		contentPane.add(lblNewLabel_1_4);
		
	
		
	}
}
