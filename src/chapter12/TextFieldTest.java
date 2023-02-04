package chapter12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class TextFieldTest {

    private JFrame frmTextfieldtest;
    private JTextField textField;
    private JPasswordField passwordField;
    private JTextField txtDigitText;
    private JTextField txtUneditableText;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TextFieldTest window = new TextFieldTest();
                    window.frmTextfieldtest.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public TextFieldTest() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmTextfieldtest = new JFrame();
        frmTextfieldtest.setTitle("TextFieldTest");
        frmTextfieldtest.setBounds(100, 100, 450, 300);
        frmTextfieldtest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmTextfieldtest.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, textField.getText(), "Text", JOptionPane.PLAIN_MESSAGE);
            }
        });
        textField.setBounds(38, 93, 105, 20);
        frmTextfieldtest.getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(179, 11, 50, 50);
        lblNewLabel.setIcon(new ImageIcon(TextFieldTest.class.getResource("/chapter12/deitel-logo-square.jpg")));
        frmTextfieldtest.getContentPane().add(lblNewLabel);

        passwordField = new JPasswordField();
        passwordField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, passwordField.getText(), "Text", JOptionPane.PLAIN_MESSAGE);
            }
        });
        passwordField.setBounds(265, 184, 105, 20);
        frmTextfieldtest.getContentPane().add(passwordField);

        txtDigitText = new JTextField();
        txtDigitText.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                txtDigitText.setText(null);
            }
            @Override
            public void focusLost(FocusEvent e) {
                txtDigitText.setText("Digit Text");
            }
        });
        txtDigitText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, txtDigitText.getText(), "Text", JOptionPane.PLAIN_MESSAGE);
            }
        });
        txtDigitText.setText("Digit Text");
        txtDigitText.setBounds(248, 93, 105, 20);
        frmTextfieldtest.getContentPane().add(txtDigitText);
        txtDigitText.setColumns(10);

        txtUneditableText = new JTextField();
        txtUneditableText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, txtUneditableText.getText(), "Text", JOptionPane.PLAIN_MESSAGE);
            }
        });
        txtUneditableText.setEditable(false);
        txtUneditableText.setText("Uneditable text");
        txtUneditableText.setBounds(34, 184, 109, 20);
        frmTextfieldtest.getContentPane().add(txtUneditableText);
        txtUneditableText.setColumns(10);
    }
}
