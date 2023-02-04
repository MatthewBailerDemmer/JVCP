package chapter6;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.security.SecureRandom;

public class Exercise2 extends JPanel {
	
	private int r;
	private int g;
	private int b;
	private int x;
	private int y;
	private int width;
	private int height;
	private boolean choice;
	private Color color;
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(int i = 1; i <= 10; i++) {
			randomPart();
			g.setColor(color);
			if(choice) {
				g.fillRect(x,y,width,height);
			}else {
			g.fillOval(x,y,width,height);
			}
		}
		
	}
	
	public void randomPart() {
		SecureRandom random = new SecureRandom();
		
		r = random.nextInt(256);
		g = random.nextInt(256);
		b = random.nextInt(256);
		color = new Color(r,g,b);
		
		x = random.nextInt(getWidth() + 1);
		y = random.nextInt(getHeight() + 1);
		
		width = 1 + random.nextInt(getWidth()/2);
		height = 1 + random.nextInt(getHeight()/2);
		
		choice = random.nextBoolean();
		
	}
}
