package Chapter6;
/*
 * This program prints the first 100 pentagonal numbers in a formatted manner.
 * A pentagonal number is defined by the formula:
 * P(n) = n(3n - 1)/2, where n is the position of the number in the sequence.
 *
 * The main method iterates through numbers 1 to 100 and calls the getPentagonalNumber method
 * to calculate the pentagonal number for each position.
 *
 * The program prints 10 pentagonal numbers per line. This is achieved by using the modulo operator (%)
 * to check if the current number's position (i) is divisible by 10. After every 10 numbers, a new line is printed.
 *
 * The formatting is done using the System.out.printf method, with a format specifier of "%7d" to ensure
 * each number is printed with 7 spaces for alignment.
 *
 */

public class Ex6_1 {
    public static void main(String[] args) {
        for (int i = 1; i < 101;i++) {
            System.out.printf("%7d", getPentagonalNumber(i));
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
    public static int getPentagonalNumber(int n) {
        return (n * (3*n -1))/2;
    }
}
