package Chapter7;

public class Exercise07_29 {
    /*
    * Write a program that picks four cards from a deck of 52 cards and computes their sum.
    * An Ace, King, Queen, and Jack represent 1, 13, 12, and 11, respectively.
    * Your program should display the number of picks that yields the sum of 24.
    * */
    public static void main(String[] args) {
        // 1 is Ace 11 is Jack, 12 is Queen, 13 is King
        String[] typeOfCards = {"heats","diamonds","clubs","spades"};
        int[] Cards = {1,2,3,4,5,6,7,8,9,10,11,12,13};


        int numberOfPicks = 4;
        int sum = 0;
        while (sum != 24) {

        }


    }
    public static int getRandomIndex() {
        return (int) (Math.random() * 14);
    }
    public static void pickedCard() {

    }

}
