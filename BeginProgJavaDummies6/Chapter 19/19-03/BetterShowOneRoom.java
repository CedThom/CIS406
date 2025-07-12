import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

public class BetterShowOneRoom {

    public static void main(String[] args) throws FileNotFoundException {
        var keyboard = new Scanner(System.in);
        var diskScanner = new Scanner(new File("occupancy"));
        int whichRoom;

        out.print("Which room? ");
        whichRoom = keyboard.nextInt();

        for (int roomNum = 0;
                     roomNum < whichRoom && diskScanner.hasNext();
                     roomNum++) {
            diskScanner.nextInt();
        }

        if (diskScanner.hasNext()) {
            out.print("Room ");
            out.print(whichRoom);
            out.print(" has ");
            out.print(diskScanner.nextInt());
            out.println(" guest(s).");
        }

        keyboard.close();
        diskScanner.close();
    }
}
