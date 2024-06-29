import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = Integer.valueOf(scanner.nextLine());

        // forLoop(number);
        // whileLoop(number);
        doWhileLoop(number);

    }

    public static void forLoop(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("For Loop sum: " + sum);
    }

    public static void whileLoop(int number) {
        int sum = 0;
        int i = 1;
        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println("While loop sum: " + sum);
    }

    public static void doWhileLoop(int number) {
        int sum = 0;
        int i = 1;

        do {
            sum += i;
            i++;
        } while (i <= number);
        System.out.println("Do while loop sum: " + sum);

    }
}
