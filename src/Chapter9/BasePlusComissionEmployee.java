package Chapter9;

public class BasePlusComissionEmployee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales;
	private double comissionRate;
	private double baseSalary;
	
	public BasePlusComissionEmployee(String firstName, String lastName,
			String socialSecurityNumber, double grossSales,
			double comissionRate, double baseSalary) {
		
		if(grossSales < 0.0)
			throw new IllegalArgumentException(
					"Gross sales must be >= 0.0");
		
		if(comissionRate <= 0.0 || comissionRate >=1)
			throw new IllegalArgumentException(
					"Comission rate must be > 0.0 and < 1.0");
		
		if(baseSalary < 0.0)
			throw new IllegalArgumentException(
					"Base salary must be >= 0.0");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
		this.baseSalary = baseSalary;
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
		
		if(comissionRate <= 0.0 || comissionRate >=1)
			throw new IllegalArgumentException(
					"Comission rate must be > 0.0 and < 1.0");
		
		this.comissionRate = comissionRate;
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

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

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

