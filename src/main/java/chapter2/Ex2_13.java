import java.util.Scanner;

public class Ex2_13 {
    /* (Financial application: compound value) Suppose you save $100 each month into 
    a savings account with an annual interest rate of 5%. Thus, the monthly interest 
    rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
    100 * (1 + 0.00417) = 100.417
    After the second month, the value in the account becomes
    (100 + 100.417) * (1 + 0.00417) = 201.252
    After the third month, the value in the account becomes
    (100 + 201.252) * (1 + 0.00417) = 302.507
    and so on.
    Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month. (In Programming Exercise 5.30, you 
    will use a loop to simplify the code and display the account value for any month.) */
    public static void main(String[] args) {
        final double MONTHTLYINTERESRATE = 0.05/12;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the amount of saving: ");
        double monthlySavingAmount = input.nextDouble();

        System.out.println("Please enter the number of months: ");
        int numberMonths = input.nextInt();

        double totalAmount = 0;


        for(int i = 1; i <= numberMonths; i++){
            totalAmount = (totalAmount+monthlySavingAmount)*(1 + MONTHTLYINTERESRATE);
            
        }
        System.out.print("After month " + numberMonths + "The amount of money in your saving account is: " + totalAmount);
    }
}
