package chapter8;
import java.security.SecureRandom;

public class RandomNumbersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom randomNumbers = new SecureRandom();
		
		int number = randomNumbers.nextInt(2);
		if( number == 0) {
			System.out.println(number + " = False");
		}else {
			System.out.println(number + " True");
		}
	}

}
