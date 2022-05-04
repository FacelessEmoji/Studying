package OOP.PracticeInheritance.Ex2;

public class Student extends Human{
    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    private void setFacultyNumber(String facultyNumber) throws IllegalArgumentException {
        if (facultyNumber.length() < 5 | facultyNumber.length() > 10) {
            throw new IllegalArgumentException("Invalid faculty number!");
        } else this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nFaculty Number: " + facultyNumber;
    }
}
