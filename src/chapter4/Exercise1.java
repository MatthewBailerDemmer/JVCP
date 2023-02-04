package chapter4;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Exercise1 extends JPanel{

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int width = 0;
			int height = getHeight();
			
			while(height >= getHeight()/15) {
				width = width + getWidth()/15;
				height = height - getHeight()/15;
				g.drawLine(0,0,width,height);
				
			}
			
			width = 0;
			height = getHeight();
			while(height >= getHeight()/15) {
				width = width + getWidth()/15;
				height = height - getHeight()/15;
			g.drawLine(getWidth(),getHeight(),width,height);
			}
			
			
			width = 0;
			height = 0;
			while(height <= getHeight() - getHeight()/15) {
				width += getWidth()/15;
				height += getHeight()/15;
				g.drawLine(getWidth(),0,width,height);
			}
			
			width = 0;
			height = 0;
			while(height <= getHeight() - getHeight()/15) {
				width += getWidth()/15;
				height += getHeight()/15;
				g.drawLine(0,getHeight(),width,height);
			}
		}
}
