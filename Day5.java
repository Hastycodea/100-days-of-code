import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter a number to find sum up to that number: ");
        // int numberToSum = Integer.valueOf(scanner.nextLine());
        // System.out.print("Sum from 0 - " + numberToSum + ": " + sumZeroToNumber(numberToSum));
        // System.out.println();

        // System.out.print("Enter age: ");
        // int age = Integer.valueOf(scanner.nextLine());

        // System.out.print("Years before: ");
        // int years = Integer.valueOf(scanner.nextLine());

        // System.out.print("Your age " + years + " years ago: " + yourAgeAgo(age, years));
        // System.out.println();

        // System.out.print("Enter a number to print in reverse: ");
        // int reverseNumber = Integer.valueOf(scanner.nextLine());
        // printNumbersReverse(reverseNumber);
        int result = factorial(3);
        System.out.println(result);

        compoundOperators(5, 2);

    }

    public static int sumZeroToNumber(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static int yourAgeAgo(int age, int yearsBefore) {
        return age - yearsBefore;
    }

    public static void printNumbersReverse(int number) {
        for(int i = number; i >= 0; i--) {
            System.out.print(i);
            
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }

    public static int factorial(int number) {
        int factorial = 1;
        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void compoundOperators(int number1, int number2) {
        // number1 -= number2;
        // System.out.println("number1 -= number2, number1 = " + number1);

        number1 /= number2;
        System.out.println("number1 /= number2, number1 = " + number1);

        number1 %= number2;
        System.out.println("number1 %= number2, number1 = " + number1);
    }


}
