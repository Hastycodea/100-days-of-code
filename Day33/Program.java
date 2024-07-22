package Day33;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Program {
    public static void main(String[] args) {
        Instructor instructor = new Instructor(null, null, null, null, 0);

        try (FileInputStream fileIn = new FileInputStream("instructor.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)){

             instructor = (Instructor) in.readObject();
        System.out.println(instructor.getLastName());


        } catch (IOException | ClassNotFoundException e) { 
            e.printStackTrace();
        }

    }
}
