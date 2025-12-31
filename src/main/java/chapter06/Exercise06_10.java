package Chapter6;

public class Ex6_10 {
    public static void main(String[] args) {
        int primeCount = 0;
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                primeCount++; // Increment the count if the number is prime
            }
        }
        System.out.println("The number of prime numbers less than 10,000 is: " + primeCount);
    }
	public static boolean isPrime(int num) {
        for (int div = 2;div <= num / 2 ; div++) {
            if (num % div == 0) {
                return false;
            }
        }
        return true;
    }
}
