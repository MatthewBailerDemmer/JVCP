package chapter10;

public class PayrollSystemTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Date birthDate = new Date(11, 25, 1999);
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("Jhon","Smith","111-11-1111",800.00,birthDate);
        Date birthDate1 = new Date(1,29,2001);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen","Price","222-22-2222",16.75, 40, birthDate1);
        Date birthDate2 = new Date(11,19,1956);
        ComissionEmployee1 comissionEmployee =
                new ComissionEmployee1("Sue","Jones",
                        "333-33-3333",10000,.06,birthDate2);
        Date birthDate3 = new Date(2,1,1998);
        BasePlusComissionEmployee1 basePlusComissionEmployee =
                new BasePlusComissionEmployee1(
                        "Bob", "Lewis","444-44-4444",5000,.04,300,birthDate3);

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                salariedEmployee, "earned", salariedEmployee.getPaymentAmount());
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                hourlyEmployee, "earned", hourlyEmployee.getPaymentAmount());
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                comissionEmployee, "earned", comissionEmployee.getPaymentAmount());
        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                basePlusComissionEmployee, "earned", basePlusComissionEmployee.getPaymentAmount());

        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = comissionEmployee;
        employees[3] = basePlusComissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        for(Employee currentEmployee : employees) {

            System.out.println(currentEmployee);

            if(currentEmployee instanceof BasePlusComissionEmployee1) {

                BasePlusComissionEmployee1 employee =
                        (BasePlusComissionEmployee1) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf(
                        "new base salary with 10%% increase is: $%,.2f%n",
                        employee.getBaseSalary());
            }

            System.out.printf(
                    "earned $%,.2f%n%n", currentEmployee.getPaymentAmount());
        }

        for(int j =0; j < employees.length; j++)
            System.out.printf("Employee %d is a %s%n", j,
                    employees[j].getClass().getName());

    }

}
