package Chapter6;

public class Ex6_29 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void findTwinPrimes(int limit) {
        for (int num = 2; num < limit - 1; num++) {
            if (isPrime(num) && isPrime(num + 2)) {
                System.out.println(num + " and " + (num + 2) + " are twin primes.");
            }
        }
    }

    public static void main(String[] args) {
        int limit = 10000;
        findTwinPrimes(limit);
    }
}
