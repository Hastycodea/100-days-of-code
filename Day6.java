import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        int numberInteger = Integer.valueOf(number);
        System.out.println("Your number as Integer: " + numberInteger);

        double numberDouble = Double.valueOf(number);
        System.out.println("Your number as Double value: " + numberDouble);

        int age = 5;
        // Integer to a string using valueOf()
        String ageString = String.valueOf(age);
        System.out.println("int age in String using valueOf(): " + ageString);

        // Integer to a string using toString()
        int marks = 80;
        String marksToString = Integer.toString(marks);
        System.out.println("int mark to String using toString(): " + marksToString);

    }
}
