import java.util.Random;

public class Day19 {
    public static void main(String[] args) {

        System.out.println("The generated random number: " +randomNumber());
        System.out.println("Random between to ints: " + randomTwoInt(1, 7));
    }

    public static int randomNumber() {
        Random rand = new Random();
        return rand.nextInt();
    }

    public static int randomTwoInt(int a, int b) {
        Random rand = new Random();

        // shows the the range (b - a)
        return rand.nextInt(b) + a;
    }
}
