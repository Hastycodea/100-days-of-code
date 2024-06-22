import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Marks: ");
        int marks = Integer.valueOf(scanner.nextLine());

        System.out.print("Year: ");
        double year = Double.valueOf(scanner.nextLine());
    }
}
