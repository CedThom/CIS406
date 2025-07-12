import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

public class ShowOccupancy {

    public static void main(String[] args) throws FileNotFoundException {
        var diskScanner = new Scanner(new File("occupancy"));

        out.println("Room    Guests");

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            out.print(roomNum);
            out.print("       ");
            out.println(diskScanner.nextInt());
        }

        diskScanner.close();
    }
}
