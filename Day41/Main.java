package Day41;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Enter a string: ");
                String input = scanner.nextLine();
    
                String email = "([a-z]+||[0-9]+||([a-z]+)([0-9]+))(@)[a-z]+(.)[a-z]+";
    
                // corrected email denoted as => emailTrue
    
                String emailTrue = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    
                if (input.matches(emailTrue)) {
                    System.out.println("The entered email is corect");
                } else {
                    System.out.println("The email entered is incorrect");
                }
            }
     
    }
}

