package Chapter5;

public class Ex5_13 {
    /*Find the largest n such that n^3 < 12,000*/
    public static void main(String[] args) {
        int n = 0;
        while (n*n*n < 12000) {
            n++;
        }
        //since from our last iteration n^3 is larger than 12000 we need to decrement so that value will satisfy the condition.
        n--;
        System.out.println("Largest n is " + n);

    }
}
