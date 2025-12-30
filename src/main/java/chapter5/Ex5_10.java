package Chapter5;

public class Ex5_10 {
    /*(Find numbers divisible by 5 and 6) Write a program that displays all the numbers
     from 100 to 1,000 (10 per line) that are divisible by 5 and 6.
     Numbers are separated by exactly one space.*/
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                count++; //whenever we print i count is incremented.
                if (count == 10) {
                    System.out.println();// just jumps to next line
                    count = 0; // need to reset count after counting till 10
                }
            }
        }
    }
}
