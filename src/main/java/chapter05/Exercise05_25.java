package Chapter5;

public class Ex5_25 {
    public static void main(String[] args) {
        double sum = 0.0D;
        for (int i = 1; i <= 100000; i++) {
            double nominator = Math.pow(-1,i+1);
            double denominator = 2 * i - 1;
            sum += nominator / denominator;
        }
        System.out.println(sum*4);
    }
}
