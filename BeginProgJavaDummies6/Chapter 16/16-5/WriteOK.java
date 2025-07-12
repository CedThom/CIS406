import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WriteOK {

    public static void main(String[] args) throws FileNotFoundException {

        var diskWriter = new PrintStream(new File("approval.txt"));

        diskWriter.print  ('O');
        diskWriter.println('K');

        diskWriter.close();
    }
}
