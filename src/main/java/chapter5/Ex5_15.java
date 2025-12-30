package Chapter5;

import java.util.Scanner;

public class Ex5_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the beginning of ascii character :");
        String startString = input.nextLine();


        System.out.println("enter the last of ascii character :");
        String endString = input.nextLine();

        char startChar = startString.charAt(0);
        char endChar = endString.charAt(0);
        int count = 0;
        for (char k = startChar; k <= endChar;k++) {
            System.out.print(k + " ");
            count++;

            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }


    }
}
