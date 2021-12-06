// Create a class named 'Salaried'
public class Salaried extends Employee {
    // Declare the private variables
    private double weeklySalary;
    private double baseSalary;

    // Create a parameter constructor.
    public Salaried(String first, String last, double salary) {
        super(first, last);
        setWeeklySalary(salary);
    }

    // Create a mutator for weekly salary.
    public void setWeeklySalary(double salary) {

        if (salary >= 0.0) {
            baseSalary = salary;
            weeklySalary = baseSalary * 7;
        } else
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
    }

    // Create a accessor for weekly salary.
    public double getWeeklySalary() {
        return weeklySalary;
    }

    // Definition of the abstract method.
    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("%sSalaried\t\t\t\t$%,.2f", super.toString(), earnings());
    }
}
