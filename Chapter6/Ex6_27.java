package Chapter6;

public class Ex6_27 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        // Continue until we find 100 emirps
        while (count < 100) {
            if (isEmirp(number)) {
                // Print number with proper spacing
                System.out.print(number);
                count++;

                // Check if we need a new line
                if (count % 10 == 0) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
            number++;
        }
    }

    // Check if a number is an emirp
    public static boolean isEmirp(int num) {
        // First check if it's prime
        if (!isPrime(num)) {
            return false;
        }

        // Get the reverse of the number
        int reverse = reverseNumber(num);

        // Check if it's palindromic (not allowed for emirps)
        if (num == reverse) {
            return false;
        }

        // Check if reverse is also prime
        return isPrime(reverse);
    }

    // Check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}