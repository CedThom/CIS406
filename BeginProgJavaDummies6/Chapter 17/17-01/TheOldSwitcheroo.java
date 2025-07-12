import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class TheOldSwitcheroo {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var myRandom = new Random();
        int randomNumber;

        out.print("Type your question, my child: ");
        keyboard.nextLine();
        randomNumber = myRandom.nextInt(10) + 1;

        switch (randomNumber) {
            case 1 -> out.println("Yes. Isn't it obvious?");
            case 2 -> out.println("What part of 'no' don't you understand?");
            case 3 -> out.println("Yessir, yessir! Three bags full.");
            case 4, 5 -> out.println("No, and don't ask again.");
            case 6 -> out.println("Sure, whatever.");
            case 7 -> out.println("Yes, but only if you're nice to me.");
            case 8 -> {
                out.print("Yes (as if I care).");
                out.println(" Next time, take your problem somewhere else.");
            }
            case 9 -> out.println("No, not until Cromwell seizes Dover.");
            case 10 -> out.println("No, not until Nell squeezes Rover.");
            default -> out.println("My random number generator is broken!");
        }

        out.println("Goodbye");

        keyboard.close();
    }
}
