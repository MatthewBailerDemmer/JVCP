package chapter4;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Exercise2 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int df = 50;
        int width = getWidth()/df;
        int height = 0;
        while(width <= getWidth()) {
            g.drawLine(0,height,width,getHeight());
            width += getWidth()/df;
            height += getHeight()/df;

        }

        width = getWidth() - getWidth()/df;
        height = 0;

        while(width >= 0) {
            g.drawLine(getWidth(),height,width,getHeight());
            height += getHeight()/df;
            width -= getWidth()/df;
        }

        width = getWidth()/df;
        height = getHeight();

        while(width <= getWidth()) {
            g.drawLine(0,height,width,0);
            width += getWidth()/df;
            height -= getHeight()/df;

        }

        width = getWidth() - getWidth()/df;
        height = getHeight();

        while(width >= 0) {
            g.drawLine(getWidth(),height,width,0);
            width -= getWidth()/df;
            height -= getHeight()/df;
        }

    }
}
