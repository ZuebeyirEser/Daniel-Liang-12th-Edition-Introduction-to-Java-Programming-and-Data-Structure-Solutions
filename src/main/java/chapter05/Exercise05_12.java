package Chapter5;

public class Ex5_12 {
    /*Find the smallest n such that n^2 > 12,000*/
    public static void main(String[] args) {
        int n = 0;
        while (n*n <= 12000) {
            n++;
        }
        System.out.println("Smalles n is " + n);


    }
}
