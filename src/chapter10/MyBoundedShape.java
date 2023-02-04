package chapter10;
import java.awt.Color;
import java.awt.Graphics;

public abstract class MyBoundedShape extends MyShape{

    boolean flag;

    public MyBoundedShape() {
        super();
        flag = false;
    }
    public MyBoundedShape(int x1, int x2, int y1, int y2, Color color, boolean flag) {
        super(x1, x2, y1, y2, color);
        this.flag = flag;
    }

    private void setFlag(boolean flag) {
        this.flag = flag;
    }

    private boolean getFlag() {
        return flag;
    }

    public int getUpperLeftX() {
        if(getX1() > getX2()) {
            return getX2();
        }

        return getX1();
    }

    public int getUpperLeftY() {
        if(getY1() > getY2()) {
            return getY2();
        }

        return getY1();
    }

    public int getHeight() {
        if(getY1() >getY2()) {
            return getY1() - getY2();
        }

        return getY2()- getY1();
    }

    public int getWitdh() {
        if(getX1()>  getX2()) {
            return getX1() -getX2();
        }

        return getX2() - getX1();
    }


}
