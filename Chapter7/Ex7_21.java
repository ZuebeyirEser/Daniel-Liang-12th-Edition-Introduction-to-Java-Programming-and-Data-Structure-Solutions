package Chapter7;

import java.util.Scanner;

public class Ex7_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to sum up (end with 0): ");
        while (true) {
            sum += input.nextInt();
            if (input.nextInt() == 0) {
                break;
            }
        }
        System.out.println("sum is " + sum);
    }
}
