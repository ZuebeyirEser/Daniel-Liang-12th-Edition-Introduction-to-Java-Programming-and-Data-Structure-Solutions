package Chapter5;

public class Ex5_24 {
    public static void main(String[] args) {
        double sum = 0.0D;
        for (int i = 97; i>0; i =- 2) {
            sum += (double) i / (i + 2);
        }
        System.out.println(sum);
    }
}
