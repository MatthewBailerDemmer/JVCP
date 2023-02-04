package chapter7;

public class GradeBookTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] gradesArray = {87,68,94,100,83,78,85,91,76,87};

        GradeBook myGradeBook = new GradeBook(
                "CS101 Introduction to Java Programing",gradesArray);
        System.out.printf("Welcome to the grade book for%n%s5n%n",
                myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }

}
