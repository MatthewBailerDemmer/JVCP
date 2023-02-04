package chapter12;

import javax.swing.JFrame;
import javax.swing.border.Border;

public class BorderLayoutDemo {

    public static void main(String[] args){

        BorderLayoutFrame borderLayoutFrame = new BorderLayoutFrame();
        borderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderLayoutFrame.setSize(300, 200);
        borderLayoutFrame.setVisible(true);
    }
}
