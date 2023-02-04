package chapter12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class RadioButtonTest {

	private JFrame frmRadiobuttontext;
	private JTextField txtWatchTheFont;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtonTest window = new RadioButtonTest();
					window.frmRadiobuttontext.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RadioButtonTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRadiobuttontext = new JFrame();
		frmRadiobuttontext.setTitle("RadioButtonText");
		frmRadiobuttontext.setBounds(100, 100, 450, 300);
		frmRadiobuttontext.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRadiobuttontext.getContentPane().setLayout(null);
		
		txtWatchTheFont = new JTextField();
		txtWatchTheFont.setText("Watch the font style change");
		txtWatchTheFont.setFont(new Font("Serif", Font.PLAIN, 14));
		txtWatchTheFont.setBounds(73, 32, 271, 20);
		frmRadiobuttontext.getContentPane().add(txtWatchTheFont);
		txtWatchTheFont.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Plain");
		rdbtnNewRadioButton.setBounds(18, 78, 64, 23);
		frmRadiobuttontext.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Bold");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1.setBounds(96, 78, 76, 23);
		frmRadiobuttontext.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Itallic");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.ITALIC, 11));
		rdbtnNewRadioButton_2.setBounds(190, 78, 87, 23);
		frmRadiobuttontext.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Bold\\Itallic");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbtnNewRadioButton_3.setBounds(293, 78, 109, 23);
		frmRadiobuttontext.getContentPane().add(rdbtnNewRadioButton_3);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);
		bg.add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
				Font f = new Font("Serif", Font.PLAIN,14);
				txtWatchTheFont.setFont(f);
				}
			}
		});
		
		rdbtnNewRadioButton_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnNewRadioButton_1.isSelected()) {
				Font f = new Font("Serif", Font.BOLD,14);
				txtWatchTheFont.setFont(f);
				}
			}
		});
		rdbtnNewRadioButton_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnNewRadioButton_2.isSelected()) {
				Font f = new Font("Serif", Font.ITALIC,14);
				txtWatchTheFont.setFont(f);
				}
			}
		});
		rdbtnNewRadioButton_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(rdbtnNewRadioButton_3.isSelected()) {
				Font f = new Font("Serif", Font.BOLD + Font.ITALIC,14);
				txtWatchTheFont.setFont(f);
				}
			}
		});
		
		
	}
}
