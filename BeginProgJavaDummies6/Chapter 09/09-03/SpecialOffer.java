import java.util.Random;

public class SpecialOffer {

    public static void main(String[] args) {
        var myRandom = new Random();
        int randomNumber = myRandom.nextInt(10) + 1;

        if (randomNumber == 7) {
            System.out.println("An offer just for you!");
        }
        System.out.println(randomNumber);
    }
}
