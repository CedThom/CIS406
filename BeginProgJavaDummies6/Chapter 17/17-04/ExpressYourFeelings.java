import java.util.Scanner;

import static java.lang.System.out;

public class ExpressYourFeelings {

    public static void main(String[] args) {

        var keyboard = new Scanner(System.in);
        String month;
        int numberOfDays = 0;
        boolean isLeapYear;

        out.print("Which month? ");
        month = keyboard.next();

        out.println(switch (month) {
            case "January", "March", "May", "July",
                    "August", "October", "December" -> 31;
            case "April", "June", "September", "November" -> 30;
            case "February" -> {
                out.print("Leap year (true/false)? ");
                isLeapYear = keyboard.nextBoolean();
                if (isLeapYear) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default -> 0;
        } + " days");

        keyboard.close();
    }
}
