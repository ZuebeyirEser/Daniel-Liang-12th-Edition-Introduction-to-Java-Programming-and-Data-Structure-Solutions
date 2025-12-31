package Chapter3;

public class Ex3_16 {
    public static void main(String[] args){
        /*(Random point) Write a program that displays a random coordinate in a rectangle.
         The rectangle is centered at (0, 0) with width 100 and height 200.*/
        /*Solution
        * y cordinate can be 100 to -100 and x can be -50 to 50*/
        int yCordinate = -100 + (int)(Math.random() * 200 + 1);
        int xCordinate = -50 + (int)(Math.random() * 100 + 1);

        System.out.println("This cordinate is inside of our rectangle " + "(" + xCordinate + "," + yCordinate + ")");




    }
}
