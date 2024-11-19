package Chapter7;


import java.util.Arrays;
import java.util.Scanner;

public class Ex7_35 {
    public static void main(String[] args) {
        String[] words = {"adventure", "horizon", "inspire", "whisper", "tranquil", "galaxy", "moment", "breeze", "dream", "explore"};
        int randomNumber = (int) (Math.random() * words.length);
        String selectedWord = words[randomNumber];
        Scanner input = new Scanner(System.in);

        char[] userGuessArray = new char[selectedWord.length()];
        for (int i = 0; i < userGuessArray.length; i++){
            userGuessArray[i] = '*';
        }

        int count = 0;

        System.out.println("(Guess) Enter a letter in word " + Arrays.toString(userGuessArray));
        while (!String.valueOf(userGuessArray).equals(selectedWord)) {
            char userGuess = input.next().charAt(0);
            if (linearSearch(userGuessArray,userGuess) != -1) {
                System.out.println(userGuess + " is not in the word");
                count++;
                continue;
            }
            boolean found = false;
            for (int i = 0; i < selectedWord.length(); i++) {
                if (selectedWord.charAt(i) == userGuess) {
                    userGuessArray[i] = userGuess;
                    found = true;
                }
            }
            if (!found) {
                System.out.println(userGuess + " is not in the word");
                count++;
            }
            System.out.println("(Guess) Enter a letter in word " + String.valueOf(userGuessArray));

        }
        System.out.println("The word is " + words[randomNumber] + " You missed " + count + " time");




    }
    public static int linearSearch(char[] userGuessArray, char key) {
        for (int i = 0; i < userGuessArray.length;i++) {
            if (userGuessArray[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
