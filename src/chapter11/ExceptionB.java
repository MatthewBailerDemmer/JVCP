package chapter11;

public class ExceptionB extends ExceptionA{
	
	public ExceptionB() {
		super("Exception B");
	}
	public ExceptionB(String personalizedDescription) {
		super(personalizedDescription);
	}
}
