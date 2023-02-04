package chapter12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LabelTest {

	private JFrame frmTestingLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabelTest window = new LabelTest();
					window.frmTestingLabel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LabelTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTestingLabel = new JFrame();
		frmTestingLabel.setTitle("Testing Label");
		frmTestingLabel.setBounds(100, 100, 543, 360);
		frmTestingLabel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTestingLabel.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Label with text");
		lblNewLabel.setBounds(176, 32, 88, 23);
		frmTestingLabel.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Label with text and icon");
		lblNewLabel_1.setToolTipText("This is label2");
		lblNewLabel_1.setBounds(115, 74, 284, 103);
		lblNewLabel_1.setIcon(new ImageIcon(LabelTest.class.getResource("/chapter12/deitel-logo-square.jpg")));
		frmTestingLabel.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Label with icon and text at bottom");
		lblNewLabel_2.setBounds(98, 190, 271, 103);
		lblNewLabel_2.setIcon(new ImageIcon(LabelTest.class.getResource("/chapter12/deitel-logo-square.jpg")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		frmTestingLabel.getContentPane().add(lblNewLabel_2);
	}
}
