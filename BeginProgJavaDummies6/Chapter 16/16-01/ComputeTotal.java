import java.util.Scanner;

public class ComputeTotal {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        double unitPrice, total;
        int quantity;

        unitPrice = keyboard.nextDouble();
        quantity = keyboard.nextInt();

        total = unitPrice * quantity;

        System.out.println(total);

        keyboard.close();
    }
}
