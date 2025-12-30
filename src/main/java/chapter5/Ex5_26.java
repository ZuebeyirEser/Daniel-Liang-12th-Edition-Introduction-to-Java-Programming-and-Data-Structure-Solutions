package Chapter5;



public class Ex5_26 {
    public static void main(String[] args) {
        double sum = 1;
        for (int i = 1; i <= 20; i++) {
            sum += 1 / factorial(i);
        }
        System.out.println(sum);
    }

    public static double factorial(int x) {
        int sum = 1;
        if (x == 0) {
            return 1;
        }
        if (x < 0) {
            return -1;
        }
        for (int i = x; i > 0; i--) {
            sum *= i;
        }
        return sum;
    }
}
