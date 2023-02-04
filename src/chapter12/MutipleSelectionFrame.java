package chapter12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.border.CompoundBorder;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JScrollBar;

public class MutipleSelectionFrame {

	private JFrame frame;
	
	 private static final Color[] colors = {
				Color.BLACK,
				Color.BLUE,
				Color.CYAN,
				Color.DARK_GRAY,
				Color.GRAY,
				Color.GREEN,
				Color.LIGHT_GRAY,
				Color.MAGENTA,
				Color.ORANGE,
				Color.PINK,
				Color.RED,
				Color.WHITE,
				Color.YELLOW
			};

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MutipleSelectionFrame window = new MutipleSelectionFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MutipleSelectionFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
				
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() ==  ItemEvent.SELECTED) {
					frame.getContentPane().setBackground(colors[comboBox.getSelectedIndex()]);
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"}));
		comboBox.setBounds(153, 68, 66, 22);
		frame.getContentPane().add(comboBox);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				frame.getContentPane().setBackground(colors[list.getSelectedIndex()]);
			}
		});
		
		JScrollPane scroll  = new JScrollPane(list);
		scroll.setBounds(141, 122, 78, 94);
		
		
		frame.getContentPane().add(scroll);
	
		
	}
}
