package chapter11;

import java.io.IOException;

public class MultipleExceptionTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try
        {
            throw new ExceptionA();
        }
        catch(Exception exception) {
            System.err.println(exception);
        }

        try
        {
            throw new ExceptionB();
        }
        catch(Exception exception) {
            System.err.println(exception);
        }

        try
        {
            throw new NullPointerException();
        }
        catch(Exception exception) {
            System.err.println(exception);
        }

        try
        {
            throw new IOException();
        }
        catch(Exception exception) {
            System.err.println(exception);
        }
    }

}
