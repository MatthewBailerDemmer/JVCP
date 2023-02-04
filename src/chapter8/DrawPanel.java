package chapter8;
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;


public class DrawPanel extends JPanel {
	
	private SecureRandom randomNumbers = new SecureRandom();
	private MyLine[] lines;
	private MyRectangle[] rectangles;
	private MyOval[] ovals;
	
	public DrawPanel() {
		setBackground(Color.WHITE);
		
		lines = new MyLine[1 + randomNumbers.nextInt(5)];
		
		for(int count = 0; count < lines.length; count++) {
			int x1 = randomNumbers.nextInt(300);
			int y1 = randomNumbers.nextInt(300);
			int x2 = randomNumbers.nextInt(300);
			int y2 = randomNumbers.nextInt(300);
			
			Color color = new Color(randomNumbers.nextInt(256),
					randomNumbers.nextInt(256), randomNumbers.nextInt(256));
			
			lines[count] = new MyLine(x1,y1,x2,y2,color);
		}
		
		rectangles = new MyRectangle[1 + randomNumbers.nextInt(5)];
		
		for(int count = 0; count < rectangles.length; count++) {
			int x1 = randomNumbers.nextInt(300);
			int y1 = randomNumbers.nextInt(300);
			int x2 = randomNumbers.nextInt(300);
			int y2 = randomNumbers.nextInt(300);
			
			Color color = new Color(randomNumbers.nextInt(256),
					randomNumbers.nextInt(256), randomNumbers.nextInt(256));
			boolean flag;
			if(randomNumbers.nextInt(2) == 0) {
				flag = false;
			}else {
				flag = true;
			}
			
			rectangles[count] = new MyRectangle(x1,y1,x2,y2,color,flag);
		}
		
		ovals = new MyOval[1 + randomNumbers.nextInt(5)];
		
		for(int count = 0; count < ovals.length; count++) {
			int x1 = randomNumbers.nextInt(300);
			int y1 = randomNumbers.nextInt(300);
			int x2 = randomNumbers.nextInt(300);
			int y2 = randomNumbers.nextInt(300);
			
			Color color = new Color(randomNumbers.nextInt(256),
					randomNumbers.nextInt(256), randomNumbers.nextInt(256));
			
			boolean flag1;
			if(randomNumbers.nextInt(2) == 0) {
				flag1 = false;
			}else {
				flag1 = true;
			}
			ovals[count] = new MyOval(x1,y1,x2,y2,color,flag1);
		}
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		for(MyLine line : lines)
			line.draw(g);
		
		for(MyRectangle rectangle : rectangles)
			rectangle.draw(g);
		
		for(MyOval oval : ovals)
			oval.draw(g);
		
	}
}
