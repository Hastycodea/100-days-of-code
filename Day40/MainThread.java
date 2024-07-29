package Day40;

import java.io.File;
import java.util.Scanner;

public class MainThread implements Runnable{

    private String filename;

    public MainThread(String filename) {
        this.filename = filename;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(new File(this.filename));
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
