package chapter10;

public class BasePlusComissionEmployee1 extends ComissionEmployee1 {

    private double baseSalary;

    public BasePlusComissionEmployee1(String firstName, String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double comissionRate, double baseSalary, Date birthDate)
    {
        super(firstName,lastName,socialSecurityNumber,grossSales,comissionRate, birthDate);

        if(baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {

        if(baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    @Override
    public double  getPaymentAmount() {
        return baseSalary + (getComissionRate() * getGrossSales());
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried",super.toString(),
                "base salary", getBaseSalary());
    }


}
