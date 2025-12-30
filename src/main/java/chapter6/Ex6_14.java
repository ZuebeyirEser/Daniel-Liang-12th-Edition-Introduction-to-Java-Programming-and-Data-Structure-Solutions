package Chapter6;

public class Ex6_14 {
    public static double estimatePi(int i) {
        double sum = 0.0;
        for (int j = 1; j <= i; j++) {
            sum += Math.pow(-1, j + 1) / (2 * j - 1);
        }
        return 4 * sum;
    }

    public static void main(String[] args) {
        System.out.println(" i    m(i)");

        for (int i = 1; i <= 90001; i += 100) {
            System.out.printf("%-4d %.4f%n", i, estimatePi(i));
        }
    }
}
