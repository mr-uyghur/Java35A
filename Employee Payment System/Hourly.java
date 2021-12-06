//(Hourly class is a sub class of Employee class)

// Create a class named Hourly
public class Hourly extends Employee {
    // Declare the variables
    private double wage;
    private double hours;

    // Create a parameter constructor.
    public Hourly(String first, String last, double hourlyWage, double hoursWorked) {
        super(first, last);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

    // Create mutator for wage
    public void setWage(double hourlyWage) {
        if (hourlyWage >= 0.0)
            wage = hourlyWage;
        else
            throw new IllegalArgumentException(
                    "Hourly wage must be >= 0.0");
    }

    // Create accessor for wage
    public double getWage() {
        return wage;
    }

    // Create mutator for hours
    public void setHours(double hoursWorked) {
        if ((hoursWorked >= 0.0) && (hoursWorked <= 168.0))
            hours = hoursWorked;
        else
            throw new IllegalArgumentException(
                    "Hours worked must be >= 0.0 and <= 168.0");
    }

    // Create mutator for wage
    public double getHours() {
        return hours;
    }

    // Override the abstract method here.
    @Override
    public double earnings() {
        if (getHours() <= 40)
            return getWage() * getHours();
        else
            return (getHours() * getWage()) + ((getHours() - 40) * getWage());
    }

    @Override
    public String toString() {
        return String.format("%sHourly\t\t%.2f\t\t$%,.2f\t$%,.2f", super.toString(), getHours(), getWage(), earnings());
    }
}