package chapter7;
import javax.swing.JFrame;
public class MultCircleTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame application = new JFrame();
        Espiral espiral = new Espiral();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(espiral);
        application.setSize(300,300);
        application.setVisible(true);
    }

}
