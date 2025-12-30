package Chapter6;

public class Ex6_6 {
    public static void main(String[] args) {
        display(5);
    }
    public static void display(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0;j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
