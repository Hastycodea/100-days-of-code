package Day36;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // using Paths.get
        try(Scanner scanner = new Scanner(Paths.get("data.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // System.out.println(line);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // using File
        try {
            File file = new File("data.csv");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // System.out.println(line);
            }

            if (file.exists()) {
                // System.out.println(file.getAbsolutePath());
            }
                
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // using FileReader
        try {
            FileReader file = new FileReader("data.csv");
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()) {
                String line = scan.nextLine();
                // System.out.println(line);
            }
            
        } catch (Exception e) {
            // System.out.println("Error: " + e.getMessage());
        }

        // writing to a file using FileWriter
        try {
            FileWriter file = new FileWriter("andreh.txt");
            file.write("Andreh is the goat of dynamic programming \n");
            file.write("My consistency will pay, the goal is to build");
            file.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        
    }
}
