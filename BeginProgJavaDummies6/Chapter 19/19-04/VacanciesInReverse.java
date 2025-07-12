import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VacanciesInReverse {

    public static void main(String[] args) throws FileNotFoundException {
        var diskScanner = new Scanner(new File("occupancy"));
        var guestsIn = new int[10];

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            guestsIn[roomNum] = diskScanner.nextInt();
        }

        for (int roomNum = 9; roomNum >= 0; roomNum--) {
            if (guestsIn[roomNum] == 0) {
                System.out.print("Room ");
                System.out.print(roomNum);
                System.out.println(" is vacant.");
            }
        }

        diskScanner.close();
    }
}
