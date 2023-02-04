package chapter10;

public class ComissionEmployee1 extends Employee {
	
	private double grossSales;
	private double comissionRate;
	
	public ComissionEmployee1(String firstName, String lastName,
			String socialSecurityNumber, double grossSales,
			double comissionRate,Date birthDate)
	{
		super(firstName, lastName, socialSecurityNumber, birthDate);
		
		if(comissionRate <= 0.0 || comissionRate >= 1.0)
			throw new IllegalArgumentException(
					"Comission rate must be > 0.0 and < 1.0");
		
		if(grossSales < 0.0)
			throw new IllegalArgumentException(
					"Gross sales must be >= 0.0");
		
		this.comissionRate = comissionRate;
		this.grossSales = grossSales;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		
		if(grossSales < 0.0)
			throw new IllegalArgumentException(
					"Gross sales must be >= 0.0");
		
		
		this.grossSales = grossSales;
	}

	public double getComissionRate() {
		return comissionRate;
	}

	public void setComissionRate(double comissionRate) {
		
		if(comissionRate <= 0.0 || comissionRate >= 1.0)
			throw new IllegalArgumentException(
					"Comission rate must be > 0.0 and < 1.0");
		
		this.comissionRate = comissionRate;
	}
	
	@Override
	public double  getPaymentAmount() {
		
		return getComissionRate() * getGrossSales();
	}
	
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%.2f; %s: %.2f",
				"comission employee", super.toString(),
				"gross sales", getGrossSales(),
				"comission rate", getComissionRate());
	}
	
}
