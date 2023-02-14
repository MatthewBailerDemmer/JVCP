package chapter13;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

public class DrawPolygons extends JFrame implements KeyListener {

   public DrawPolygons(String comecoString){
       super(comecoString);
       addKeyListener(this);
   }

   @Override
   public void keyTyped(KeyEvent e ){
       System.out.println(e.getKeyCode());

   }
    @Override
    public void keyPressed(KeyEvent e ){
        int enterPressed = e.getKeyCode();
        if(enterPressed == 10){
            this.dispatchEvent( new WindowEvent(this, WindowEvent.WINDOW_CLOSING)); //really cool peace of code
        }
    }
    @Override
    public void keyReleased(KeyEvent e ){
        System.out.println(e.getKeyCode());
    }



    public static void main(String[] args){
        DrawPolygons frame = new DrawPolygons("Drawing Polygons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PolygonsJPanel polygonsJPanel = new PolygonsJPanel();
        frame.add(polygonsJPanel);
        frame.setSize(280, 270);
        frame.setVisible(true);
    }
}
