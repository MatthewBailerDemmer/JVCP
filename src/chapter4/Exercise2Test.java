package chapter4;
import javax.swing.JFrame;

public class Exercise2Test {
    public static void main(String[] args) {
        JFrame application = new JFrame();
        Exercise2 panel = new Exercise2();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(300,300);
        application.setVisible(true);

    }
}
