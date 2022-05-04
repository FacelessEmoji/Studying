package OOP.PracticeInheritance.Ex2;

import java.text.DecimalFormat;

public class Worker extends Human{
    DecimalFormat dF = new DecimalFormat( "0.00" );
    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

    private void setWeekSalary(double weekSalary) throws IllegalArgumentException{
        if (weekSalary < 10) {
            throw new IllegalArgumentException("Expected value mismatch! Argument: weekSalary");
        } else this.weekSalary = weekSalary;
    }

    private void setWorkHoursPerDay(double workHoursPerDay) {
        if (workHoursPerDay < 1 | workHoursPerDay > 12) {
            throw new IllegalArgumentException("Expected value mismatch! Argument: weekSalary");
        } else this.workHoursPerDay = workHoursPerDay;
    }

    @Override
    protected void setLastName(String lastName) {
        super.setLastName(lastName);
        if (lastName.charAt(0) == lastName.toLowerCase().charAt(0)) {
            throw new IllegalArgumentException("Expected upper case letter! Argument: lastName ");
        } else if (lastName.length() < 4) {
            throw new IllegalArgumentException("Expected length more than 3 symbols! Argument: lastName");
        } else this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName
                + "\nLast Name: " + lastName
                + "\nWeek Salary: " + dF.format(weekSalary)
                + "\nHours per day: " + dF.format(workHoursPerDay)
                + "\nSalary per hour: " + dF.format(weekSalary/7/workHoursPerDay);
    }
}
