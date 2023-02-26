package chapter14;

public class StringIndexMethods {
    public static void main(String[] args){
        String letters = "abcdefghijklmabcdefghijklm";

        System.out.printf(
                "'c' is located at index %d%n", letters.indexOf('c'));
        System.out.printf(
                "'a' is located at index %d%n", letters.indexOf('a', 1));
        System.out.printf(
                "'$' is located at index %d%n", letters.indexOf('$'));

        System.out.printf(
                "Last 'c'" +
                        "" +
                        " is located at index %d%n", letters.indexOf('$'));
    }
}
