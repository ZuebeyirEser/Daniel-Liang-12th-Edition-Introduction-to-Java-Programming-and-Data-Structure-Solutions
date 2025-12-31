package Chapter3;

public class Ex3_24 {
    public static void main(String[] args){
        /*
        (Game: pick a card) Write a program that simulates picking a card from a deck of 52 cards.
         Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King)
         and suit (Clubs, Diamonds, Hearts, Spades) of the card.
        */
        int pickACard = (int)(Math.random() * 52);

        //for debugging i am printing random number as well
        System.out.println(pickACard);
        String[] deck = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        if (pickACard < 13)
            System.out.println("The card you picked is " + deck[pickACard] + " of " + " Clubs");
        else if (13 <= pickACard && pickACard < 26)
            System.out.println("The card you picked is " + deck[pickACard - 13] + " of " + " Diamonds");
        else if (26 <= pickACard && pickACard < 39)
            System.out.println("The card you picked is " + deck[pickACard - 13 * 2] + " of " + " Hearts");
        else
            System.out.println("The card you picked is " + deck[pickACard - 13 * 3] + " of " + " Spades");

    }
}
