package chapter10;

public class PayRoll {
	
	public static Date birthDate;
	public  static Date birthDate1;
	public static Date birthDate2;
	public  static Date birthDate3;
	public static Date currentDate;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		setDates();
		
		SalariedEmployee salariedEmployee = 
				new SalariedEmployee("Jhon","Smith","111-11-1111",800.00,birthDate);
		
		HourlyEmployee hourlyEmployee = 
				new HourlyEmployee("Karen","Price","222-22-2222",16.75, 40, birthDate1);
		
		ComissionEmployee1 comissionEmployee =
				new ComissionEmployee1("Sue","Jones",
						"333-33-3333",10000,.06,birthDate2);
		
		BasePlusComissionEmployee1 basePlusComissionEmployee =
				new BasePlusComissionEmployee1(
						"Bob", "Lewis","444-44-4444",5000,.04,300,birthDate3);
		PieceWorker pieceWorker = 
				new PieceWorker(
						"Matheus", "Bailer", "555-55-5555",25000,100,birthDate);
		
		Employee[] employees = new Employee[5];
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = comissionEmployee;
		employees[3] = basePlusComissionEmployee;
		employees[4] = pieceWorker;
		
		
		
System.out.printf("Employees processed polymorphically:%n%n");
		
		for(Employee currentEmployee : employees) {
			
			System.out.println(currentEmployee);
			
			
			if(currentEmployee.getBirthDate().getMonth() == currentDate.getMonth()) {
				System.out.printf(
						"earned $%,.2f (plus 100 dollars of bithday month bonus)%n%n",
						currentEmployee.getPaymentAmount() +100 );
			}else {
			
			System.out.printf(
					"earned $%,.2f%n%n", currentEmployee.getPaymentAmount());
			}
		}
			
		
		
		
	}
	
	public static void setDates() {
		birthDate = new Date(11, 25, 1999);
		birthDate1 = new Date(1,29,2001);
		birthDate2 = new Date(11,19,1956);
		birthDate3 = new Date(2,1,1998);
		currentDate = new Date(2,1,2022);
	}
}
