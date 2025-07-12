/*
 * This code does NOT work (but you learn from your mistakes).
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ListAllUsernames {

    public static void main(String[] args) throws FileNotFoundException {

        var diskScanner = new Scanner(new File("email.txt"));
        var diskWriter = new PrintStream("usernames.txt");
        char symbol;

        while (diskScanner.hasNext()) {
            symbol = diskScanner.findWithinHorizon(".", 0).charAt(0);

            while (symbol != '@') {
                diskWriter.print(symbol);
                symbol = diskScanner.findWithinHorizon(".", 0).charAt(0);
            }
            diskWriter.println();
        }

        diskScanner.close();
        diskWriter.close();
    }
}
