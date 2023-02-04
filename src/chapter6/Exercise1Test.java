package chapter6;
import javax.swing.JFrame;
public class Exercise1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1 panel = new Exercise1();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300,300);
		application.setVisible(true);
	}

}
