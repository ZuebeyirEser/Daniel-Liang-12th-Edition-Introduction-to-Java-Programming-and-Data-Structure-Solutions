package Chapter5;

import java.util.Scanner;
public class Ex5_17 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of lines: ");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int k = rows - i; k > 0; k--) {
                System.out.print("  ");
            }
            for (int j = i;j >= 1 ; j--) {
                System.out.print(j + " ");
            }
            for (int s = 2; s <= i;s++) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }
}
