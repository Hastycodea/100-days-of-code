import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        System.out.println("Odd or Even");
        oddOrEven();
        System.out.println("----------");
        System.out.println("Largest among them");
        largestOfThree();
        System.out.println("----------");
        System.out.println("Leap Year or Not");
        leapYearOrNot();
    }

    public static void oddOrEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number: ");
        int number = Integer.valueOf(scanner.nextLine());

        if (number % 2 == 0) {
            System.out.println(number + " is Even!");
        } else {
            System.out.println(number + " is Odd!");
        }
    }

    public static void largestOfThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter second number: ");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter third number: ");
        int thirdNumber = Integer.valueOf(scanner.nextLine());

        int max = firstNumber;
        while (true) {
            if (firstNumber == secondNumber && firstNumber == thirdNumber) {
                System.out.println("The numbers are Equal!");
                break;
            }

            if (secondNumber > max) {
                max = secondNumber;
            } else if (thirdNumber > max) {
                max = thirdNumber;
            }
            System.out.println("The largest number is: " + max);
            break;

        }
    }

    public static void leapYearOrNot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = Integer.valueOf(scanner.nextLine());

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) {
        System.out.println(year + " is a Leap Year!");
        } else {
        System.out.println(year + " is not a Leap Year!");
        }

        // if (year % 4 == 0) {
        //     if (year % 100 == 0) {
        //         if (year % 400 == 0) {
        //             System.out.println(year + " is a Leap Year!");
        //         } else {
        //             System.out.println(year + " is not a Leap Year!");
        //         }
        //     } else {
        //         System.out.println(year + " is a Leap Year!");
        //     }
        // } else {
        //     System.out.println(year + " is not a Leap Year!");
        // }
    }

}
