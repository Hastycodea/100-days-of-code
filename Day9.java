import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (percentage): ");
        int marks = Integer.valueOf(scanner.nextLine());
        int letterGrade = marks / 10;
        String marksGrade = "";

        switch (letterGrade) {
            case 10:
            case 9:
            case 8:
                marksGrade = "A";
                break;
            
            case 7:
                marksGrade = "B";
                break;
            
            case 6:
                marksGrade = "C";
                break;

            case 5:
                marksGrade = "D";
                break;

            case 4:
            case 3:
            case 2:
            case 1:
                marksGrade = "F";

                break;

            default:
                break;
        }

        System.out.println("You've scored: " + marksGrade);
    }
}
