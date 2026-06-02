import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class A6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A6 frame = new A6();
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
	public A6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton tg = new JToggleButton("Aç/Kapa");
		tg.setBounds(10, 11, 121, 23);
		contentPane.add(tg);
		
JFormattedTextField ft = new JFormattedTextField(NumberFormat.getIntegerInstance());
//ft.setText("100");	
ft.setValue(3000);
ft.setBounds(10, 88, 121, 20);
		contentPane.add(ft);
		
		JTextPane tp = new JTextPane();
		tp.setBounds(156, 11, 98, 55);
		contentPane.add(tp);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(270, 122, 121, 58);
		contentPane.add(editorPane);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(10, -12, 12, 1));
		spinner.getValue();
		spinner.setValue(30);
		spinner.setBounds(10, 143, 58, 37);
		contentPane.add(spinner);
		
		JList list = new JList();
		list.setBounds(156, 122, 79, 58);
		contentPane.add(list);
		
		table = new JTable();
		table.setBounds(300, 50, 49, 29);
		contentPane.add(table);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(257, 190, 146, 14);
		contentPane.add(progressBar);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(396, 60, 17, 48);
		contentPane.add(scrollBar);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 191, 101, 37);
		contentPane.add(separator);
		
		JSlider slider = new JSlider();
		slider.setBounds(20, 215, 200, 26);
		contentPane.add(slider);
		JLabel l1 = new JLabel("Durum");
		l1.setBounds(156, 8, 116, 29);
		contentPane.add(l1);
		JButton btnNewButton = new JButton("Durum");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			if (tg.isSelected()) {l1.setText("Buton Aktif");}
			else {l1.setText("Buton Seçilmedi");}
			}
			
			
		});
		btnNewButton.setBounds(22, 45, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
