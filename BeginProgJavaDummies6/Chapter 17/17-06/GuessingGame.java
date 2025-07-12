import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var myRandom = new Random();
        int randomNumber;
        int guess;
        String reply;

        randomNumber = myRandom.nextInt(10) + 1;

        System.out.print("Guess a number from 1 to 10: ");
        guess = keyboard.nextInt();

        reply = (guess == randomNumber) ? "You win!" : "You lose.";
        System.out.println(reply);

        keyboard.close();
    }

}
