
// This import statement 'Scanner' is used to get the input from the user.
import java.util.Scanner;

// Create a class named 'PayrollTest'
public class PayrollTest {
    // Crate a main method.
    public static void main(String[] args) {
        // Declare the variables.
        String fname;
        String lname;
        String typeOfEmp;
        double dailySalary;
        double hourlyRate;
        double hourlyWorked;
        double totalSalesAmt;

        int numOfEmployees = 0;
        int numOfSalaried = 0;
        int numOfHourly = 0;
        int numOfCommissioned = 0;

        // Declare the array of instances of class named 'employees'
        Employee[] employees = new Employee[50];

        // Declare the array of object for the sub classes.
        Salaried[] salariedEmployees = new Salaried[50];
        Hourly[] hourlyEmployees = new Hourly[50];
        Commissioned[] commissionedEmployees = new Commissioned[50];

        // Create a scanner object to accept the input from the user.
        Scanner scan = new Scanner(System.in);

        String choice = "y";

        // Create a 'while-loop' to get the input from the user continuously.
        while (choice.equals("y")) {

            // Prompt the user and accept the input from the user.
            System.out.print("\nEnter the first name: ");
            fname = scan.next();

            System.out.print("Enter the last name: ");
            lname = scan.next();

            System.out.print("Enter employee type (Salaried or Hourly or Commissioned): ");
            typeOfEmp = scan.next();

            if (typeOfEmp.equals("Salaried")) {
                System.out.print("Enter the daily pay: ");
                dailySalary = scan.nextDouble();

                salariedEmployees[numOfSalaried] = new Salaried(fname, lname, dailySalary);

                /**************** Polymorphism *****************/
                // The object of class named 'Salaried' is stored in the instance of class named
                // 'Employee'.
                employees[numOfEmployees] = salariedEmployees[numOfSalaried];
                numOfSalaried++;
                numOfEmployees++;

            } else if (typeOfEmp.equals("Hourly")) {
                System.out.print("Enter hours worked for the week: ");
                hourlyWorked = scan.nextDouble();

                System.out.print("Enter hourly rate: ");
                hourlyRate = scan.nextDouble();

                hourlyEmployees[numOfHourly] = new Hourly(fname, lname, hourlyRate, hourlyWorked);

                /**************** Polymorphism *****************/
                // The object of class named 'Hourly' is stored in the instance of class named
                // 'Employee'.
                employees[numOfEmployees] = hourlyEmployees[numOfHourly];
                numOfHourly++;
                numOfEmployees++;
            } else if (typeOfEmp.equals("Commissioned")) {
                System.out.print("Enter total sales amount: ");
                totalSalesAmt = scan.nextDouble();

                // Commision with 20%.
                commissionedEmployees[numOfCommissioned] = new Commissioned(fname, lname, totalSalesAmt, 0.20);

                /**************** Polymorphism *****************/
                // The object of class named 'Comissioned' is stored in the instance of class
                // named 'Employee'.
                employees[numOfEmployees] = commissionedEmployees[numOfCommissioned];
                numOfCommissioned++;
                numOfEmployees++;
            }

            else {
                System.out.println("Unknown Employee Type");
            }

            System.out.print("Press 'y' to enter another employee information (exit: n): ");
            choice = scan.next();

        }

        System.out.println("\nName\t\tClass\t\tHours\tSales\tRate\tWeekely Pay");
        System.out.println("===================================================================");

        boolean bonus = true;
        boolean bonusActivated = false;
        double total = 0.00;

        // Create a 'for-loop' to display the information in the instance variable named
        // 'employees'
        for (int index = 0; index < numOfEmployees; index++) {
            if (employees[index].getClass().getName().equals("Salaried") && bonus == true) {
                System.out.println(employees[index].getFirstName() + " " + employees[index].getLastName() + "\t" +
                        employees[index].getClass().getName() + "\t\t\t\t"
                        + (employees[index].earnings() + (employees[index].earnings() * 0.10)) + "*");
                bonus = false;
                bonusActivated = true;

                total += employees[index].earnings() + (employees[index].earnings() * 0.10);
            } else {
                System.out.println(employees[index]);
                total += employees[index].earnings();
            }

        }
        System.out.println("===================================================================");
        System.out.printf("Total: $%.2f\n", total);
        if (bonusActivated = true) {
            System.out.println("*A 10% bonus is awarded");
        }

    }
}