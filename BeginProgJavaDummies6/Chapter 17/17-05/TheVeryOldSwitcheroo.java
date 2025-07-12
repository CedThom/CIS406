import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class TheVeryOldSwitcheroo {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var myRandom = new Random();
        int randomNumber;

        out.print("Type your question, my child: ");
        keyboard.nextLine();
        randomNumber = myRandom.nextInt(10) + 1;

        switch (randomNumber) {
            case 1:
                out.println("Yes. Isn't it obvious?");
                break;
            case 2:
                out.println("What part of 'no' don't you understand?");
                break;
            case 3:
                out.println("Yessir, yessir! Three bags full.");
                break;
            case 4:
            case 5:
                out.println("No, and don't ask again.");
                break;
            case 6:
                out.println("Sure, whatever.");
                break;
            case 7:
                out.println("Yes, but only if you're nice to me.");
                break;
            case 8:
                out.print("Yes (as if I care).");
                out.println(" Next time, take your problem somewhere else.");
                break;
            case 9:
                out.println("No, not until Cromwell seizes Dover.");
                break;
            case 10:
                out.println("No, not until Nell squeezes Rover.");
                break;
            default:
                out.println("My random number generator is broken!");
        }

        out.println("Goodbye");

        keyboard.close();
    }
}
