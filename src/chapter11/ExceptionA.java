package chapter11;

public class ExceptionA  extends Exception{

    public ExceptionA() {
        super("Exception A");
    }

    public ExceptionA(String personalizedDescription) {
        super(personalizedDescription);
    }
    public ExceptionA(String personalizedDescription, Throwable e) {
        super(personalizedDescription, e);
    }
    public ExceptionA(Throwable e) {
        super(e);
    }


}
