package chapter5;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ShapeTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame application = new JFrame();

        String input = JOptionPane.showInputDialog("Enter 1 to draw rectangles\n "+
                "Enter 2 to draw ovals");

        int choice = Integer.parseInt(input);

        Shapes panel = new Shapes(choice);

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300,300);
        application.setVisible(true);
    }

}
