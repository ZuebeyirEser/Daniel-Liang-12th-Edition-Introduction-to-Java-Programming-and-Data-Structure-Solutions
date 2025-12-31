package Chapter7;

public class Exercise07_21 {
    public static void main(String[] args) throws NumberFormatException {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);
            sum += number;
        }
        System.out.println("Sum is: "  + sum);
    }
    /* Note in order to run you need to compile commandline  java Chapter7.Ex7_21 10 20 30
    * dont forget to javac first*/
}
