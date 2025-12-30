package Chapter6;
/*
 * (Sum the digits in an integer)
 * This program defines a method that computes the sum of the digits in a given integer.
 * The method takes a long integer as input and returns the sum of its digits.
 *
 * Method header:
 * public static int sumDigits(long n)
 *
 * The sumDigits method works as follows:
 * 1. It repeatedly extracts the last digit of the number using the modulo operator (n % 10).
 * 2. It adds the extracted digit to the running sum.
 * 3. The number is then divided by 10 to remove the last digit (n / 10).
 * 4. This process continues until the number becomes 0.
 *
 * Example:
 * If the input is 234, the method will compute the sum as:
 * 2 + 3 + 4 = 9
 *
 * The method returns the final sum of the digits.
 */

public class Ex6_2 {
    public static void main(String[] args) {
        System.out.println(sumDigits(9988));
    }
    public static int sumDigits(int n) {
        int sum = 0;
        // let assume we have 12345
        // 12345 % 10 = 5 Add to our sum
        // remove last digit simply diving by 10
        // 1234 and repeat
        while (n >= 1) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
