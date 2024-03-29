package chapter8;

public class Employee2 {

    private static int count = 0;
    private String firstName;
    private String lastName;

    public Employee2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        ++count;
        System.out.printf("Employee constructor: %s %s; count = %d%n",
                firstName, lastName, count);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getCount() {
        return count;
    }
}


