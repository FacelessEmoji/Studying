package OOP.PracticeInheritance.Ex2;

public class Human {
    protected String firstName;
    protected String lastName;

    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    protected void setFirstName(String firstName) throws IllegalArgumentException{
        if (firstName.charAt(0) == firstName.toLowerCase().charAt(0)) {
            throw new IllegalArgumentException("Expected upper case letter! Argument: firstName");
        } else if (firstName.length() < 4) {
            throw new IllegalArgumentException("Expected length at least 4 symbols! Argument: firstName");
        } else this.firstName = firstName;
    }

    protected void setLastName(String lastName) {
        if (lastName.charAt(0) == lastName.toLowerCase().charAt(0)) {
            throw new IllegalArgumentException("Expected upper case letter! Argument: lastName ");
        } else if (lastName.length() < 3) {
            throw new IllegalArgumentException("Expected length at least 4 symbols! Argument: lastName");
        } else this.lastName = lastName;
    }
}
