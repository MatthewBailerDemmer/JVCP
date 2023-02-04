package chapter11;

public class ExceptionABCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			throw new ExceptionB();
		}
		catch(ExceptionA e)
		{
			System.out.println("Exception B caught with ExpetionA reference");
		}
		
		try
		{
			throw new ExceptionC();
		}
		catch(ExceptionA e)
		{
			System.out.println("Exception C caught with ExpetionA reference");
		}
	}

}
