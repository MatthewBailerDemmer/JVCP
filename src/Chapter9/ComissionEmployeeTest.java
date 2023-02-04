package chapter9;

public class ComissionEmployeeTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ComissionEmployee employee = new ComissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, 0.06);

        System.out.println(
                "Employee information obtained by get methods: ");
        System.out.printf("%n%s %s%n","First name is",
                employee.getFirstName());
        System.out.printf("%s %s%n","Last name is",
                employee.getLastName());
        System.out.printf("%s %s%n","Social security number is",
                employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n","Gross sales is",
                employee.getGrossSales());
        System.out.printf("%s %.2f%n","Comission rate is",
                employee.getComissionRate());

        employee.setGrossSales(5000);
        employee.setComissionRate(0.1);

        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information obtained by toString",employee);

    }

}