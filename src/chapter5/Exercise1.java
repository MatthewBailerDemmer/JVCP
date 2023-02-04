package chapter5;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Exercise1 extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(int i = 0; i < 12; i++) {
		g.drawOval((getWidth()/2) - (5 + i*10),(getHeight()/2) - (5 + i*10), 2*(5 + i*10),2*(5 + i*10) );
	
		}
	}	
}
