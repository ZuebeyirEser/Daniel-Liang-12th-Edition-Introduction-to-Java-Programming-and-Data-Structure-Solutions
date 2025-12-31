package Chapter3;

import java.util.Scanner;
public class Ex3_31 {
    public static void main(String[] args){
        /*(Financials: currency exchange) Write a program that prompts the user to enter the exchange rate from
        currency in U.S. dollars to Chinese RMB. Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB
        and 1 to convert from Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S. dollars or
        Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively*/
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();

        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: 0");
        int status = input.nextInt();

        if (status == 0){
            System.out.println("Enter the dollar amount:");
            double amount = input.nextDouble();
            double money = amount * exchangeRate;
            System.out.println(amount + " usd is " + (int)(money * 100 / 100) + " yuan" );
        } else if (status == 1){
            System.out.println("Enter the RMB amount:");
            double amount = input.nextDouble();
            double money = amount / exchangeRate;
            System.out.println(amount + " yuan is " + (int)(money * 100 / 100) + " usd" );
        }








    }
}
