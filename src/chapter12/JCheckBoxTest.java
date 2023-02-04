package chapter12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class JCheckBoxTest {

	private JFrame frmCheckboxTest;
	private JTextField textField;
	private JCheckBox checkBox2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckBoxTest window = new JCheckBoxTest();
					window.frmCheckboxTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JCheckBoxTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckboxTest = new JFrame();
		frmCheckboxTest.setTitle("CheckBox Test");
		frmCheckboxTest.setBounds(100, 100, 450, 300);
		frmCheckboxTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckboxTest.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		textField.setBounds(52, 38, 343, 20);
		frmCheckboxTest.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox checkBox1 = new JCheckBox("Itallic");
		checkBox1.setFont(new Font("Tahoma", Font.ITALIC, 11));
		checkBox1.setBounds(251, 86, 72, 23);
		frmCheckboxTest.getContentPane().add(checkBox1);
		
		checkBox2 = new JCheckBox("Bold");
		checkBox2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
			}
		});
		checkBox2.setFont(new Font("Tahoma", Font.BOLD, 11));
		checkBox2.setBounds(92, 86, 97, 23);
		frmCheckboxTest.getContentPane().add(checkBox2);
		
		
		
		
		checkBox1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				Font f;
				if(checkBox1.isSelected() && checkBox2.isSelected()) {
					f  = new Font("Serif", Font.ITALIC + Font.BOLD, 14);
				}else if(checkBox1.isSelected()) {
					f = new Font("Serif", Font.ITALIC, 14);
				}else if(checkBox2.isSelected()) {
					f = new Font("Serif", Font.BOLD, 14);
				}else {
					f = new Font("Serif", Font.PLAIN, 14);
				}
				
				textField.setFont(f);
			}
		});
		
		checkBox2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				Font f;
				if(checkBox1.isSelected() && checkBox2.isSelected()) {
					f  = new Font("Serif", Font.ITALIC + Font.BOLD, 14);
				}else if(checkBox1.isSelected()) {
					f = new Font("Serif", Font.ITALIC, 14);
				}else if(checkBox2.isSelected()) {
					f = new Font("Serif", Font.BOLD, 14);
				}else {
					f = new Font("Serif", Font.PLAIN, 14);
				}
				
				textField.setFont(f);
			}
		});
		
		
	}
}
