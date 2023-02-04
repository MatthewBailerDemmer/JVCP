package chapter11;


public class SomeClassTest {

    public static void main(String[] args) {



        try
        {
            SomeClass someClass = new SomeClass(9);
        }
        catch(ExceptionA e)
        {
            System.err.println(e);
        }
    }
}
