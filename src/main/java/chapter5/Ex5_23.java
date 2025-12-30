package Chapter5;

public class Ex5_23 {
    public static void main(String[] args) {
        double sum = 0.0D;
        for (int i = 50000; i > 0; i--) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
