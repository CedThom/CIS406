import static java.lang.System.out;

public class LessTalking {

    public static void main(String[] args) {

        for (int count = 0; count < 10; count++) {
            if (count % 3 == 0) {
                out.print("I've chewed ");
                out.print(count);
                out.println(" time(s).");
            }
        }
        out.println("10 times! Hooray!");
        out.println("I can swallow!");
    }
}

