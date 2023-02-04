

package chapter12;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;

public class MouseTracker {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseTracker window = new MouseTracker();
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
	public MouseTracker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		
		JLabel label = new JLabel("");
		label.setBounds(0, 240, 434, 21);
		frame.getContentPane().add(label);
		
		
		
		frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				frame.getContentPane().setBackground(Color.GREEN);
				label.setText(String.format("Mouse entered at %d %d", e.getX(), e.getY()));
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setText(String.format("Mouse clicked at %d %d", e.getX(), e.getY()));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				label.setText(String.format("Mouse pressed at %d %d", e.getX(), e.getY()));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				label.setText(String.format("Mouse released at %d %d", e.getX(), e.getY()));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label.setText(String.format("Mouse exited at %d %d", e.getX(), e.getY()));
				frame.getContentPane().setBackground(Color.GRAY);
			}
		});
		frame.setTitle("MouseTracker");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				label.setText(String.format("Mouse dragged at %d %d", e.getX(), e.getY()));
			}
			@Override
			public void mouseMoved(MouseEvent e) {
				label.setText(String.format("Mouse moved at %d %d", e.getX(), e.getY()));
			}
		});
		
	}

}
