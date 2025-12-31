package Chapter4;

import java.util.Scanner;
public class Ex4_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal value (0 to 15): ");
        int decimalNumber = input.nextInt();
        String[] hexString = {"A", "B", "C", "D", "E", "F"};
        int hexNumber = decimalNumber % 10;
        if (decimalNumber > 15 || decimalNumber < 0){
            System.out.println(decimalNumber +  " is an invalid input");
            System.exit(1);
        } else if (decimalNumber < 10) {
            System.out.println("The hex value is " + decimalNumber);
        } else {
            System.out.println("The hex value is " + hexString[hexNumber]);
        }

    }
}
