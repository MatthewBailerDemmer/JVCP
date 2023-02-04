package chapter10;

public class PaybleInterfaceTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Date date = new Date(11,25,1999);
        Payable[] payableObjects = new Payable[6];

        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new
                SalariedEmployee("Jhon", "Smith", "111-11-1111", 800.00,date);
        payableObjects[3] = new
                HourlyEmployee("Lisa", "Barnes", "888-88-8888", 500,100,date);
        payableObjects[4] = new
                ComissionEmployee1("Sue","Jones",
                "333-33-3333",10000,.5,date);
        payableObjects[5] = new
                BasePlusComissionEmployee1(
                "Bob", "Lewis","444-44-4444",5000,.4,300,date);

        System.out.println(
                "Invoices and Employees processed polymorphically: ");




        for(Payable currentPayable : payableObjects) {

            if(currentPayable instanceof BasePlusComissionEmployee1) {
                BasePlusComissionEmployee1 currentPayable1 =
                        (BasePlusComissionEmployee1) currentPayable;

                currentPayable1.setBaseSalary(currentPayable1.getBaseSalary()*1.1);
                currentPayable = (BasePlusComissionEmployee1) currentPayable1;
            }
            System.out.printf("%n%s %n%s: $%,.2f%n",
                    currentPayable.toString(),
                    "payament due", currentPayable.getPaymentAmount());
        }
    }

}
