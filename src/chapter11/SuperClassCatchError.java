package chapter11;

public class SuperClassCatchError {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try
        {
            throw new ExceptionA();
        }
        catch(Exception exception)
        {
            if(exception instanceof ExceptionA)
            {
                System.err.println("Object inappropriately handled by super class");
            }
        }
		/*
		catch(ExceptionA exception)
		{
			System.err.println("Object appropriately handled by super class");
		}
		*/
    }

}
