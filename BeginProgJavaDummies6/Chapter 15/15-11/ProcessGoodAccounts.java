import java.util.Random;
import java.text.NumberFormat;

public class ProcessGoodAccounts {

    public static void main(String[] args) {
        var myRandom = new Random();
        var currency = NumberFormat.getCurrencyInstance();
        GoodAccount anAccount;
        double interestRate;
        double yearlyInterest;

        for (int i = 0; i < 3; i++) {
            anAccount = new GoodAccount();

            anAccount.lastName = "" +
                    (char) (myRandom.nextInt(26) + 'A') +
                    (char) (myRandom.nextInt(26) + 'a') +
                    (char) (myRandom.nextInt(26) + 'a');
            anAccount.id = myRandom.nextInt(10000);
            anAccount.balance = myRandom.nextInt(10000);

            anAccount.display();

            interestRate = myRandom.nextInt(5);
            yearlyInterest = anAccount.getInterest(interestRate);

            System.out.print("This year's interest is ");
            System.out.println(currency.format(yearlyInterest));
            System.out.println();
        }
    }
}
