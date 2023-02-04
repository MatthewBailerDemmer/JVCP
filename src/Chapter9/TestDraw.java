package chapter9;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
public class TestDraw {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();

        JLabel label = new JLabel(panel.GetStatus());

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.add(label, BorderLayout.SOUTH);
        application.setSize(300, 300);
        application.setVisible(true);
    }

}