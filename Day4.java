import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        double division = a * 1.0 / b;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length (integer): ");
        double length = Double.valueOf(scanner.nextLine());

        System.out.print("Input width (integer): ");
        double width = Double.valueOf(scanner.nextLine());

        double area = length * width;
        String twoDpArea = String.format("%.2f", area);
        System.out.print("Area = " + twoDpArea);
    }
}
