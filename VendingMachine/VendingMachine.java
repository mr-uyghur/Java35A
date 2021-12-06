//import Scanner
import java.util.Scanner;

public class VendingMachine {

  public static void main(String[] args) {

    // use infinite loop so program reapet till it's shut off.
    boolean true_statement = true;
     // store food and its quantity in vars
    int totalPotatoChips = 3;
    int totalCookies = 3;
    int totalCandies = 3;
    while (true_statement) {
      // food price
      double potatoChips = 1.25;
      double cookies = 0.85;
      double candies = 0.95;
      // store coins with its balance in vars
      int dollar = 1;
      double quarter = 0.25;
      double dime = 0.10;
      double nickel = 0.05;
      // users total amount
      double totalAmount = 0.00;
      // Ask user to enter their coin individually then add them all up together to
      // get the total amount of $ user has
      Scanner scan = new Scanner(System.in);
      
      System.out.print("How many quarters do you have?: ");
      int q = scan.nextInt();
      totalAmount += (q * quarter);
      System.out.print("How many dimes do you have?: ");
      int d = scan.nextInt();
      totalAmount += (d * dime);
      System.out.print("How many nickels do you have?: ");
      int n = scan.nextInt();
      totalAmount += (n * nickel);
      System.out.println("1.Potato chips");
      // Display statement
      System.out.println("2.Cookies");
      // Display statement
      System.out.println("3.Candy");
      // Display statement
      System.out.print("Please Enter your choice (1-3) or press (0) to exit:");

      int userOption = scan.nextInt();
     
      // if user chooses potato chip
      if (userOption == 1) {
        // check if we have enough potato chips
        if (totalPotatoChips > 0) {
          // if we have enough chips then check if user have enough money
          if (totalAmount > potatoChips) {
            double change = Math.round((totalAmount - potatoChips) * 100);
            totalPotatoChips--;
            System.out.println("Please take a your Potato chips.");
            if (change > 0)
            {
              quarter = (int) (change / 25);
              // calculate change
              change = change - quarter * 25;
              dime = (int) (change / 10);
              // calculate change
              change = change - dime * 10;
              nickel = (int) (change / 5);
              // Display statement
              System.out.println("Please take a your change:");
              // Display statement
              System.out.println("quarter : " + quarter + "\n" + "Dime : " + dime + "\n" + "Nickel : " + nickel);
            }
          }
          // print user don't have enough money
          else
          {
            System.out.println("Not enough funds! Enter more coins.");
          }
        }
        // print sorry we are out of stock!
        else{
          System.out.println("Sold out. Please make another choice");
        }

      }

      else if (userOption == 2) {
        // check if we have enough potato chips
        if (totalCookies > 0) {
          // if we have enough chips then check if user have enough money
          if (totalAmount > cookies) {
            double change = Math.round((totalAmount - potatoChips) * 100);
            totalCookies--;
            System.out.println("Please take a your Cookies.");
            if (change > 0)
            {
              quarter = (int) (change / 25);
              // calculate change
              change = change - quarter * 25;
              dime = (int) (change / 10);
              // calculate change
              change = change - dime * 10;
              nickel = (int) (change / 5);
              // Display statement
              System.out.println("Please take a your change:");
              // Display statement
              System.out.println("quarter : " + quarter + "\n" + "Dime : " + dime + "\n" + "Nickel : " + nickel);
            }
          }
          // print user don't have enough money
          else
          {
            System.out.println("Not enough funds! Enter more coins.");
          }
        }
        // print sorry we are out of stock!
        else{
          System.out.println("Sold out. Please make another choice");
        }

      }

      else if (userOption == 3) {
        // check if we have enough potato chips
        if (totalCandies > 0) {
          // if we have enough chips then check if user have enough money
          if (totalAmount > candies) {
            double change = Math.round((totalAmount - potatoChips) * 100);
            totalCandies--;
            System.out.println("Please take a your candies.");
            if (change > 0)
            {
              quarter = (int) (change / 25);
              // calculate change
              change = change - quarter * 25;
              dime = (int) (change / 10);
              // calculate change
              change = change - dime * 10;
              nickel = (int) (change / 5);
              // Display statement
              System.out.println("Please take a your change:");
              // Display statement
              System.out.println("quarter : " + quarter + "\n" + "Dime : " + dime + "\n" + "Nickel : " + nickel);
            }
          }
          // print user don't have enough money
          else
          {
            System.out.println("Not enough funds! Enter more coins.");
          }
        }
        // print sorry we are out of stock!
        else{
          System.out.println("Sold out. Please make another choice");
        }
      }

      else if (userOption == 0)
      {
        true_statement = false;
      }

      else if (userOption > 3){
        System.out.println("You must select from given the options!");
      }
        
      
    }
    
    

  }

}

