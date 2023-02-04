package chapter11;

public class SomeClass {

    public SomeClass(int A) throws ExceptionA {

        if(A < 10) {
            throw new ExceptionA("A must be < 10");
        }
    }
}
