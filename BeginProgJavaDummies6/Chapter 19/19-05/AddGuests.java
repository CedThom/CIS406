import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class AddGuests {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        int whichRoom, numGuests;
        var guestsIn = new int[10];

        Arrays.fill(guestsIn, 0);

        do {
            out.print("Room number: ");
            whichRoom = keyboard.nextInt();
            out.print("How many guests? ");
            numGuests = keyboard.nextInt();
            guestsIn[whichRoom] = numGuests;
            out.println();
            out.print("Do another? ");
        } while (keyboard.findWithinHorizon(".", 0).charAt(0) == 'Y');
        out.println();

        out.println("Room    Guests");
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            out.print(roomNum);
            out.print("       ");
            out.println(guestsIn[roomNum]);
        }

        keyboard.close();
    }
}
