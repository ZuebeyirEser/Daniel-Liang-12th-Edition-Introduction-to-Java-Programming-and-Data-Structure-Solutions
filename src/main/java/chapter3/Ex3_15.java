package Chapter3;

import java.util.Scanner;
public class Ex3_15 {
    public static void main(String[] args){
        /*(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three- digit integer.
         The program prompts the user to enter a three-digit integer and
          determines whether the user wins according to the following rules:
        1. If the user input matches the lottery number in the exact order, the award is $10,000.
        2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
        3. If one digit in the user input matches a digit in the lottery number, the award is $1,000. */
        Scanner input = new Scanner(System.in);

        int lottery = (int)(Math.random() * 1000);
        // in order to avoid 2 digit random number
        //if (lottery < 100)
        //    lottery += 100;

        System.out.println("Please enter the lottery number: ");
        int userTicketNumber = input.nextInt();


        int firstDigitLottery = lottery / 100;
        int secondDigitLottery = (lottery / 10) % 10;
        int lastDigitLottery = lottery % 10;

        int firstDigitUser = userTicketNumber / 100;
        int secondDigitUser = (userTicketNumber / 10) % 10;
        int lastDigitUser = userTicketNumber % 10;

        System.out.println("The lottery number is: " + lottery);
        System.out.println("Your ticket number is: " + userTicketNumber);
        if (lottery == userTicketNumber) {
            System.out.println("Congrats! you won 10,000 usd!");
        } else if ((firstDigitUser == firstDigitLottery || firstDigitUser == secondDigitLottery || firstDigitUser == lastDigitLottery) &&
                (secondDigitUser == firstDigitLottery || secondDigitUser == secondDigitLottery || secondDigitUser == lastDigitLottery) &&
                (lastDigitUser == firstDigitLottery || lastDigitUser == secondDigitLottery || lastDigitUser == lastDigitLottery))
            System.out.println("Match all digits: you win 3,000 usd!");
        else if ((firstDigitUser == firstDigitLottery || firstDigitUser == secondDigitLottery || firstDigitUser == lastDigitLottery) ||
                (secondDigitUser == firstDigitLottery || secondDigitUser == secondDigitLottery || secondDigitUser == lastDigitLottery) ||
                (lastDigitUser == firstDigitLottery || lastDigitUser == secondDigitLottery || lastDigitUser == lastDigitLottery))
            System.out.println("Match only one digits: you win 1,000 usd! Please note that there are extra prize for two digit match");
        else
            System.out.println("No match try next time :)");


    }
}
