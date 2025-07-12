import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ReadAndWrite {

    public static void main(String[] args) throws FileNotFoundException {
        var diskScanner = new Scanner(new File("rawData.txt"));
        var diskWriter = new PrintStream("cookedData.txt");
        double unitPrice, total;
        int quantity;

        unitPrice = diskScanner.nextDouble();
        quantity = diskScanner.nextInt();

        total = unitPrice * quantity;

        diskWriter.println(total);

        diskScanner.close();
        diskWriter.close();
    }
}
