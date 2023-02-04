package chapter7;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Espiral extends JPanel {


    public Espiral() {
        setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        int x = getWidth()/2;
        int y = getHeight()/2;
        int largura = 10;
        int altura = 10;
        x -= largura;
        y-= altura;
        int aumento = 30;
        for(int counter = 0; counter < 10; counter++) {





            g.drawArc(x,y,largura,altura,0,180);

            x -= aumento;
            y -= aumento/2;

            largura += aumento;
            altura += aumento;

            g.drawArc(x,y,largura,altura,180,180);


            y -= aumento/2;

            largura += aumento;
            altura += aumento;

        }

    }
}
