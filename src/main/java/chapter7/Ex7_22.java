package Chapter7;

public class Ex7_22 {
    public static void main(String[] args) {
        String input = "";
        for (int i = 0; i < args.length;i++) {
            input += args[i] + " ";
        }
        int uppercaseCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                uppercaseCount++;
            }
        }
    }
}
