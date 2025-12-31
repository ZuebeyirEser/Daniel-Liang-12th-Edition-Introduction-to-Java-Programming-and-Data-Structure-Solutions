package Chapter6;

import java.util.Scanner;

public class Ex6_22 {

    public static double sqrt(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot compute the square root of a negative number.");
        }
        // Initial guess
        double lastGuess = 1.0;
        double nextGuess = 0.0;

        // Continue approximating until the guesses are close enough
        do {
            nextGuess = (lastGuess + n / lastGuess) / 2.0;
            if (Math.abs(nextGuess - lastGuess) < 0.0001) {
                break;
            }
            lastGuess = nextGuess;
        } while (true);

        return nextGuess;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive long value to calculate its square root: ");
        long n = scanner.nextLong();

        double result = sqrt(n);
        System.out.printf("The approximate square root of %d is: %.4f%n", n, result);
    }
}
