package chapter10;
import java.awt.Graphics;
import java.awt.Color;

public class MyRectangle extends MyBoundedShape{



    public MyRectangle() {
        super();

    }
    public MyRectangle(int x1, int y1, int x2, int y2, Color color, boolean flag) {
        super(x1,x2,y1,y2,color,flag);

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        if(flag) {
            g.drawRect(getX1(),getY1(),getX2(),getY2());
        }else {
            g.fillRect(getX1(),getY1(),getX2(),getY2());
        }
    }




}