import java.util.Scanner;

public class Ex2_21 {
/*(Financial application: calculate future investment value) Write a program that 
reads in investment amount, annual interest rate, and number of years and displays
the future investment value using the following formula:
futureInvestmentValue = investmentAmount*((1+monthlyInterestRate)^numberOfYears*12) years and displays the
future investment value.
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.println("Please enter the annual interest rate: e.g. 5");
        double annualInterestRate = input.nextDouble();

        System.out.println("Please enter the number of years that you want to invest: ");
        double numberofYears = input.nextDouble();

        double futureInvestmentValue = investmentAmount * Math.pow(1 + (annualInterestRate/1200), numberofYears*12);
        futureInvestmentValue = Math.round(futureInvestmentValue*100)/100.0;

        System.out.println("Future value is: " + futureInvestmentValue);
        
    }
}
