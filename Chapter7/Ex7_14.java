package Chapter7;

public class Ex7_14 {
    public static void main(String[] args) {
        System.out.println(gcd(420, 10,77));
    }
    public static int gcdOfTwo(int a, int b) {
        while (b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static int gcd(int... numbers) {
        int result = numbers[0];

        for (int i = 1;i < numbers.length;i++) {
            result = gcdOfTwo(result,numbers[i]);
        }
        return result;
    }
}
