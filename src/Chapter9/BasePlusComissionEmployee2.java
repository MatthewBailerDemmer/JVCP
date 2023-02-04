package chapter9;

public class BasePlusComissionEmployee2 extends ComissionEmployee {

    private double baseSalary;


    public BasePlusComissionEmployee2 (
            String firstName, String lastName, String socialSecurityNumber, double grossSales,
            double comissionRate, double baseSalary) {

        super(firstName, lastName, socialSecurityNumber,
                grossSales, comissionRate);

        if(baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {

        return baseSalary;
    }

    @Override
    public double earnings() {

        return baseSalary + (comissionRate * grossSales);
    }

    @Override
    public String toString() {
        return String.format(
                "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "base-salaried comission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales, "comission rate", comissionRate,
                "base salary", baseSalary);
    }
}
