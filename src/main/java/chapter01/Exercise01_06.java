package chapter01;

public class Exercise01_06 {
    /*Write a program that displays the result of 1 + 2+ ...+9*/
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <10; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
