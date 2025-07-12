import java.util.Scanner;

import static java.lang.System.out;

public class Scoreboard {

    enum WhoWins {home, visitor, neither}

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        int hankees, socks;
        WhoWins who;

        out.print("Hankees and Socks scores?  ");
        hankees = keyboard.nextInt();
        socks = keyboard.nextInt();
        out.println();

        if (hankees > socks) {
            who = WhoWins.home;
            out.println("The Hankees win :-)");
        } else if (socks > hankees) {
            who = WhoWins.visitor;
            out.println("The Socks win :-(");
        } else {
            who = WhoWins.neither;
            out.println("It's a tie :-|");
        }

        out.println();
        out.println("""
                Today's game is brought to you by
                SnitSoft, the number one software
                vendor in the Hankeeville area.
                SnitSoft is featured proudly in
                Chapter 6. And remember, four out
                of five doctors recommend
                SnitSoft to their patients.""");
        out.println();

        if (who == WhoWins.home) {
            out.println("We beat 'em good. Didn't we?");
        }

        if (who == WhoWins.visitor) {
            out.println("The umpire made an unfair call.");
        }

        if (who == WhoWins.neither) {
            out.println("The game goes into extra innings.");
        }

        keyboard.close();
    }
}
