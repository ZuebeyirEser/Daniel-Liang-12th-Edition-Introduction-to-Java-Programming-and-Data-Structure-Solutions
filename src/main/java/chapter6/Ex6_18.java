package Chapter6;

public class Ex6_18 {
    public static void main(String[] args) {
        System.out.println(isPasswordValid("1ddasddas"));
    }
    public static boolean isPasswordValid(String s) {
        if (s.length() < 8) {
            return false;
        }
        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) > 47 && s.charAt(i) < 58 ||
                    s.charAt(i) > 64 && s.charAt(i) < 91 ||
                    s.charAt(i) > 96 && s.charAt(i)< 123) {
                if (s.charAt(i) > 47 && s.charAt(i) < 58) {
                    count++;
                }
                if(count < 2) {
                    return false;
                }
            }
        }
        return true;

    }
}
