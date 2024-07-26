package Day37;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> studentsDetails = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("students.csv"));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                studentsDetails.add(line);                
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("sorted");
        studentsDetails.stream().sorted().forEach(System.out::println);

    }
}
