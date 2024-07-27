package Day38;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter an integer: ");

            try {
                int number = Integer.parseInt(scanner.nextLine());
                int square = number * number;
                System.out.println("Square: "+ square);
                
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid integer: " + e.getMessage());

            }
            
    
        }

    }
}
