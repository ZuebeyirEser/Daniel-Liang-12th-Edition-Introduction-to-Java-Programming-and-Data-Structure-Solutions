package Chapter6;
/*
* (Palindromic prime) A palindromic prime is a prime number and also palindromic.
* For example, 131 is a prime and also a palindromic prime, as are 313 and 757.
* Write a program that displays the first 100 palindromic prime numbers.
* Display 10 numbers per line, separated by exactly one space, as follows:
    2 3 5 7 11 101 131 151 181 191
    313 353 373 383 727 757 787 797 919 929
*
*
*
* */

public class Ex6_26 {

    private static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindromicPrime(int number) {
        return isPalindrome(number) && isPrime(number);
    }

    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count < 100) {
            if (isPalindromicPrime(number)) {
                System.out.print(number + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }
}

