package chapter10;

public class PolymorphismTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ComissionEmployee comissionEmployee = new ComissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, .06);

        BasePlusComissionEmployee basePlusComissionEmployee =
                new BasePlusComissionEmployee (
                        "Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        System.out.printf("%s %s:%n%n%s%n%n",
                "Call ComissionEmployee's toString with superclass reference ",
                "to superclass object", comissionEmployee.toString());


        System.out.printf("%s %s:%n%n%s%n%n",
                "Call BasePlusComissionEmployee toString with subclass ",
                "reference to subclass object", basePlusComissionEmployee.toString());


        ComissionEmployee comissionEmployee2 =
                basePlusComissionEmployee;
        System.out.printf("%s %s:%n%n%s%n%n",
                "Call BasePlusComissionEmployee toString with superclass ",
                "reference to subclass object", comissionEmployee2 .toString());


    }

}
