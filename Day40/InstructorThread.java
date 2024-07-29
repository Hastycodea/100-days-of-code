package Day40;

import java.io.File;
import java.util.Scanner;

public class InstructorThread implements Runnable{
    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(new File("Instructors.csv"));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);

                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       

    }
}
