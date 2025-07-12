import java.util.Scanner;

public class JazzyEchoLine {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        String lineIn;

        lineIn = keyboard.nextLine();
        System.out.println(lineIn);

        keyboard.close();
    }
}
