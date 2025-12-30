package Chapter6;

public class Ex6_13 {
    public static double sumSeries(int i) {
        double sum = 0.0;
        for (int j = 1; j <= i; j++) {
            sum += (double) j / (j + 1);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(" m(i)");

        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-2d %.4f%n", i, sumSeries(i));
        }
    }
}
