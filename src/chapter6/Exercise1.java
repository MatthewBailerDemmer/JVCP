package chapter6;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class Exercise1 extends JPanel {
    private int r;
    private int g;
    private int b;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        mixItUp();
        Color color1 = new Color(r,this.g,b);
        mixItUp();
        Color color2 = new Color(r,this.g,b);


        for(int i = 4; i >= 0 ;i--) {
            g.setColor(color1);

            if(i == 0 || i == 2 || i == 4) {
                g.setColor(color2);
            }
            g.fillOval((getWidth()/2) -(10 + i*10),(getHeight()/2) -(10 + i*10),2*(10 + i*10),2*(10 + i*10) );

        }

    }

    public void mixItUp() {
        SecureRandom random = new SecureRandom();
        this.r = random.nextInt(256);
        this.g = random.nextInt(256);
        this.b = random.nextInt(256);
    }

}
