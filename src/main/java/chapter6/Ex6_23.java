package Chapter6;

import java.util.Scanner;

public class Ex6_23 {

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        int occurrences = count(str, ch);
        System.out.println("The character '" + ch + "' appears " + occurrences + " time(s) in the string.");
    }
}
