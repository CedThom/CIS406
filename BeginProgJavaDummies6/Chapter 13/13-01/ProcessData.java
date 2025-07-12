import java.util.Scanner;

public class ProcessData {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        double unitPrice;
        int quantity;
        boolean taxable;

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

        System.out.print("Total: ");
        System.out.println(total);

        keyboard.close();
    }
}
