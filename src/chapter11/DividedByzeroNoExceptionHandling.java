package chapter11;
import java.util.Scanner;

public class DividedByzeroNoExceptionHandling {

    public static int quotient(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Pleas enter an integer numerator: ");
        int numerator = scanner.nextInt();
        System.out.printf("Pleas enter an integer denominator: ");
        int denominator = scanner.nextInt();

        int result  = quotient(numerator, denominator);
        System.out.printf(
                "%nResult: %d / %d = %d%n", numerator, denominator, result);
    }

}