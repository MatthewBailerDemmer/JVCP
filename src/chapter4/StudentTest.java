package chapter4;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student account1 = new Student("Julinha linda",93.5);
		Student account2 = new Student("Matheus pirokudo",72.75);
		
		System.out.printf("%s's letter grade is: %s%n",
				account1.getName(),account1.getLetterGrade());
		System.out.printf("%s's letter grade is: %s%n",
				account2.getName(),account2.getLetterGrade());
	}

}
