package chapter11;

public class SomeS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try
			{
				someMethod();			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	public static void someMethod() throws Exception 
	{
		try
		{
			someMethod2();
		}
		catch(NullPointerException e)
		{
			throw new Exception("Error in metod 2", e);
		}
		
	}
	
	public static void someMethod2() throws NullPointerException
	{
		throw new NullPointerException("Error in method2");
	}

}
