import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ListOneUsername {

    public static void main(String[] args) throws FileNotFoundException {

        var diskScanner = new Scanner(new File("email.txt"));
        var diskWriter = new PrintStream("usernames.txt");
        char symbol;

        symbol = diskScanner.findWithinHorizon(".", 0).charAt(0);

        while (symbol != '@') {
            diskWriter.print(symbol);
            symbol = diskScanner.findWithinHorizon(".", 0).charAt(0);
        }
        diskWriter.println();

        diskScanner.close();
        diskWriter.close();
    }
}
