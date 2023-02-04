package chapter12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class TestingButtons {

    private JFrame frmTestingButtons;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TestingButtons window = new TestingButtons();
                    window.frmTestingButtons.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public TestingButtons() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmTestingButtons = new JFrame();
        frmTestingButtons.setTitle("Testing Buttons");
        frmTestingButtons.setBounds(100, 100, 401, 152);
        frmTestingButtons.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmTestingButtons.getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("Palin Button");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"You have pressed: "+ btnNewButton.getText());
            }
        });
        btnNewButton.setBounds(26, 62, 108, 23);
        frmTestingButtons.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Fancy Button");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You pressed: "+ btnNewButton_1.getText());
            }
        });
        btnNewButton_1.setIcon(new ImageIcon(TestingButtons.class.getResource("/chapter12/deitel-logo-square.jpg")));
        Icon icon1 = new ImageIcon(getClass().getResource("download.png"));
        btnNewButton_1.setRolloverIcon(icon1);
        btnNewButton_1.setBounds(183, 50, 174, 47);
        frmTestingButtons.getContentPane().add(btnNewButton_1);
    }
}
