package chapter7;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
public class StraightEspiral extends JPanel {
	
	
	public StraightEspiral() {
		setBackground(Color.BLACK);
	}
	
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		int centerX = getWidth() / 2;
		int centerY = getHeight() / 2;
		int a = centerX;
		int b = centerY;
		 int rad = 10;
		
		
		
		for(int c = 0; c < 10; c++) {
		g.setColor(Color.WHITE);
		g.drawLine(a,b,a,b + rad);
		g.drawLine(a,b + rad,a - rad,b + rad);
	
		
		a -= rad;
		b += rad;
		
		if(c%2 == 0) {
			rad*=-1;
			rad -= 20;
		}else {
			rad*=-1;
			rad += 20;
		}
		
		}
		
		
	}
}
