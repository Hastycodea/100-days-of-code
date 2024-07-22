package Day33;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Kimani", "Njoroge", "Dr.", "Philosophy", 45000);

        try(FileOutputStream fileOutput = new FileOutputStream("instructor.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOutput)){

            out.writeObject(instructor);
            System.out.println("Serialized data is saved in instructor.ser");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
