package chapter14;

public class StringValueOF {
    public static void main(String[] args){
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L; // sufixo L indica tipo Long
        float floatValue = 2.5f; // sufixo f indica float
        double doubleValue = 33.333; // sem sufixo tipo double é padrão
        Object objectRef = "hello"; // atribui string a uma referêncoa Object

        System.out.printf(
                "char array = %s%n", String.valueOf(charArray));
        System.out.printf("part of char array = %s%n",
                String.valueOf(charArray, 3, 3));
        System.out.printf(
                "boolean = %s%n", String.valueOf(booleanValue));
        System.out.printf(
                "char = %s%n", String.valueOf(characterValue));
        System.out.printf("int = %s%n", String.valueOf(integerValue));
        System.out.printf("long = %s%n", String.valueOf(longValue));
        System.out.printf("float = %s%n", String.valueOf(floatValue));
        System.out.printf(
                "double = %s%n", String.valueOf(doubleValue));
        System.out.printf("Object = %s", String.valueOf(objectRef));

    }
}
