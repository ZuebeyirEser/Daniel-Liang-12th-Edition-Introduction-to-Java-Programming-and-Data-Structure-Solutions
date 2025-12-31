package Chapter6;

public class Exercise06_28 {
    public static void main(String[] args) {
        // Print header
        System.out.printf("%-10s%s\n", "p", "2^p - 1");

        // Check each value of p up to 31
        for (int p = 2; p <= 31; p++) {
            long mersenne = calculateMersenne(p);

            // Check if the Mersenne number is prime
            if (isPrime(mersenne)) {
                System.out.printf("%-10d%d\n", p, mersenne);
            }
        }
    }

    // Calculate Mersenne number (2^p - 1)
    public static long calculateMersenne(int p) {
        // Using bit shift for power of 2, then subtract 1
        return (1L << p) - 1;
    }

    // Check if a number is prime
    public static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }

        // Only need to check up to square root
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}