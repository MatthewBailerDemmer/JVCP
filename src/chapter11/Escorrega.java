package chapter11;

public class Escorrega {
	public static void main(String[] args) {
		try
		{
			ex();
		}catch(Exception e) 
		{
			System.err.println("Error in main");
		}
	}
	
	public static void ex() throws Exception {
		try
		{
			float n = 5 / 0;
		}
		catch(ArithmeticException e)
		{
			System.err.println("Error in ex");
		}
		
		throw new Exception();
	}
}
