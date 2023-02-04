package chapter12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MultipleSelectionFrame {

    private JFrame frmMultipleselectiontest;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MultipleSelectionFrame window = new MultipleSelectionFrame();
                    window.frmMultipleselectiontest.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public MultipleSelectionFrame() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmMultipleselectiontest = new JFrame();
        frmMultipleselectiontest.setTitle("MultipleSelectionTest");
        frmMultipleselectiontest.setBounds(100, 100, 450, 300);
        frmMultipleselectiontest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMultipleselectiontest.getContentPane().setLayout(null);

        JList list = new JList();
        list.setModel(new AbstractListModel() {
            String[] values = new String[] {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
            public int getSize() {
                return values.length;
            }
            public Object getElementAt(int index) {
                return values[index];
            }
        });
        JScrollPane scroll = new JScrollPane(list);
        scroll.setBounds(41, 85, 80, 110);
        frmMultipleselectiontest.getContentPane().add(scroll);

        JList copyList = new JList();
        copyList.setBounds(281, 75, 80, 120);
        frmMultipleselectiontest.getContentPane().add(copyList);

        JButton copyButton = new JButton("copy");
        copyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] vaziu = {" ", "", " "};
                copyList.setListData(vaziu);
                copyList.setListData(list.getSelectedValues());
            }
        });
        copyButton.setBounds(156, 118, 89, 23);
        frmMultipleselectiontest.getContentPane().add(copyButton);
    }
}
