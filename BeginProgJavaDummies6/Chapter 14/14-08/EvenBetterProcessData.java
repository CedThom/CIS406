import java.text.NumberFormat;

import java.util.Locale;
import java.util.Scanner;

public class EvenBetterProcessData {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.FRANCE);

        double unitPrice;
        int quantity;
        boolean taxable;

        var currency = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.print("Unit price: ");
        unitPrice = keyboard.nextDouble();
        System.out.print("Quantity: ");
        quantity = keyboard.nextInt();
        System.out.print("Taxable? (true/false) ");
        taxable = keyboard.nextBoolean();

        double total = unitPrice * quantity;
        if (taxable) {
            total = total * 1.05;
        }

        String niceTotal = currency.format(total);
        System.out.print("Total: ");
        System.out.println(niceTotal);

        keyboard.close();
    }
}
