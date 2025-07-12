import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class ShowNames {

    public static void main(String[] args) throws FileNotFoundException {

        var people = new ArrayList<String>();
        var diskScanner = new Scanner(new File("names.txt"));

        while (diskScanner.hasNext()) {
            people.add(diskScanner.nextLine());
        }

        out.println(people);

        people.remove(0);
        out.println(people);

        people.add(2, "Walter Poleshuck");
        out.println(people);

        out.println(people.get(4));

        diskScanner.close();
    }
}
