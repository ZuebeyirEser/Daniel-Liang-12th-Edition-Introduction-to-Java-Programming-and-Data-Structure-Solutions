package Chapter6;

public class Ex6_3 {
    public static void main(String[] args) {
        // test
        System.out.println(isPalindrome(12345));
        System.out.println(isPalindrome(54345));
    }
    public static int reverse(int n) {
        // let assume we have 12345
        // 12345 % 10 = 5
        // and create reversed number which is initially will be equal to 0
        // if we multiply reversed number each time with 10 and add the
        // reminder as well to reversedNumber we will be able to extract palindrome
        int reversedNumber = 0;
        while (n != 0) {
            reversedNumber = (reversedNumber * 10) + (n % 10);
            n /= 10;
        }
        return reversedNumber;
    }
    public static boolean isPalindrome(int n) {
        return  (n == reverse(n));
    }
}
