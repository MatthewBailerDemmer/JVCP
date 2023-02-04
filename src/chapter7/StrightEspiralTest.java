package chapter7;
import javax.swing.JFrame;
public class StrightEspiralTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame application = new JFrame();
		StraightEspiral espiral = new StraightEspiral();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(espiral);
		application.setSize(300,300);
		application.setVisible(true);
	}

}
