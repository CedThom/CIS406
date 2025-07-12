import java.text.NumberFormat;

import static java.lang.System.out;

public class NiceAccount {
    String lastName;
    int id;
    double balance;

    void addInterest(double rate, int howManyYears) {
        for (int i = 1; i <= howManyYears; i++) {
            out.print("Adding ");
            out.print(rate);
            out.println(" percent...");

            balance += balance * (rate / 100.0);
        }
    }

    void display() {
        var currency = NumberFormat.getCurrencyInstance();

        out.print("The account with last name ");
        out.print(lastName);
        out.print(" and ID number ");
        out.print(id);
        out.print(" has balance ");
        out.println(currency.format(balance));
    }
}
