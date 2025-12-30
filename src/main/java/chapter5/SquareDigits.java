package Chapter5;



public class SquareDigits {
    public static int squareDigit(int n) {
        int result = 0;
        int placeValue = 1;
        while (n>0) {
            int digit = n % 10; // Extract the last digit
            int squaredDigit = digit * digit; // Square the digit
            result = result + squaredDigit * placeValue; // Add the squared digit to the result
            placeValue *= 100; // Update the place value for next digit
            n /= 10; // Move to the next digit
        }
        return result;
    }

}