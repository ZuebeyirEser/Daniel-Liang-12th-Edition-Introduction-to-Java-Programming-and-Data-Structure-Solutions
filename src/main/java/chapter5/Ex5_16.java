package Chapter5;

import java.util.Scanner;

public class Ex5_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integer:  ");
        int number = input.nextInt();

        input.close();

        System.out.println("Smalles factors of " + number + ": " );
        smallestFactors(number);

    }
    public static void smallestFactors(int n) {
        int factor = 2;

        while (n > 1) {
            if (n % factor == 0) {
                System.out.print(factor + " ");
                n = n / factor;
            } else {
                factor++;

            }
        }

    }
}
