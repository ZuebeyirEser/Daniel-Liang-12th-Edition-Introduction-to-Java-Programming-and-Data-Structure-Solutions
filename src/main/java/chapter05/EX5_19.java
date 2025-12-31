package Chapter5;

import java.util.Scanner;

public class EX5_19 {

    /*
        1
       121
      12412
     1248421


     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of lines: ");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1;j <= rows - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
