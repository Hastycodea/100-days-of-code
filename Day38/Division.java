package Day38;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter first number: ");
                int firstNumber = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter second number: ");
                int secondNumber = Integer.parseInt(scanner.nextLine());

                double division = (double) firstNumber / secondNumber;
                System.out.println("Division result: " + division);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero" );
            }
        }
    }
}
