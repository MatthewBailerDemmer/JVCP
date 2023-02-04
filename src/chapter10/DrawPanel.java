package chapter10;
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;
import java.util.Scanner;


public class DrawPanel extends JPanel {

    private SecureRandom randomNumbers = new SecureRandom();
    private MyShape[] shapes;
    int lines;
    int rectangles;
    int ovals;


    public DrawPanel() {
        setBackground(Color.WHITE);

        Scanner input = new Scanner(System.in);
        System.out.println("How many shapes do you want?");

        int n = input.nextInt();

        shapes = new  MyShape[n];

        for(int c = 0; c < shapes.length; c++) {

            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            Color color = new Color(randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            boolean flag;
            if(randomNumbers.nextInt(2) == 0) {
                flag = false;
            }else {
                flag = true;
            }

            int choice = randomNumbers.nextInt(3);

            switch(choice) {
                case 0:
                    shapes[c] = new MyLine(x1,x2,y1,y2,color);
                    lines++;
                    break;
                case 1:
                    shapes[c] = new MyRectangle(x1,x2,y1,y2,color,flag);
                    rectangles++;
                    break;
                case 2:
                    shapes[c] = new MyOval(x1,x2,y1,y2,color,flag);
                    ovals++;
                    break;

            }
        }




    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        for(MyShape shape : shapes)
            shape.draw(g);



    }

    public String GetStatus() {
        return String.format("Lines: %d  Rectangles: %d  Ovals: %d",
                lines, rectangles, ovals);
    }
}