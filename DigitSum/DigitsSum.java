//import scanner
import java.util.Scanner;
//Java class
public class DigitsSum {

    public static void main(String[] args) {
        //3 var with initial values of 0 for place holder
        int number, digit, sum = 0;
        //scanner for user input in terminal
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number between 0 - 100: ");
        //store input value in number var
        number = sc.nextInt();
        //use while loop to check the input value is between 0-1000
        while (number > 0 && number < 1000) {
            //finds the last digit of the given number  
            digit = number % 10;
            // adds last digit to the variable sum
            sum = sum + digit;
            // removes the last digit from the number
            number = number / 10;

        }
        System.out.println("result: " + sum);
    }

}
