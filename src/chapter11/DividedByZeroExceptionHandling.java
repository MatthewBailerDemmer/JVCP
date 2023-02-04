package chapter11;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DividedByZeroExceptionHandling {

	public static int quotient(int numerator, int denominator) 
	throws ArithmeticException
	{
		return numerator / denominator;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner =  new Scanner(System.in);
			boolean continueLoop = true;
			
			
			
			do 
			{
				try 
				{
					System.out.print("Please enter an integer numerator: ");
					int numerator = scanner.nextInt();
					System.out.printf("Please enter an integer denominator");
					int denominator = scanner.nextInt();
					
					int result = quotient(numerator, denominator);
					System.out.printf("%nResult: %d / %d = %d%n", numerator,
							denominator, result);
					continueLoop = false;
				}
				catch(InputMismatchException inputMismachException)
				{
					System.err.printf("%nException: %s%n",
							inputMismachException);
					scanner.nextLine();
					System.out.printf(
							"You mut enter integers. Please try again.%n%n");
				}
				catch(ArithmeticException arithmeticException)
				{
					System.err.printf("%nException: %s%n", arithmeticException);
					System.out.printf(
							"Zero is an invalid denominator. Please try again.%n%n");
				}
			}while(continueLoop);
	}

}
